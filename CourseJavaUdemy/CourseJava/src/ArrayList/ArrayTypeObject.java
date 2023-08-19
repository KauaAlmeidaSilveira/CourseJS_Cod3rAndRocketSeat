package ArrayList;

import java.util.Locale;
import java.util.Scanner;

import Model.Entities.Product;

public class ArrayTypeObject {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] products = new Product[n];
		
		for(int i = 0; i <n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			products[i] = new Product(name, price);
		}
		
		double mediaPrices = 0; 
		
		for(int i = 0; i<n; i++) {
			mediaPrices += products[i].getPrice();
		}
		
		System.out.printf("Média: %.2f", mediaPrices/products.length);
		
		sc.close();
	}

}
