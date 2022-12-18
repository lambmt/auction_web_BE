package hcmute.ec.pa_ec_22_08.auction_web.mapper;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.AuctionReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Auction;
import org.mapstruct.Mapper;

@Mapper
public interface AuctionMapper extends EntityMapper<AuctionReqDTO, Auction> {
    Auction toEntity(AuctionReqDTO auctionReqDTO);
}
