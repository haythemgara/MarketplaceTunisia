package com.MarketplaceTunisia.Entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Shop.class)
public abstract class Shop_ {

	public static volatile SingularAttribute<Shop, Seller> seller;
	public static volatile SingularAttribute<Shop, Date> dateCreation;
	public static volatile SingularAttribute<Shop, Long> idShop;
	public static volatile SingularAttribute<Shop, String> nameShop;
	public static volatile SingularAttribute<Shop, String> description;
	public static volatile SingularAttribute<Shop, byte[]> picture;
	public static volatile ListAttribute<Shop, Product> products;

}

