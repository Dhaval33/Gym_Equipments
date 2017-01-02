package com.niit.shoppingcart.webflow;

import java.io.Serializable;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.dao.OrderDAO;
import com.niit.shoppingcart.model.BillingAddress;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Order;
import com.niit.shoppingcart.model.PaymentMethod;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.ShippingAddress;
import com.niit.shoppingcart.model.User;




public class OrderWebflow implements Serializable{
	
	
	private static final long serialVersionUID = 1L;



	private static Logger log = LoggerFactory.getLogger(OrderWebflow.class);
	

	
	@Autowired
	private OrderDAO OrderDAO;
	
	@Autowired
	CartDAO cartDAO;
	
	@Autowired
	Cart cart;
	
	@Autowired
	Order Order;
	
	@Autowired
	HttpSession httpSession;
	
	@Autowired
	Product product;
	
	@Autowired
	User user;
	
	public Order initFlow(){
	
	log.debug("WEBFLOW->-> starting of the method initFlow");
	
	Order = new Order();
	
	log.debug("Webflow->-> ending of the method initFlow");
	
	return Order;
	
	}
	
	public String addShippingAddress(Order Order, ShippingAddress shippingAddress){
		log.debug("WEBFLOW->-> starting of the method addShippingAddress");
		
		Order.setShippingAddress(shippingAddress);
		
		log.debug("Webflow->-> ending of the method addShippingAddress");
		
		return "success";
		
	}
	
	public String addBillingAddress(Order Order, BillingAddress billingAddress){
		log.debug("WEBFLOW->-> starting of the method addBillingAddress");
		
		Order.setBillingAddress(billingAddress);
		
		log.debug("Webflow->-> ending of the method addBillingAddress");
		
		return "success";
		
	}
	
	public String addPaymentMethod(Order Order, PaymentMethod paymentMethod){
		log.debug("WEBFLOW->-> starting of the method addPaymentMethod");
		
		
		Order.setPaymentMethod(paymentMethod.getPaymentMethod());
		
		
		
		log.debug("Webflow->-> ending of the method addPaymentMethod");
		
		return "success";
			
	}
	
	public String confirmOrder(Order Order)
	{
		log.debug("WEBFLOW->-> starting of the method confirmOrder");
		
		Order.setUserID(user.getId());
		Order.setTotalAmount(product.getPrice());
		OrderDAO.saveOrUpdate(Order);
		
		log.debug("Webflow->-> ending of the method confirmOrder");
		
		return "finalIndex";
	}
}
