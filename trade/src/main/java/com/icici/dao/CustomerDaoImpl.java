package com.icici.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.icici.entity.Customer;
import com.icici.entity.Product;

public class CustomerDaoImpl {

	public void saveCustomer(Customer customer) {

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			entityManager.persist(customer);

			transaction.commit();
			entityManager.close();

			System.out.println("customer saved   successfull....");

		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		} finally {

			if (entityManager != null) {
				entityManager.close();
			}
			if (emf != null) {
				emf.close();
			}
		}

	}

	public void associateCustomerTOProductOnBuy(int cusId , int productId) {

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();
			
			Customer customerobj = entityManager.find(Customer.class, cusId);
			Product product = entityManager.find(Product.class, productId);
			
			Set<Product> prodList = customerobj.getProducts();
			prodList.add(product);
			
			customerobj.setProducts(prodList);

			transaction.commit();
			entityManager.close();

			System.out.println("customer saved   successfull....");

		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		} finally {

			if (entityManager != null) {
				entityManager.close();
			}
			if (emf != null) {
				emf.close();
			}
		}

	}

}
