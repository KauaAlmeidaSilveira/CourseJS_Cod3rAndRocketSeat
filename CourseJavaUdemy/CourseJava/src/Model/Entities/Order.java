package Model.Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Model.Enums.OrderStatus;

public class Order {

	private Integer id;
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> orderItems = new ArrayList<>();
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	public Order() {}

	public Order(Integer id, LocalDateTime moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public Order(Client client, LocalDateTime moment, OrderStatus status) {
		this.client = client;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMoment() {
		return fmt.format(moment);
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void addItem(OrderItem orderItem) {
		this.orderItems.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) {
		if(orderItem != null) {
			this.orderItems.add(orderItem);
		}
	}
	
	public String showInfoOrder() {
		return "Order moment: " + fmt2.format(moment) + "\n"
			 + "Order status: " + status + "\n"
			 + client.showInfoClient();
	}
	
}
