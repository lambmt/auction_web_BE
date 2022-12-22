package hcmute.ec.pa_ec_22_08.auction_web.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Password.class)
public abstract class Password_ {

	public static volatile SingularAttribute<Password, User> userPassword;
	public static volatile SingularAttribute<Password, String> password;
	public static volatile SingularAttribute<Password, LocalDateTime> createdDate;
	public static volatile SingularAttribute<Password, String> updatedBy;
	public static volatile SingularAttribute<Password, String> createdBy;
	public static volatile SingularAttribute<Password, Long> id;
	public static volatile SingularAttribute<Password, LocalDateTime> updatedDate;
	public static volatile SingularAttribute<Password, String> username;

	public static final String USER_PASSWORD = "userPassword";
	public static final String PASSWORD = "password";
	public static final String CREATED_DATE = "createdDate";
	public static final String UPDATED_BY = "updatedBy";
	public static final String CREATED_BY = "createdBy";
	public static final String ID = "id";
	public static final String UPDATED_DATE = "updatedDate";
	public static final String USERNAME = "username";

}

