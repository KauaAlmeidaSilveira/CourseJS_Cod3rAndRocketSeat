package EnumComposition;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Model.Entities.Client;
import Model.Entities.Order;
import Model.Entities.OrderItem;
import Model.Entities.Product;
import Model.Enums.OrderStatus;

public class AppOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth Date: ");
		String date = sc.nextLine();
		
		Client client = new Client(name, email, LocalDate.parse(date, fmt));
		
		System.out.println("Enter order data: ");
		
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(client, LocalDateTime.now(), OrderStatus.valueOf(status));
		
		System.out.print("How many items will be insert? ");
		int numItems = sc.nextInt();
		
		for(int i= 0; i<numItems; i++) {
			System.out.printf("Enter #%d item data: %n", (i+1));
			
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem orderItem = new OrderItem(product, quantity);
			
			order.addItem(orderItem);
		}
		
		System.out.println("\nORDER SUMMARY: ");
		
		System.out.println(order.showInfoOrder());
		
		System.out.println("Order Items: ");
		
		order.getOrderItems().forEach(item ->
				System.out.printf("%s, $%.2f, Quantity: %d, Subtotal: $%.2f%n", item.getProduct().getName(),
						item.getProduct().getPrice(), item.getQuantity(), item.subTotal())
		);
		
		double sumSubTotalOrderItems = 0;
		
		for(int i=0; i<order.getOrderItems().size(); i++) {
			sumSubTotalOrderItems += order.getOrderItems().get(i).subTotal();
		}
		
		System.out.printf("Total Price: $%.2f", sumSubTotalOrderItems);
		
		
		sc.close();
	}

}
