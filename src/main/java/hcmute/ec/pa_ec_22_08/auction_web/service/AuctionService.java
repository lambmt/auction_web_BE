package hcmute.ec.pa_ec_22_08.auction_web.service;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.AuctionReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.req.BidAuctionReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.req.SearchAuctionDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.res.AuctionResDTO;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Auction;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.util.List;

public interface AuctionService {
    Auction createAuction(AuctionReqDTO auctionReqDTO);

    List<AuctionResDTO> getListLatestAuction();

    List<AuctionResDTO> getListAllAuction(SearchAuctionDTO searchAuctionDTO);

    Auction viewDetailAuction(Long auctionId);

    Auction bidAuction(BidAuctionReqDTO bidAuctionReqDTO) throws Exception;

}
