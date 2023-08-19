package EnumComposition;

import java.time.LocalDateTime;

import Model.Entities.Order;
import Model.Enums.OrderStatus;

public class AppOrderTestEnum {

	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.now();
		
		Order order = new Order(1080, date, OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		
	}

} 
