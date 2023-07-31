package IntroductionPOO;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class AppProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		Product product = new Product();
		
		System.out.printf("Enter product data: %n"
						+ "Name: ");
		product.Name = sc.next();
		
		System.out.print("Price: ");
		product.Price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.Quantity = sc.nextInt();
		
		System.out.println("");
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n"
				, product.Name, product.Price, product.Quantity, product.Price*product.Quantity);
		
		System.out.println("");
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		product.showInfoProduct();
		
		System.out.println("");
		
		System.out.print("Enter the number of products to be removed in stock: ");
		product.removeProducts(sc.nextInt());
		product.showInfoProduct();
		
		sc.close();
	}

}
