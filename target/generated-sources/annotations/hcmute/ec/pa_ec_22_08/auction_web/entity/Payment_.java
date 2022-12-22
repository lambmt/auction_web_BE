package hcmute.ec.pa_ec_22_08.auction_web.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Payment.class)
public abstract class Payment_ {

	public static volatile SingularAttribute<Payment, String> walletId;
	public static volatile SingularAttribute<Payment, LocalDateTime> createdDate;
	public static volatile SingularAttribute<Payment, String> updatedBy;
	public static volatile SingularAttribute<Payment, User> userPayment;
	public static volatile SingularAttribute<Payment, String> createdBy;
	public static volatile SingularAttribute<Payment, Long> id;
	public static volatile SingularAttribute<Payment, LocalDateTime> updatedDate;
	public static volatile SingularAttribute<Payment, BigDecimal> credit;
	public static volatile SingularAttribute<Payment, Boolean> isActive;

	public static final String WALLET_ID = "walletId";
	public static final String CREATED_DATE = "createdDate";
	public static final String UPDATED_BY = "updatedBy";
	public static final String USER_PAYMENT = "userPayment";
	public static final String CREATED_BY = "createdBy";
	public static final String ID = "id";
	public static final String UPDATED_DATE = "updatedDate";
	public static final String CREDIT = "credit";
	public static final String IS_ACTIVE = "isActive";

}

