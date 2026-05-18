
package com.java.consolebasedbankloanapp;

public class PersonalLoan extends Loan {

	@Override
	public void checkEligibility() {

		int cibil = getCibilScore();
		int age = getCustomerAge();
		double salary = getCustomerSalary();

		if (cibil >= 750 && age >= 25 && salary >= 1000000 && validateBasicDocuments()) {

			System.out.println("\n===== PERSONAL LOAN APPROVED =====");

			System.out.println("Rate Of Interest: " + getRateOfInterest() + "%");

			System.out.println("Address Details:");
			System.out.println(getAddressDetails());

		} else {
			System.out.println("\nPersonal Loan Rejected");
		}
	}
}