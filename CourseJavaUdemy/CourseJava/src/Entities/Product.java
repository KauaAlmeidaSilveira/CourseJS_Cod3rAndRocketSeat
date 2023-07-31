package Entities;

import java.io.PrintStream;

public class Product {

	public String Name;
	public Double Price;
	public Integer Quantity;
	
	public double totalValueInStock() {
		return Price*Quantity;
	}
	
	public void addProducts(int quantity) {
		this.Quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.Quantity -= quantity;
	}
	
	public PrintStream showInfoProduct() {
		return System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n"
				, this.Name, this.Price, this.Quantity, this.Price*this.Quantity);
	}
}
