package com.mycompany.store.domain;

import com.mycompany.store.domain.enumeration.Gender;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, String> firstName;
	public static volatile SingularAttribute<Customer, String> lastName;
	public static volatile SingularAttribute<Customer, String> country;
	public static volatile SingularAttribute<Customer, Gender> gender;
	public static volatile SingularAttribute<Customer, String> phone;
	public static volatile SingularAttribute<Customer, String> city;
	public static volatile SingularAttribute<Customer, String> addressLine1;
	public static volatile SingularAttribute<Customer, String> addressLine2;
	public static volatile SetAttribute<Customer, ProductOrder> orders;
	public static volatile SingularAttribute<Customer, Long> id;
	public static volatile SingularAttribute<Customer, User> user;
	public static volatile SingularAttribute<Customer, String> email;

}

