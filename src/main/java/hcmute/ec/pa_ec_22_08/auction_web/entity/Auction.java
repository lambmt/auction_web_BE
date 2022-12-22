package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.AuctionStatus;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Category;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.State;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "auction")
@Getter
@Setter
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;
    private Category category;
    private BigDecimal price;
    private State state;

    @OneToMany(mappedBy = "auctionImages")
    private List<ProductImage> productImages;

    @OneToOne(mappedBy = "auctionOrder")
    private OrderProduct orderProduct;

    @OneToMany(mappedBy = "auctionHistory")
    private AuctionHistory auctionHistory;

    private LocalDateTime startTime;
    private LocalDateTime finishTime;
    private int numOfDayAuction;
    private BigDecimal startPrice;
    private BigDecimal endPrice;
    private BigDecimal stepPrice;
    private AuctionStatus auctionStatus;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime updatedDate;
    private String updatedBy;

    private boolean delFrag = false;

}
