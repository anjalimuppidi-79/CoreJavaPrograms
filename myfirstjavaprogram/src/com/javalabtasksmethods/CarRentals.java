/*ZoomCar Rentals requires a Java program to compute rental charges for customers.
The program should be able to:
Return the name of the company as a text value.
Provide the fixed daily rental rate, which is ₹1500.
Calculate the base rental cost based on the number of days rented.
Return a fixed insurance fee of ₹500.
Calculate the total cost by combining the base rental cost and the insurance fee.
Return a welcome message for customers., Take Each Requirement in separate method*/
package com.javalabtasksmethods;

public class CarRentals {

	static String companyName() {
		return "ZoomCar Rentals";
	}

	static String welocomeMessage() {
		return "Welcome to Zoom Car Rentals!!!";
	}

	int dailyRentalRate() {
		return 1500;
	}

	int calculateBaseRental(int days) {
		return dailyRentalRate() * days;
	}

	int fixedInsurance() {
		return 500;
	}

	int totalCost(int baseRent, int insurance) {
		return baseRent + insurance;
	}

	public static void main(String[] args) {
		CarRentals c1 = new CarRentals();
		int baseRent = c1.calculateBaseRental(7);
		int insurance = c1.fixedInsurance();

		System.out.println("Company Name:" + companyName());
		System.out.println("Wlcome message:" + welocomeMessage());
		System.out.println("Rent of the Car cost per day:" + c1.dailyRentalRate());
		System.out.println("Cost of base rent:" + c1.calculateBaseRental(7));
		System.out.println("Insurance of the Car:" + c1.fixedInsurance());
		System.out.println("Total Amount of Car rent for 7 days: " + c1.totalCost(baseRent, insurance));

	}

}
