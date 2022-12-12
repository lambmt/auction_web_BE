package hcmute.ec.pa_ec_22_08.auction_web.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AuctionHistory.class)
public abstract class AuctionHistory_ {

	public static volatile SingularAttribute<AuctionHistory, BigDecimal> price;
	public static volatile SingularAttribute<AuctionHistory, Long> id;
	public static volatile SingularAttribute<AuctionHistory, String> buyerId;

	public static final String PRICE = "price";
	public static final String ID = "id";
	public static final String BUYER_ID = "buyerId";

}

