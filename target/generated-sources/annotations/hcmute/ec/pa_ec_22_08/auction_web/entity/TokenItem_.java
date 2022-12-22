package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Role;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TokenItem.class)
public abstract class TokenItem_ {

	public static volatile SingularAttribute<TokenItem, Role> role;
	public static volatile SingularAttribute<TokenItem, LocalDateTime> createdDate;
	public static volatile SingularAttribute<TokenItem, String> updatedBy;
	public static volatile SingularAttribute<TokenItem, String> createdBy;
	public static volatile SingularAttribute<TokenItem, Long> id;
	public static volatile SingularAttribute<TokenItem, LocalDateTime> updatedDate;
	public static volatile SingularAttribute<TokenItem, String> userId;
	public static volatile SingularAttribute<TokenItem, String> token;
	public static volatile SingularAttribute<TokenItem, String> refreshToken;

	public static final String ROLE = "role";
	public static final String CREATED_DATE = "createdDate";
	public static final String UPDATED_BY = "updatedBy";
	public static final String CREATED_BY = "createdBy";
	public static final String ID = "id";
	public static final String UPDATED_DATE = "updatedDate";
	public static final String USER_ID = "userId";
	public static final String TOKEN = "token";
	public static final String REFRESH_TOKEN = "refreshToken";

}

