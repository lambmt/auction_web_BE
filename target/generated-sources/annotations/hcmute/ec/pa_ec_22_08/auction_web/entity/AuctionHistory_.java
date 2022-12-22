package hcmute.ec.pa_ec_22_08.auction_web.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AuctionHistory.class)
public abstract class AuctionHistory_ {

	public static volatile SingularAttribute<AuctionHistory, LocalDateTime> createdDate;
	public static volatile SingularAttribute<AuctionHistory, String> updatedBy;
	public static volatile SingularAttribute<AuctionHistory, String> createdBy;
	public static volatile SingularAttribute<AuctionHistory, BigDecimal> price;
	public static volatile SingularAttribute<AuctionHistory, Long> id;
	public static volatile SingularAttribute<AuctionHistory, LocalDateTime> updatedDate;
	public static volatile SingularAttribute<AuctionHistory, String> buyerId;
	public static volatile SingularAttribute<AuctionHistory, Auction> auction;

	public static final String CREATED_DATE = "createdDate";
	public static final String UPDATED_BY = "updatedBy";
	public static final String CREATED_BY = "createdBy";
	public static final String PRICE = "price";
	public static final String ID = "id";
	public static final String UPDATED_DATE = "updatedDate";
	public static final String BUYER_ID = "buyerId";
	public static final String AUCTION = "auction";

}

