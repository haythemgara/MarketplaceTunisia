package com.MarketplaceTunisia.Entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SingularAttribute<Product, Integer> Qte;
	public static volatile SingularAttribute<Product, Shop> shop;
	public static volatile ListAttribute<Product, ShoppingCart> shoppingCarts;
	public static volatile SingularAttribute<Product, String> description;
	public static volatile SingularAttribute<Product, Boolean> discount;
	public static volatile SingularAttribute<Product, byte[]> picture;
	public static volatile SingularAttribute<Product, Double> Reviews;
	public static volatile SingularAttribute<Product, Date> dateAdd;
	public static volatile SingularAttribute<Product, Double> price;
	public static volatile SingularAttribute<Product, Integer> idProduct;
	public static volatile ListAttribute<Product, Order> orders;
	public static volatile SingularAttribute<Product, Category> category;
	public static volatile SingularAttribute<Product, String> nameProduct;

}

