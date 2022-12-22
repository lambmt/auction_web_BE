package hcmute.ec.pa_ec_22_08.auction_web.service.impl;

import hcmute.ec.pa_ec_22_08.auction_web.constant.MessageConstant;
import hcmute.ec.pa_ec_22_08.auction_web.dto.req.AuctionReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.req.BidAuctionReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.req.SearchAuctionDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.res.AuctionResDTO;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Auction;
import hcmute.ec.pa_ec_22_08.auction_web.entity.AuctionHistory;
import hcmute.ec.pa_ec_22_08.auction_web.entity.ProductImage;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.AuctionStatus;
import hcmute.ec.pa_ec_22_08.auction_web.repository.AuctionHistoryRepository;
import hcmute.ec.pa_ec_22_08.auction_web.repository.AuctionRepository;
import hcmute.ec.pa_ec_22_08.auction_web.repository.ProductImageRepository;
import hcmute.ec.pa_ec_22_08.auction_web.repository.UserRepository;
import hcmute.ec.pa_ec_22_08.auction_web.service.AuctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class AuctionServiceImpl implements AuctionService {
    Logger log = LoggerFactory.getLogger(AuctionServiceImpl.class);

    private final AuctionRepository auctionRepository;
    private final ProductImageRepository productImageRepository;
    private final UserRepository userRepository;
    private final AuctionHistoryRepository auctionHistoryRepository;

    public AuctionServiceImpl(AuctionRepository auctionRepository,
                              ProductImageRepository productImageRepository,
                              UserRepository userRepository,
                              AuctionHistoryRepository auctionHistoryRepository) {
        this.auctionRepository = auctionRepository;
        this.productImageRepository = productImageRepository;
        this.userRepository = userRepository;
        this.auctionHistoryRepository = auctionHistoryRepository;
    }

    @Override
    public Auction createAuction(AuctionReqDTO auctionReqDTO) {
        if (auctionReqDTO.isCreated()) {
            Auction auction = new Auction();
            auction.setProductName(auctionReqDTO.getProductName());
            auction.setCategory(auctionReqDTO.getCategory());
            auction.setSeller(userRepository.findByUsername(auctionReqDTO.getSeller()).get());
            auction.setNumOfDayAuction(auctionReqDTO.getNumOfDayAuction());
            auction.setEndPrice(auctionReqDTO.getStartPrice());
            auction.setStepPrice(auctionReqDTO.getStepPrice());
            auction.setAuctionStatus(AuctionStatus.WAITING_FOR_APPROVE);
            List<ProductImage> productImages = new ArrayList<>();
            auctionReqDTO.getImages().forEach(image -> {
                ProductImage productImage = new ProductImage();
                productImage.setImageUrl(image);
                productImages.add(productImage);
            });
            auction.setProductImages(productImages);
            auctionRepository.save(auction);

            return auction;
        } else {
            Optional<Auction> otp = auctionRepository.findById(auctionReqDTO.getAuctionId());
            if (otp.isPresent() && !otp.get().isDelFrag()) {
                Auction existedAuction = otp.get();
                if (!existedAuction.getAuctionStatus().equals(AuctionStatus.ON_AUCTION)) {
                    existedAuction.setProductName(auctionReqDTO.getProductName());
                    existedAuction.setStartPrice(auctionReqDTO.getStartPrice());
                    existedAuction.setEndPrice(null);
                    existedAuction.setStepPrice(auctionReqDTO.getStepPrice());
                    existedAuction.setStartTime(null);
                    existedAuction.setFinishTime(null);
                    existedAuction.setNumOfDayAuction(auctionReqDTO.getNumOfDayAuction());
                    existedAuction.setAuctionStatus(AuctionStatus.WAITING_FOR_APPROVE);
                    auctionRepository.save(existedAuction);
                    return existedAuction;
                }
            }
        }
        return null;
    }

    @Override
    public List<AuctionResDTO> getListLatestAuction() {
        List<AuctionResDTO> auctionResDTOS = new ArrayList<>();
        List<Auction> auctions = auctionRepository.findByAuctionStatus(AuctionStatus.ON_AUCTION);
        if (auctions.size() > 0) {
            auctions.sort(Comparator.comparing(Auction::getStartTime).reversed());
            auctions.forEach(auction -> {
                AuctionResDTO auctionResDTO = new AuctionResDTO();
                auctionResDTO.setAuctionId(auction.getId());
                auctionResDTO.setProductName(auction.getProductName());
                auctionResDTO.setSeller(auction.getSeller().getUsername());
                auctionResDTO.setCategory(auction.getCategory());
                auctionResDTO.setCurrentPrice(auction.getEndPrice());
                Optional<ProductImage> productImage = productImageRepository.findFirstById(auction.getId());
                if (productImage.isPresent()) {
                    auctionResDTO.setMainImage(productImage.get().getImageUrl());
                } else auctionResDTO.setMainImage(null);
                auctionResDTO.setStartTime(auction.getStartTime());
                auctionResDTO.setFinishTime(auction.getFinishTime());
                auctionResDTO.setAuctionStatus(auction.getAuctionStatus());

                auctionResDTOS.add(auctionResDTO);
            });
        }
        return auctionResDTOS;
    }

    @Override
    public List<AuctionResDTO> getListAllAuction(SearchAuctionDTO searchAuctionDTO) {
        List<AuctionResDTO> auctionResDTOS = new ArrayList<>();
        if (searchAuctionDTO.getKeyword() == null
                && searchAuctionDTO.getCategory() ==null
                && searchAuctionDTO.getPriceFrom() ==null
                && searchAuctionDTO.getPriceTo() ==null) {
            List<Auction> auctions = auctionRepository.findAll();
            auctions.sort(Comparator.comparing(Auction::getStartTime).reversed());
        }
        return null;
    }

    @Override
    public Auction viewDetailAuction(Long auctionId) {
        Optional<Auction> auctionOtp = auctionRepository.findById(auctionId);
        return auctionOtp.orElse(null);
    }

    @Override
    public Auction bidAuction(BidAuctionReqDTO bidAuctionReqDTO) throws Exception {
        Optional<Auction> auctionOtp = auctionRepository.findById(bidAuctionReqDTO.getAuctionId());
        if (auctionOtp.isPresent()) {
            Auction auction = auctionOtp.get();
            BigDecimal currentPrice = auction.getEndPrice();
            LocalDateTime now = LocalDateTime.now();
            if (now.isAfter(auction.getFinishTime())) {
                if (currentPrice.compareTo(bidAuctionReqDTO.getPrice()) < 0) {
                    auction.setEndPrice(bidAuctionReqDTO.getPrice());
                    AuctionHistory auctionHistory = new AuctionHistory();
                    auctionHistory.setAuction(auction);
                    auctionHistory.setPrice(bidAuctionReqDTO.getPrice());
                    auctionHistory.setBuyerName(bidAuctionReqDTO.getUsername());
                    auctionHistory.setCreatedDate(now);
                    auctionHistory.setCreatedBy(bidAuctionReqDTO.getUsername());
                    auctionHistory.setUpdatedDate(now);
                    auctionHistory.setUpdatedBy(bidAuctionReqDTO.getUsername());

                    auctionHistoryRepository.save(auctionHistory);
                } else throw new Exception("Price must be more than current");
            } else throw new Exception("Auction is closed");

        } else throw new Exception(MessageConstant.ENTITY_NOT_FOUND);
        return null;
    }
}
