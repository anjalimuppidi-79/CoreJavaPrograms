
package com.java.consolebasedbankloanapp;

public class GoldLoan extends Loan {

	@Override
	public void checkEligibility() {

		int cibil = getCibilScore();
		int age = getCustomerAge();

		if (cibil >= 600 && age >= 18 && validateAadhaar() && validatePhoneNumber()) {

			System.out.println("\n===== GOLD LOAN APPROVED =====");

			System.out.println("Rate Of Interest: " + (getRateOfInterest() - 2) + "%");

			System.out.println("Address Details:");
			System.out.println(getAddressDetails());

			System.out.println("Enter Gold Weight (in grams):");
			double goldWeight = sc.nextDouble();

			double loanAmount = goldWeight * 6000;

			System.out.println("Eligible Loan Amount: ₹" + loanAmount);

		} else {
			System.out.println("\nGold Loan Rejected");
		}
	}
}