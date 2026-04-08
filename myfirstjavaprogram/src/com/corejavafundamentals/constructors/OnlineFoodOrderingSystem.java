package com.corejavafundamentals.constructors;

public class OnlineFoodOrderingSystem {
	int orderId;
	String customerName;
	String foodItem;
	int quantity;
	double price;

	public OnlineFoodOrderingSystem() {
		this(0, "Guest", "Not Selected", 1, 0);

	}

	public OnlineFoodOrderingSystem(int orderId, String customerName) {
		this(orderId, customerName, "Not Selected", 1, 0);

	}

	public OnlineFoodOrderingSystem(int orderId, String customerName, String foodItem) {
		this(orderId, customerName, foodItem, 1, 0);
	}

	public OnlineFoodOrderingSystem(int orderId, String customerName, String foodItem, int quantity, 
			double price) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.foodItem = foodItem;
		this.quantity = quantity;
		this.price = price;

	}

	public static void main(String[] args) {
		OnlineFoodOrderingSystem f1 = new OnlineFoodOrderingSystem(101, "Advith", "veg Briyani", 5,250);

		double extraItemPrice = f1.extraItem("Chicken-briyani", 250);
		f1.calculateBill(extraItemPrice);
		f1.displayOrder();

	}

	double extraItem(String item, double price) {
		item = "chicken briyani";
		price = 250;
		return price;

	}

	void displayOrder() {
		System.out.println("Order ID: " + orderId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Food Item: " + foodItem);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
	}

	void calculateBill(double extraItemPrice) {
		double totalPrice =(quantity*price)+extraItemPrice;
		double totalBill = totalPrice + extraItemPrice;
		System.out.println("Total bill:" + totalBill);

	}

}
