package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.AuctionStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Auction.class)
public abstract class Auction_ extends hcmute.ec.pa_ec_22_08.auction_web.entity.AbstractAuditingEntity_ {

	public static volatile SingularAttribute<Auction, BigDecimal> startPrice;
	public static volatile SingularAttribute<Auction, Boolean> delFrag;
	public static volatile SingularAttribute<Auction, Product> product;
	public static volatile SingularAttribute<Auction, LocalDateTime> finishTime;
	public static volatile SingularAttribute<Auction, String> sellerId;
	public static volatile SingularAttribute<Auction, AuctionStatus> auctionStatus;
	public static volatile SingularAttribute<Auction, LocalDateTime> startTime;
	public static volatile SingularAttribute<Auction, Long> id;
	public static volatile SingularAttribute<Auction, BigDecimal> endPrice;
	public static volatile SingularAttribute<Auction, Long> categoryId;

	public static final String START_PRICE = "startPrice";
	public static final String DEL_FRAG = "delFrag";
	public static final String PRODUCT = "product";
	public static final String FINISH_TIME = "finishTime";
	public static final String SELLER_ID = "sellerId";
	public static final String AUCTION_STATUS = "auctionStatus";
	public static final String START_TIME = "startTime";
	public static final String ID = "id";
	public static final String END_PRICE = "endPrice";
	public static final String CATEGORY_ID = "categoryId";

}

