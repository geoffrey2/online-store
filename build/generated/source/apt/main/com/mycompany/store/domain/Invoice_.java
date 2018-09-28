package com.mycompany.store.domain;

import com.mycompany.store.domain.enumeration.InvoiceStatus;
import com.mycompany.store.domain.enumeration.PaymentMethod;
import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Invoice.class)
public abstract class Invoice_ {

	public static volatile SingularAttribute<Invoice, Instant> date;
	public static volatile SingularAttribute<Invoice, String> code;
	public static volatile SingularAttribute<Invoice, PaymentMethod> paymentMethod;
	public static volatile SingularAttribute<Invoice, String> details;
	public static volatile SingularAttribute<Invoice, Long> id;
	public static volatile SingularAttribute<Invoice, Instant> paymentDate;
	public static volatile SingularAttribute<Invoice, BigDecimal> paymentAmount;
	public static volatile SetAttribute<Invoice, Shipment> shipments;
	public static volatile SingularAttribute<Invoice, InvoiceStatus> status;
	public static volatile SingularAttribute<Invoice, ProductOrder> order;

}

