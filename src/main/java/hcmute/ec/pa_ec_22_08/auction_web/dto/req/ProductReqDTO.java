package hcmute.ec.pa_ec_22_08.auction_web.dto.req;

import hcmute.ec.pa_ec_22_08.auction_web.entity.Category;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ProductReqDTO {
    private Long productId;
    private String productName;
    private Category category;
    private int quantity;
    private String username;
    private List<String> images;
    private boolean isCreated;
}
