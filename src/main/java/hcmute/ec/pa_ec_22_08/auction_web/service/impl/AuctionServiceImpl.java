package hcmute.ec.pa_ec_22_08.auction_web.service.impl;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.AuctionReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Auction;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Product;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.AuctionStatus;
import hcmute.ec.pa_ec_22_08.auction_web.repository.AuctionRepository;
import hcmute.ec.pa_ec_22_08.auction_web.repository.ProductRepository;
import hcmute.ec.pa_ec_22_08.auction_web.service.AuctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuctionServiceImpl implements AuctionService {
    Logger log = LoggerFactory.getLogger(AuctionServiceImpl.class);

    private final AuctionRepository auctionRepository;
    private final ProductRepository productRepository;

    public AuctionServiceImpl(AuctionRepository auctionRepository,
                              ProductRepository productRepository) {
        this.auctionRepository = auctionRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Auction createAuction(AuctionReqDTO auctionReqDTO) {
        if (auctionReqDTO.isCreated()) {
            Auction auction = new Auction();
            auction.setProduct(productRepository.findById(auctionReqDTO.getProductId()).get());
            auction.setCategoryId(auctionReqDTO.getCategoryId());
            auction.setSellerId(auctionReqDTO.getUsername());
            auction.setStartTime(auctionReqDTO.getStartTime());
            auction.setFinishTime(auctionReqDTO.getFinishTime());
            auction.setEndPrice(auction.getStartPrice());
            auction.setAuctionStatus(AuctionStatus.WAITING_FOR_APPROVE);
            auctionRepository.save(auction);
            return auction;
        } else {
            Product product = productRepository.findById(auctionReqDTO.getProductId()).get();
            Optional<Auction> otp = auctionRepository.findByProduct(product);
            if (otp.isPresent() && !otp.get().isDelFrag()) {
                Auction existedAuction = otp.get();
                if (!existedAuction.getAuctionStatus().equals(AuctionStatus.ON_AUCTION)) {
                    existedAuction.setStartPrice(auctionReqDTO.getStartPrice());
                    existedAuction.setEndPrice(auctionReqDTO.getStartPrice());
                    existedAuction.setStartTime(auctionReqDTO.getStartTime());
                    existedAuction.setFinishTime(auctionReqDTO.getFinishTime());
                    existedAuction.setAuctionStatus(AuctionStatus.WAITING_FOR_APPROVE);
                    auctionRepository.save(existedAuction);
                    return existedAuction;
                }
            }
        }
        return null;
    }
}
