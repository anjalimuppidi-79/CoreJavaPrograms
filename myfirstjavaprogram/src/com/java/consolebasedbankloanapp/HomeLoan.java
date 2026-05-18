
package com.java.consolebasedbankloanapp;

public class HomeLoan extends Loan {

	@Override
	public void checkEligibility() {

		int cibil = getCibilScore();
		int age = getCustomerAge();
		double salary = getCustomerSalary();

		if (cibil >= 700 && age >= 25 && salary >= 600000 && validateBasicDocuments()) {

			System.out.println("\n===== HOME LOAN APPROVED =====");

			System.out.println("Rate Of Interest: " + getRateOfInterest() + "%");

			System.out.println("Address Details:");
			System.out.println(getAddressDetails());

		} else {
			System.out.println("\nHome Loan Rejected");
		}
	}
}