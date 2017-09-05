package com.MarketplaceTunisia.Entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SingularAttribute<Order, Integer> idOrder;
	public static volatile SingularAttribute<Order, Double> price;
	public static volatile SingularAttribute<Order, Date> dateDelev;
	public static volatile SingularAttribute<Order, Adress> adress;
	public static volatile SingularAttribute<Order, Integer> productnb;
	public static volatile SingularAttribute<Order, Date> dateO;
	public static volatile ListAttribute<Order, Product> products;
	public static volatile SingularAttribute<Order, Buyer> buyer;

}

