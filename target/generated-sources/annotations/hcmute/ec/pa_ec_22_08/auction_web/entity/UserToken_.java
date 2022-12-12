package hcmute.ec.pa_ec_22_08.auction_web.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserToken.class)
public abstract class UserToken_ extends hcmute.ec.pa_ec_22_08.auction_web.entity.AbstractAuditingEntity_ {

	public static volatile SingularAttribute<UserToken, Long> id;
	public static volatile SingularAttribute<UserToken, String> userId;
	public static volatile SingularAttribute<UserToken, String> token;
	public static volatile SingularAttribute<UserToken, String> refreshToken;

	public static final String ID = "id";
	public static final String USER_ID = "userId";
	public static final String TOKEN = "token";
	public static final String REFRESH_TOKEN = "refreshToken";

}

