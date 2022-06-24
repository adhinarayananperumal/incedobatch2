package com.icici.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_item_det")
public class OrderItem {
	
	
	@Id
	@GeneratedValue
	private int orderItemId;
	
	private int productId;
	
	
	@ManyToOne
	private Order order;


	public int getOrderItemId() {
		return orderItemId;
	}


	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}
	
	

	

}
