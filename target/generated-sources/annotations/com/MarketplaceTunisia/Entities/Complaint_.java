package com.MarketplaceTunisia.Entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Complaint.class)
public abstract class Complaint_ {

	public static volatile SingularAttribute<Complaint, Seller> seller;
	public static volatile SingularAttribute<Complaint, Date> dateComplaint;
	public static volatile SingularAttribute<Complaint, String> description;
	public static volatile SingularAttribute<Complaint, Integer> idComplaint;
	public static volatile SingularAttribute<Complaint, Buyer> buyer;

}

