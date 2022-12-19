package hcmute.ec.pa_ec_22_08.auction_web.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "auction")
@Getter
@Setter
public class AuctionHistory{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String buyerId;
    @ManyToOne
    @JoinColumn(name = "auction_id")
    private Auction auction;
    private BigDecimal price;
}
