package com.icici.dao;

import com.icici.entity.Customer;

public class CustomerClient {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setAge(20);
		customer.setCustomerName("mohan");

		CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();

		// CustomerDaoImpl.saveCustomer(customer);

		// customer to product details
		
		//customerDaoImpl.associateCustomerTOProductOnBuy(1,25);
		
		customerDaoImpl.getCustomerList();

	}

}
