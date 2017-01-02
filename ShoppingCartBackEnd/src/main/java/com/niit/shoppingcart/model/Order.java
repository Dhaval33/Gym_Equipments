package com.niit.shoppingcart.model;


import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Component
@Table(name= "orders")
public class Order implements Serializable {
	

private static final long serialVersionUID = 1L;
	
   
    @Column(name="USERID")
	private String userID;
	
    
    @Column(name="OrdersID")
	private String orderID;
	
   
	
    @Column(name="SHIPPINGADDRESS")
	private ShippingAddress shippingAddress;
	
    @Column(name="BILLINGADDRESS")
	private BillingAddress billingAddress;
	
    @Transient
    @Column(name="CART")
	private Cart cart;
    
    @Column(name="TOTALAMOUNT")
    private float totalAmount;
	
    @Column(name="PAYMENTMETHOD")
	private String paymentMethod;
    
    public Order(){
    	this.orderID="SHP_CRT_ORD" + UUID.randomUUID();
    }

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	
	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	
	
	
	
	
	

}
