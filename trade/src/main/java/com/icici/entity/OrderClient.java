package com.icici.entity;

import java.util.List;

public class OrderClient {

	public static void main(String[] args) {

		OrderManagementDaoImpl orderManagementDaoImpl = new OrderManagementDaoImpl();

		/*
		 * Order order = new Order(); order.setOrderName("p1 purchase");
		 * order.setAmount(2000);
		 * 
		 * orderManagementDaoImpl.createOrder(order);
		 */

		/*
		 * int orderId=10; order = orderManagementDaoImpl.getOrder(orderId);
		 * 
		 * if(order==null) { System.out.println("Order id " + orderId +
		 * " is not available"); }else { System.out.println(order.getOrderId());
		 * System.out.println(order.getOrderName()); }
		 */

		// update logic

		/*
		 * Order order = new Order(); order.setOrderId(10);
		 * order.setOrderName("New23 year purchase"); order.setAmount(10000);
		 * 
		 * orderManagementDaoImpl.updateOrder(order);
		 */

		// delete

		/*
		 * orderManagementDaoImpl.deleteOrder(103);
		 */

		/*
		 * List<Order> orderList = orderManagementDaoImpl.listOrder();
		 * 
		 * if (orderList == null) { System.out.println("No Order Found"); } else { for
		 * (Order order : orderList) { System.out.println(order.getOrderId());
		 * System.out.println(order.getOrderName());
		 * System.out.println(order.getStatus()); System.out.println(order.getAmount());
		 * }
		 * 
		 * System.out.println("Order details retrival  successfull...."); }
		 */
		
		
	//	List<Order> orderList = orderManagementDaoImpl.getOrderByNameLike("New");
		
		List<Order> orderList = orderManagementDaoImpl.getOrderByNameLikeNamed("New");


		if (orderList == null) {
			System.out.println("No Order Found");
		} else {
			for (Order order : orderList) {
				System.out.println(order.getOrderId());
				System.out.println(order.getOrderName());
				System.out.println(order.getStatus());
				System.out.println(order.getAmount());
			}

			System.out.println("Order details retrival  successfull....");
		}
		
	}

}
