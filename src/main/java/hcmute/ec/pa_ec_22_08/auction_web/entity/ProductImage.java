package hcmute.ec.pa_ec_22_08.auction_web.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "product_image")
@Getter
@Setter
public class ProductImage {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "product_image_id")
    private Long productImageId;

    private Long productId;

    private String imageUrl;
}
