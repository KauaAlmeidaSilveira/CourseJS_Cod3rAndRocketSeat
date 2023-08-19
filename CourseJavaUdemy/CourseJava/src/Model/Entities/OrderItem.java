package Model.Entities;

public class OrderItem {

	private Integer quantity;
	private Product product;
	
	public OrderItem(Product product, Integer quantity) {
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity*product.getPrice();
	}
	
}
