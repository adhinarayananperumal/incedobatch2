package com.icici.dao;

import com.icici.entity.Customer;
import com.icici.entity.Product;

public class ProductClient {
	
	public static void main(String[] args) {

		Product product = new Product();
		product.setProdName("HP Laptop i7");
		product.setPrice(15000);
		
		ProductDaoImpl productDaoImpl= new ProductDaoImpl();
		
		productDaoImpl.saveProduct(product);

	}

}
