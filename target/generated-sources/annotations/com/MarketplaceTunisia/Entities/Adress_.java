package com.MarketplaceTunisia.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Adress.class)
public abstract class Adress_ {

	public static volatile SingularAttribute<Adress, String> country;
	public static volatile SingularAttribute<Adress, String> city;
	public static volatile SingularAttribute<Adress, String> street;
	public static volatile SingularAttribute<Adress, Integer> postalCode;
	public static volatile ListAttribute<Adress, Order> orders;
	public static volatile SingularAttribute<Adress, Integer> idAdress;
	public static volatile SingularAttribute<Adress, User> user;

}

