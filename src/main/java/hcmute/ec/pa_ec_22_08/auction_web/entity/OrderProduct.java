package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_product")
@Getter
@Setter
@ToString
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "auction_id")
    private Auction auctionOrder;

    private String sender;
    private String receiver;
    private BigDecimal totalBill;
    private String address;
    private OrderStatus orderStatus;
    private boolean delFrag;
}
