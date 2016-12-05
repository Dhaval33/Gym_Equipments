

package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Entity
@Table(name= "orders")
@Component

public class Orderz {
	
	@Id
	private String id;
	
	//@Column(name="name")- This is necessary when the database tables name is different form the orders ID
	private String cart_id;
	
	private String payment_method;
	
	private String billing_address_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCart_id() {
		return cart_id;
	}

	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getBilling_address_id() {
		return billing_address_id;
	}

	public void setBilling_address_id(String billing_address_id) {
		this.billing_address_id = billing_address_id;
	}

		

}
