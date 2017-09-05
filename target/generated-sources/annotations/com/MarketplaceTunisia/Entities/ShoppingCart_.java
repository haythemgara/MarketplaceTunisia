package com.MarketplaceTunisia.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ShoppingCart.class)
public abstract class ShoppingCart_ {

	public static volatile SingularAttribute<ShoppingCart, Integer> qte;
	public static volatile SingularAttribute<ShoppingCart, Integer> idCart;
	public static volatile ListAttribute<ShoppingCart, Product> products;

}

