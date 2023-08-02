package Entities;

import java.io.PrintStream;

public class Product {

	private String Name;
	private Double Price;
	private Integer Quantity;
	
	Boolean update = false;

	public Product() {}
	
	public Product(String name, Double price, Integer quantity) {
		this.Name = name;
		this.Price = price;
		this.Quantity = quantity;
	}
	
	public Product(String name, Double price) {
		this.Name = name;
		this.Price = price;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Integer getQuantity() {
		return Quantity;
	}
	
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
		
		if(!update) {
			update = true;
			return System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n",
					this.Name, this.Price, this.Quantity, this.Price*this.Quantity);
		}
		
		return System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", 
				this.Name, this.Price, this.Quantity, this.Price*this.Quantity);
	}
	
}
