package com.mycompany.store.domain;

import com.mycompany.store.domain.enumeration.OrderStatus;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProductOrder.class)
public abstract class ProductOrder_ {

	public static volatile SingularAttribute<ProductOrder, String> code;
	public static volatile SetAttribute<ProductOrder, Invoice> invoices;
	public static volatile SingularAttribute<ProductOrder, Long> id;
	public static volatile SingularAttribute<ProductOrder, Instant> placedDate;
	public static volatile SetAttribute<ProductOrder, OrderItem> orderItems;
	public static volatile SingularAttribute<ProductOrder, OrderStatus> status;
	public static volatile SingularAttribute<ProductOrder, Customer> customer;

}

