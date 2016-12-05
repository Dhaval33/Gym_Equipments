package com.niit.shoppingcart.model;




import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Entity
@Table(name= "supplier")
@Component

public class Supplier {
	
	@Id
	private String id;
	
	//@Column(name="name")- This is necessary when the database tables name is different form the category ID
	private String name;
	
	private String address;
	
	@Transient
	@OneToMany(mappedBy="supplier", fetch= FetchType.EAGER)
	private Set<Product> products;
	

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
