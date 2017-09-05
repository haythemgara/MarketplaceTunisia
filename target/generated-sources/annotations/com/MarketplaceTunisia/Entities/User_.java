package com.MarketplaceTunisia.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, Integer> idUser;
	public static volatile SingularAttribute<User, String> lastName;
	public static volatile SingularAttribute<User, String> mail;
	public static volatile SingularAttribute<User, Character> gender;
	public static volatile ListAttribute<User, Role> roles;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, Long> tel;
	public static volatile SingularAttribute<User, Adress> adress;
	public static volatile SingularAttribute<User, String> pwd;
	public static volatile SingularAttribute<User, byte[]> picture;
	public static volatile SingularAttribute<User, Boolean> status;

}

