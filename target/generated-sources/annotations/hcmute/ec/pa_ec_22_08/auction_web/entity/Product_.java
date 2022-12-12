package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.ProductStatus;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ extends hcmute.ec.pa_ec_22_08.auction_web.entity.AbstractAuditingEntity_ {

	public static volatile SingularAttribute<Product, Boolean> delFrag;
	public static volatile ListAttribute<Product, ProductImage> productImages;
	public static volatile SingularAttribute<Product, Integer> quantity;
	public static volatile SingularAttribute<Product, Long> productId;
	public static volatile SingularAttribute<Product, BigDecimal> price;
	public static volatile SingularAttribute<Product, ProductStatus> productStatus;
	public static volatile SingularAttribute<Product, Category> category;
	public static volatile SingularAttribute<Product, User> user;
	public static volatile SingularAttribute<Product, String> productName;

	public static final String DEL_FRAG = "delFrag";
	public static final String PRODUCT_IMAGES = "productImages";
	public static final String QUANTITY = "quantity";
	public static final String PRODUCT_ID = "productId";
	public static final String PRICE = "price";
	public static final String PRODUCT_STATUS = "productStatus";
	public static final String CATEGORY = "category";
	public static final String USER = "user";
	public static final String PRODUCT_NAME = "productName";

}

