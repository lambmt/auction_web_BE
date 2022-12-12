package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Gender;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Role;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ extends hcmute.ec.pa_ec_22_08.auction_web.entity.AbstractAuditingEntity_ {

	public static volatile SingularAttribute<User, String> lastName;
	public static volatile SingularAttribute<User, Boolean> delFrag;
	public static volatile SingularAttribute<User, String> address;
	public static volatile SingularAttribute<User, Role> role;
	public static volatile SingularAttribute<User, Gender> gender;
	public static volatile SingularAttribute<User, String> avatarUrl;
	public static volatile SingularAttribute<User, Boolean> isActive;
	public static volatile SingularAttribute<User, String> phoneNo;
	public static volatile ListAttribute<User, Product> products;
	public static volatile SingularAttribute<User, String> firstName;
	public static volatile SingularAttribute<User, Password> password;
	public static volatile SingularAttribute<User, Date> dayOfBirth;
	public static volatile SingularAttribute<User, Long> id;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> username;

	public static final String LAST_NAME = "lastName";
	public static final String DEL_FRAG = "delFrag";
	public static final String ADDRESS = "address";
	public static final String ROLE = "role";
	public static final String GENDER = "gender";
	public static final String AVATAR_URL = "avatarUrl";
	public static final String IS_ACTIVE = "isActive";
	public static final String PHONE_NO = "phoneNo";
	public static final String PRODUCTS = "products";
	public static final String FIRST_NAME = "firstName";
	public static final String PASSWORD = "password";
	public static final String DAY_OF_BIRTH = "dayOfBirth";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String USERNAME = "username";

}

