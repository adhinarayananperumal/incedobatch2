package com.icici.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class OrderManagementDaoImpl {

	EntityManagerFactory emf = null;
	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	EntityManager getEntityManager() {
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entityManager;
	}

	void closeEntityManagerFactory() {
		if (emf != null) {
			emf.close();
		}

	}

	void closeEntityManager() {
		if (entityManager != null) {
			entityManager.close();
		}

	}

	public void createOrderseqexp(Order order) {
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			OrderSequenceGen orderSequenceGen = entityManager.find(OrderSequenceGen.class, 0);
			int orderCurrentValue = orderSequenceGen.getOrder_current_value();
			orderCurrentValue = orderCurrentValue + 1;

			orderSequenceGen.setOrder_current_value(orderCurrentValue);

			// entity
			order.setOrderId(orderCurrentValue);
			order.setOrderName(order.getOrderName());
			order.setAmount(order.getAmount());
			// save call

			entityManager.persist(order);

			transaction.commit();
			entityManager.close();

			System.out.println("Order saved   successfull....");

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

	public void createOrder(Order order) {
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			// entity
			order.setOrderName(order.getOrderName());
			order.setAmount(order.getAmount());
			// save call

			entityManager.persist(order);

			transaction.commit();
			entityManager.close();

			System.out.println("Order saved   successfull....");

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

	Order getOrder(int orderId) {
		Order order = null;
		try {
			getEntityManager();

			// entity
			order = entityManager.find(Order.class, orderId);

			System.out.println("Order saved   successfull....");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeEntityManager();
			closeEntityManagerFactory();
		}

		return order;
	}

	Order updateOrder(Order order) {

		Order orderEntity = null;
		try {
			getEntityManager();
			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			// entity
			orderEntity = entityManager.find(Order.class, order.getOrderId());

			if (orderEntity == null) {
				System.out.println("Order not available........");
			} else {
				orderEntity.setOrderName(order.getOrderName());
				orderEntity.setAmount(order.getAmount());
				orderEntity.setStatus(order.getStatus());
				System.out.println("Order saved   successfull....");
			}

			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
		} finally {

			closeEntityManager();
			closeEntityManagerFactory();
		}

		return order;
	}

	public void deleteOrder(int orderId) {

		Order orderEntity = null;
		try {
			getEntityManager();
			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			// entity
			orderEntity = entityManager.getReference(Order.class, orderId);

			if (orderEntity == null) {
				System.out.println("Order not available........");
			} else {
				entityManager.remove(orderEntity);
				System.out.println("Order deleted   successfull....");
			}

			transaction.commit();

		} catch (EntityNotFoundException e) {
			System.out.println("Order not available........");
		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
		} finally {
			transaction.rollback();
			closeEntityManager();
			closeEntityManagerFactory();
		}

	}

	List<Order> listOrder() {
		List<Order> orderList = null;
		try {
			getEntityManager();
			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			Query q = entityManager.createQuery(" from Order");
			orderList = q.getResultList();

			System.out.println("num of sudents:" + orderList.size());

			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
		} finally {
			closeEntityManager();
			closeEntityManagerFactory();
		}

		return orderList;
	}
	
	

	List<Order> getOrderByNameLike(String orderName) {

		List<Order> orderList = null;
		try {
			getEntityManager();
			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			Query q = entityManager.createQuery("Select e from Order e where e.orderName LIKE '" +  orderName + "%'");
			orderList = q.getResultList();


			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
		} finally {
			closeEntityManager();
			closeEntityManagerFactory();
		}

		return orderList;
	}
	
	
	
	
	List<Order> getOrderByNameLikeNamed(String orderName1) {

		List<Order> orderList = null;
		try {
			getEntityManager();
			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			Query q = entityManager.createNamedQuery("order_like", Order.class);
			q.setParameter("orderName", orderName1);

			orderList = q.getResultList();


			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
		} finally {
			closeEntityManager();
			closeEntityManagerFactory();
		}

		return orderList;
	}

}
