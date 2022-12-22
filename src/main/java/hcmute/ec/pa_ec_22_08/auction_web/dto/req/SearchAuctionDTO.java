package hcmute.ec.pa_ec_22_08.auction_web.dto.req;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Category;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class SearchAuctionDTO {
    private String keyword;
    private Category category;
    private BigDecimal priceFrom;
    private BigDecimal priceTo;
}
