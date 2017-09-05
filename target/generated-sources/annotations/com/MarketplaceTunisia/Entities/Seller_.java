package com.MarketplaceTunisia.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Seller.class)
public abstract class Seller_ extends com.MarketplaceTunisia.Entities.User_ {

	public static volatile SingularAttribute<Seller, Integer> companyId;
	public static volatile SingularAttribute<Seller, String> companyName;
	public static volatile ListAttribute<Seller, Shop> shops;
	public static volatile ListAttribute<Seller, Complaint> complaints;

}

