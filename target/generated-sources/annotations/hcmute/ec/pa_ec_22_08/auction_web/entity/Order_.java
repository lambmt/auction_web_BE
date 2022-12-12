package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.OrderStatus;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Order.class)
public abstract class Order_ extends hcmute.ec.pa_ec_22_08.auction_web.entity.AbstractAuditingEntity_ {

	public static volatile SingularAttribute<Order, Boolean> delFrag;
	public static volatile SingularAttribute<Order, Product> product;
	public static volatile SingularAttribute<Order, String> address;
	public static volatile SingularAttribute<Order, String> receiver;
	public static volatile SingularAttribute<Order, BigDecimal> totalBill;
	public static volatile SingularAttribute<Order, Long> orderId;
	public static volatile SingularAttribute<Order, String> sender;
	public static volatile SingularAttribute<Order, OrderStatus> orderStatus;

	public static final String DEL_FRAG = "delFrag";
	public static final String PRODUCT = "product";
	public static final String ADDRESS = "address";
	public static final String RECEIVER = "receiver";
	public static final String TOTAL_BILL = "totalBill";
	public static final String ORDER_ID = "orderId";
	public static final String SENDER = "sender";
	public static final String ORDER_STATUS = "orderStatus";

}

