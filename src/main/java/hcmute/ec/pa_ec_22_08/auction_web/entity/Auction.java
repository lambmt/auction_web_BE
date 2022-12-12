package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.AuctionStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "auction")
@Getter
@Setter
public class Auction extends AbstractAuditingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long auctionId;

    private String sellerId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private String categoryId;
    private LocalDateTime startTime;
    private LocalDateTime finishTime;
    private BigDecimal startPrice;
    private BigDecimal endPrice;
    private AuctionStatus auctionStatus;
    private boolean delFrag;
}
