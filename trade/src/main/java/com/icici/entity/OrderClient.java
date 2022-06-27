package com.icici.entity;

import com.icici.dao.PaymentDaoImpl;

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
		
	/*
	 * List<Order> orderList =
	 * orderManagementDaoImpl.getOrderByNameLikeNamed("New");
	 * 
	 * 
	 * if (orderList == null) { System.out.println("No Order Found"); } else { for
	 * (Order order : orderList) { System.out.println(order.getOrderId());
	 * System.out.println(order.getOrderName());
	 * System.out.println(order.getStatus()); System.out.println(order.getAmount());
	 * }
	 * 
	 * System.out.println("Order details retrival  successfull...."); }
	 */
		/*
		Order order = new Order(); 
		order.setOrderName("tamil new year");
		order.setAmount(30000);
		
		OrderItem OrderItem1 = new OrderItem();
		OrderItem1.setProductId(25);
		OrderItem1.setOrder(order);
		
		OrderItem OrderItem2 = new OrderItem();
		OrderItem2.setProductId(26);
		OrderItem2.setOrder(order);

		
		OrderItem OrderItem3 = new OrderItem();
		OrderItem3.setProductId(333);
		OrderItem3.setOrder(order);

		
		OrderItem OrderItem4 = new OrderItem();
		OrderItem4.setProductId(888);
		OrderItem4.setOrder(order);

		
		
		List<OrderItem> itemsList=new ArrayList();
		itemsList.add(OrderItem1);
		itemsList.add(OrderItem2);
		itemsList.add(OrderItem3);
		itemsList.add(OrderItem4);
		
		order.setItems(itemsList);

		
		orderManagementDaoImpl.createOrderwithItems(order);
		*/
		
		/*
		 * Payment payment = new Payment(); payment.setPaymentStatus("s");
		 * 
		 * PaymentDaoImpl paymentDaoImpl = new PaymentDaoImpl();
		 * paymentDaoImpl.savePaymentForOrder(payment, 105);
		 */
		
		
		
		
		
		
		
		
	}

}
