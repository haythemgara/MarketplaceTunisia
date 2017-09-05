package com.MarketplaceTunisia.Entities;

import java.util.ArrayList;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Buyer.class)
public abstract class Buyer_ extends com.MarketplaceTunisia.Entities.User_ {

	public static volatile SingularAttribute<Buyer, ArrayList> hobbies;
	public static volatile ListAttribute<Buyer, Complaint> complaints;
	public static volatile ListAttribute<Buyer, Order> orders;

}

