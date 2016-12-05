package com.niit.shoppingcart.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class PaymentMethod implements Serializable{
	
	private String paymentMethod;

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
