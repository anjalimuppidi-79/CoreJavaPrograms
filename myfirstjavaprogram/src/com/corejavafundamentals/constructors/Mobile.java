//04-03-2026
/*9️)Observe Constructor Calls
Problem
Create class Mobile with:model,price
Create:
No-args constructor printing "No-Args Constructor Called"
Parameterized constructor printing "Parameterized Constructor Called"
Create objects using both constructors.
Observe output.*///

package com.corejavafundamentals.constructors;

public class Mobile {
	String model;
	double price;

//no-Args Constructor
	Mobile() {
		System.out.println("No-Args Constructor Called");
	}

//parameterized constructor
	Mobile(String model, double price) {
		System.out.println("Parameterized Constructor Called");
	}

	public static void main(String[] args) {
		// Calls No-Args constructor
		Mobile obj = new Mobile();
		// // Calls Parameterized constructor

		Mobile obj1 = new Mobile("realme", 20000);

	}

}
