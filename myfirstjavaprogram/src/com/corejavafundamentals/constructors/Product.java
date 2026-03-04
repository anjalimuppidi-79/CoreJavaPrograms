//04-03-2026
/*6️⃣ Parameterized Constructor – Product Billing
Problem:Create class Product with:
product:Name,price,quantity
Constructor should accept all three values.
Calculate:
totalAmount = price × quantity
Display invoice details.*/

package com.corejavafundamentals.constructors;

public class Product {
	String name;
	double price;
	int quantity;
	double totalAmount;

	Product(String name, double price, int quantity) {// parameterized constructor
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	void display() {
		totalAmount = price * quantity;
		System.out.println("Product Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println(totalAmount);

	}

	public static void main(String[] args) {
		Product obj = new Product("Chocolate", 250, 25);// passing arguments
		obj.display();

	}

}
