package com.mycompany.store.domain;

import com.mycompany.store.domain.enumeration.OrderItemStatus;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderItem.class)
public abstract class OrderItem_ {

	public static volatile SingularAttribute<OrderItem, Product> product;
	public static volatile SingularAttribute<OrderItem, Integer> quantity;
	public static volatile SingularAttribute<OrderItem, BigDecimal> totalPrice;
	public static volatile SingularAttribute<OrderItem, Long> id;
	public static volatile SingularAttribute<OrderItem, OrderItemStatus> status;
	public static volatile SingularAttribute<OrderItem, ProductOrder> order;

}

