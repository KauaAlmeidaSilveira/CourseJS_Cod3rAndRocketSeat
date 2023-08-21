package Model.Entities;

import java.io.PrintStream;

public class Product {

	protected String Name;
	protected Double Price;
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
	
	public PrintStream showInfoProductPrintStream() {
		
		if(!update) {
			update = true;
			return System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n",
					this.Name, this.Price, this.Quantity, this.Price*this.Quantity);
		}
		
		return System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", 
				this.Name, this.Price, this.Quantity, this.Price*this.Quantity);
	}

	public String priceTag(){
		return Name + " $ " + Price;
	}

	public Double totalPrice(){
		return Price*Quantity;
	}

	public String summary(){
		return String.format("%s, %.2f", Name, totalPrice());
	}
}
