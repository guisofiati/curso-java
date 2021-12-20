package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(340, new Date(), OrderStatus.DELIVERED);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.PROCESSING;
		OrderStatus os2 = OrderStatus.valueOf("PROCESSING");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}