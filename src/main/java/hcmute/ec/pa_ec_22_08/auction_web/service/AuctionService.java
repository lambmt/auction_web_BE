package hcmute.ec.pa_ec_22_08.auction_web.service;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.AuctionReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Auction;

public interface AuctionService {
    Auction createAuction(AuctionReqDTO auctionReqDTO);

}
