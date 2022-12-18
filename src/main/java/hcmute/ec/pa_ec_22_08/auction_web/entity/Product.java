package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.ProductStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
@ToString
public class Product extends AbstractAuditingEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "product_id")
    private Long productId;

    private String productName;
    private Category category;
    private BigDecimal price;
    private int quantity;
    private String username;
    private List<ProductImage> productImages;
    private ProductStatus productStatus;
    private boolean delFrag;
}
