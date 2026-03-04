//4-06-2026
/*Combination of No-Args and Parameterized Constructor
Problem:Create class Laptop with variables:
brand,price
Create:
1️)No-args constructor
→ Assign brand = "Dell", price = 50000
2️) Parameterized constructor
→ Accept brand and price
Create display method.*/

package com.corejavafundamentals.constructors;

public class Laptop {
	String brand;
	double price;

//no-Args Constructor
	Laptop() {
		brand = "Dell";
		price = 50000;

	}

//Parameterized Constructor
	Laptop(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

//Methods to display laptop details
	void display() {
		System.out.println("Laptop Brand:" + brand);// Dell
		System.out.println("price of the Laptop:" + price);// 50000
	}

	public static void main(String[] args) {
		// Calling No-Args constructor
		Laptop obj = new Laptop();
		obj.display();
		// Calling Parameterized constructor
		Laptop obj1 = new Laptop("Hp", 40000);
		obj1.display();

	}

}
