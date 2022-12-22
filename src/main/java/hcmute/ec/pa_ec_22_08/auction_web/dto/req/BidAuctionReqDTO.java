package hcmute.ec.pa_ec_22_08.auction_web.dto.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class BidAuctionReqDTO {
    private Long auctionId;
    private BigDecimal price;
    private String username;
}
