package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.AuctionStatus;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Category;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.State;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Auction.class)
public abstract class Auction_ {

	public static volatile SingularAttribute<Auction, User> seller;
	public static volatile SingularAttribute<Auction, BigDecimal> startPrice;
	public static volatile SingularAttribute<Auction, Boolean> delFrag;
	public static volatile SingularAttribute<Auction, LocalDateTime> finishTime;
	public static volatile SingularAttribute<Auction, String> updatedBy;
	public static volatile SingularAttribute<Auction, Integer> numOfDayAuction;
	public static volatile SingularAttribute<Auction, BigDecimal> stepPrice;
	public static volatile SingularAttribute<Auction, BigDecimal> endPrice;
	public static volatile SingularAttribute<Auction, LocalDateTime> updatedDate;
	public static volatile SingularAttribute<Auction, String> productName;
	public static volatile ListAttribute<Auction, ProductImage> productImages;
	public static volatile SingularAttribute<Auction, LocalDateTime> createdDate;
	public static volatile SingularAttribute<Auction, String> createdBy;
	public static volatile SingularAttribute<Auction, BigDecimal> price;
	public static volatile SingularAttribute<Auction, AuctionStatus> auctionStatus;
	public static volatile SingularAttribute<Auction, LocalDateTime> startTime;
	public static volatile SingularAttribute<Auction, Long> id;
	public static volatile SingularAttribute<Auction, State> state;
	public static volatile SingularAttribute<Auction, OrderProduct> orderProduct;
	public static volatile SingularAttribute<Auction, Category> category;

	public static final String SELLER = "seller";
	public static final String START_PRICE = "startPrice";
	public static final String DEL_FRAG = "delFrag";
	public static final String FINISH_TIME = "finishTime";
	public static final String UPDATED_BY = "updatedBy";
	public static final String NUM_OF_DAY_AUCTION = "numOfDayAuction";
	public static final String STEP_PRICE = "stepPrice";
	public static final String END_PRICE = "endPrice";
	public static final String UPDATED_DATE = "updatedDate";
	public static final String PRODUCT_NAME = "productName";
	public static final String PRODUCT_IMAGES = "productImages";
	public static final String CREATED_DATE = "createdDate";
	public static final String CREATED_BY = "createdBy";
	public static final String PRICE = "price";
	public static final String AUCTION_STATUS = "auctionStatus";
	public static final String START_TIME = "startTime";
	public static final String ID = "id";
	public static final String STATE = "state";
	public static final String ORDER_PRODUCT = "orderProduct";
	public static final String CATEGORY = "category";

}

