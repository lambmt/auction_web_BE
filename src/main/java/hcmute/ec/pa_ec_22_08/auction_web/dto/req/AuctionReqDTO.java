package hcmute.ec.pa_ec_22_08.auction_web.dto.req;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Category;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.State;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class AuctionReqDTO {
    private Long auctionId;
    private String productName;
    private String seller;
    private Category category;
    private BigDecimal price;
    private List<String> images;
    private State state;
    private int numOfDayAuction;
    private BigDecimal startPrice;
    private BigDecimal stepPrice;
    private boolean isCreated;
}
