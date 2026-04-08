/*Create a class hierarchy:
Vehicle

Car extends Vehicle

Requirements:
Vehicle constructor prints "Vehicle Created".
Car constructor calls the parent constructor using super().
Both classes have a method start().
Car.start() must:
Print "Car Starting"
Then call the parent method.
*/

package com.corejavafundamentals.constructors;

class Vehicle1 {
	String brand;

	Vehicle1(String brand) {
		this.brand = brand;
	}

	void start() {
		System.out.println("Vehicle Created");
		;
	}
}

class Car3 extends Vehicle1 {
	String model;
	double price;

	Car3(String brand, String model, double price) {
		super(brand);
		this.model = model;
		this.price = price;

	}

	void start() {
		System.out.println("car Started!!");
		super.start();
	}

	void displayCarDetails() {
		System.out.println("Car brand:" + brand);
		System.out.println("Car model:" + model);
		System.out.println("Car price:" + price);

	}

}

public class Driver {
	public static void main(String[] args) {
		Car3 c1 = new Car3(" Toyota", " Fortuner", 3300000);
		Car3 c2 = new Car3(" Hyundai", "Creta", 1100000);
		Car3 c3 = new Car3(" Tata", " Nexon", 900000);
		c1.start();
		c1.displayCarDetails();
		c2.displayCarDetails();
		c3.displayCarDetails();

	}

}
