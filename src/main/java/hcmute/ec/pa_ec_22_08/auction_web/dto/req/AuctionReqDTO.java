package hcmute.ec.pa_ec_22_08.auction_web.dto.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class AuctionReqDTO {
    private Long productId;
    private Long categoryId;
    private String username;
    private LocalDateTime startTime;
    private LocalDateTime finishTime;
    private BigDecimal startPrice;
    private boolean isCreated;
}
