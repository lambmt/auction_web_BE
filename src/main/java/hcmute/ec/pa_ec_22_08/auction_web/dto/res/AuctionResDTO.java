package hcmute.ec.pa_ec_22_08.auction_web.dto.res;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.AuctionStatus;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Category;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class AuctionResDTO {
    private Long auctionId;
    private String productName;
    private String seller;
    private Category category;
    private BigDecimal currentPrice;
    private String mainImage;
    private LocalDateTime startTime;
    private LocalDateTime finishTime;
    private AuctionStatus auctionStatus;

}
