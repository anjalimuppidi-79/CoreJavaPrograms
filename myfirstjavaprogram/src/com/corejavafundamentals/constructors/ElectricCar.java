
/*Create a Java program using multilevel inheritance to represent an Electric Car system.
Create a class Vehicle with the attribute:
brand
Initialize it using a constructor.
Create a class Car1 that extends Vehicle with the attributes:
name
model
price
Initialize these attributes using a constructor and call the parent constructor using super().
Create a class ElectricCar that extends Car1 with the attribute:
batteryCapacity
Initialize it using a constructor and call the parent constructor using super().
Implement a method display() that prints:
Brand of the car
Name of the car
Model of the car
Price of the car
Battery capacity of the car
In the main() method, create an object of ElectricCar and display the car details using the display() method.*/

package com.corejavafundamentals.constructors;

class Vehicle {
	String brand;

	Vehicle(String brand) {

		this.brand = brand;
	}

}

class Car1 extends Vehicle {

	String name;
	String model;
	double price;

	Car1(String brand, String name, String model, double price) {

		super(brand);
		this.name = name;
		this.model = model;
		this.price = price;
	}

}

public class ElectricCar extends Car1 {
	double batteryCapacity;

	ElectricCar(String brand, String name, String model, double price, double batteryCapacity) {

		super(brand, name, model, price);
		this.batteryCapacity = batteryCapacity;
	}

	public static void main(String[] args) {

		ElectricCar c1 = new ElectricCar("Tata", "Punch Ev", "Empowered 40kWh", 1229000.0, 40);// passing arguments
		c1.display();
	}

	void display() {
		System.out.println("Brand of the Car: " + brand);
		System.out.println("Name of the car:" + name);
		System.out.println("Model of the car:" + model);
		System.out.println("Price of the car:" + price);
		System.out.println("Batter Capacity of the car:" + batteryCapacity);

	}

}