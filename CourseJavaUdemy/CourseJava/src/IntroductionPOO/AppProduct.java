package IntroductionPOO;

import java.util.Locale;
import java.util.Scanner;

import Model.Entities.Product;

public class AppProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Enter product data: %n"
						+ "Name: ");
		String name = sc.next();
		
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("");
		
		product.showInfoProductPrintStream();
		
		System.out.println("");
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		product.showInfoProductPrintStream();
		
		System.out.println("");
		
		System.out.print("Enter the number of products to be removed in stock: ");
		product.removeProducts(sc.nextInt());
		product.showInfoProductPrintStream();
		
		sc.close();
	}

}
