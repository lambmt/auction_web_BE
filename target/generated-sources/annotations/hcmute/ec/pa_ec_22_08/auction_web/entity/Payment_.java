package hcmute.ec.pa_ec_22_08.auction_web.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Payment.class)
public abstract class Payment_ extends hcmute.ec.pa_ec_22_08.auction_web.entity.AbstractAuditingEntity_ {

	public static volatile SingularAttribute<Payment, String> walletId;
	public static volatile SingularAttribute<Payment, Long> paymentId;
	public static volatile SingularAttribute<Payment, BigDecimal> credit;
	public static volatile SingularAttribute<Payment, Boolean> isActive;
	public static volatile SingularAttribute<Payment, User> user;

	public static final String WALLET_ID = "walletId";
	public static final String PAYMENT_ID = "paymentId";
	public static final String CREDIT = "credit";
	public static final String IS_ACTIVE = "isActive";
	public static final String USER = "user";

}

