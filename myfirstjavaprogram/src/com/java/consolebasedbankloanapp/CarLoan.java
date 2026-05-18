
package com.java.consolebasedbankloanapp;

public class CarLoan extends Loan {

	@Override
	public void checkEligibility() {

		int cibil = getCibilScore();
		int age = getCustomerAge();
		double salary = getCustomerSalary();

		if (cibil >= 700 && age >= 21 && age <= 60 && salary >= 25000 && validateBasicDocuments()) {

			System.out.println("\n===== CAR LOAN APPROVED =====");

			System.out.println("Rate Of Interest: " + getRateOfInterest() + "%");

			System.out.println("Address Details:");
			System.out.println(getAddressDetails());

			System.out.println("Enter Car Price:");
			double carPrice = sc.nextDouble();

			double loanAmount = carPrice * 0.80;

			System.out.println("Eligible Loan Amount: ₹" + loanAmount);

		} else {
			System.out.println("\nCar Loan Rejected");
		}
	}
}