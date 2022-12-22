package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.OrderStatus;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderProduct.class)
public abstract class OrderProduct_ {

	public static volatile SingularAttribute<OrderProduct, Boolean> delFrag;
	public static volatile SingularAttribute<OrderProduct, String> address;
	public static volatile SingularAttribute<OrderProduct, String> receiver;
	public static volatile SingularAttribute<OrderProduct, BigDecimal> totalBill;
	public static volatile SingularAttribute<OrderProduct, String> sender;
	public static volatile SingularAttribute<OrderProduct, OrderStatus> orderStatus;
	public static volatile SingularAttribute<OrderProduct, Auction> auctionOrder;
	public static volatile SingularAttribute<OrderProduct, Long> id;

	public static final String DEL_FRAG = "delFrag";
	public static final String ADDRESS = "address";
	public static final String RECEIVER = "receiver";
	public static final String TOTAL_BILL = "totalBill";
	public static final String SENDER = "sender";
	public static final String ORDER_STATUS = "orderStatus";
	public static final String AUCTION_ORDER = "auctionOrder";
	public static final String ID = "id";

}

