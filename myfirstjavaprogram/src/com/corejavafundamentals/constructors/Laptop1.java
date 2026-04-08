/*2️) Online Shopping System
Create a Java program using multilevel inheritance.
Create a class Product with:
productId
productName
Create a class Electronics that extends Product with:
brand
price
Create a class Laptop that extends Electronics with:ram,processor
Implement a display() method to show all product details.
Create an object in main() and print the details.*/
//
package com.corejavafundamentals.constructors;

class Product1 {
	int productId;
	String productName;

	Product1(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

}

class Electronics extends Product1 {
	String brand;
	double price;

	Electronics(int productId, String productName, String brand, double price) {
		super(productId, productName);
		this.brand = brand;
		this.price = price;
	}

}

public class Laptop1 extends Electronics {
	String ram;
	String processor;

	Laptop1(int productId, String productName, String brand, double price, String ram, String processor) {
		super(productId, productName, brand, price);
		this.ram = ram;
		this.processor = processor;

	}

	public static void main(String[] args) {
		Laptop1 l1 = new Laptop1(1234, "HP Pavilion 15-eg3027TU", "Laptop", 68990, "16 GB DDR4-3200 MHz ",
				" 13th Gen Intel Core i5-1340P ");
		l1.displayProductDetails();

	}

	void displayProductDetails() {
		System.out.println("Id of the Product:" + productId);
		System.out.println("Name of the Product:" + productName);
		System.out.println("Brand of the Product:" + brand);
		System.out.println("Price of the Product:" + price);
		System.out.println("Ram of the Product:" + ram);
		System.out.println("processor of the Product:" + processor);

	}

}
