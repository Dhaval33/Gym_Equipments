package com.niit.shoppingcart.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Entity
@Table(name= "cart")
@Component

public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(name="product_name")
	private String productName;
	
	private char status;
	
	@Transient
	@Column(name="add_date")
	private Date addedDate;
	
	
	@Column(name="User_ID")
	private String UserID;
	
	
	
	
	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	


	


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public char getStatus() {
		return status;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public void setStatus(char status) {
		this.status = status;
	}


	public String getUserID() {
		return UserID;
	}


	public void setUserID(String userID) {
		UserID = userID;
	}


	
	@Column(name="price")
	private float price;

	


	
    

	
	
	

	
	
	
}

