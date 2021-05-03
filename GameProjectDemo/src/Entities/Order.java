package Entities;

public class Order {
	
private int orderId;
	
	public Order() {
		
	}
	
	public Order(int orderId) {
		super();
		this.orderId = orderId;
	}

	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

}
