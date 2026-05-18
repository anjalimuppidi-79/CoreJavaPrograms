// ===============================
// FILE: Loan.java
// Parent Class
// ===============================

package com.java.consolebasedbankloanapp;

import java.util.Scanner;

public class Loan {

	protected static Scanner sc = new Scanner(System.in);

	// ================= CIBIL SCORE =================
	public int getCibilScore() {
		System.out.println("Enter CIBIL Score:");
		return sc.nextInt();
	}

	// ================= CUSTOMER AGE =================
	public int getCustomerAge() {
		System.out.println("Enter Customer Age:");
		return sc.nextInt();
	}

	// ================= CUSTOMER SALARY =================
	public double getCustomerSalary() {
		System.out.println("Enter Customer Salary:");
		return sc.nextDouble();
	}

	// ================= ADDRESS DETAILS =================
	public String getAddressDetails() {

		sc.nextLine();

		System.out.println("Enter Flat Number:");
		String flatNo = sc.nextLine();

		System.out.println("Enter Plot Number:");
		String plotNo = sc.nextLine();

		System.out.println("Enter Street:");
		String street = sc.nextLine();

		System.out.println("Enter City:");
		String city = sc.nextLine();

		System.out.println("Enter Pincode:");
		String pincode = sc.nextLine();

		return "Flat No: " + flatNo + ", Plot No: " + plotNo + ", Street: " + street + ", City: " + city + ", Pincode: "
				+ pincode;
	}

	// ================= PAN VALIDATION =================
	public boolean validatePanCard() {

		sc.nextLine();

		System.out.println("Enter PAN Number:");
		String pan = sc.nextLine();

		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

	// ================= AADHAAR VALIDATION =================
	public boolean validateAadhaar() {

		System.out.println("Enter Aadhaar Number:");
		String aadhaar = sc.nextLine();

		return aadhaar.matches("\\d{12}");
	}

	// ================= PHONE VALIDATION =================
	public boolean validatePhoneNumber() {

		System.out.println("Enter Phone Number:");
		String phone = sc.nextLine();

		return phone.matches("[6-9]\\d{9}");
	}

	// ================= DOCUMENT VALIDATION =================
	public boolean validateBasicDocuments() {
		return validatePanCard() && validateAadhaar() && validatePhoneNumber();
	}

	// ================= RATE OF INTEREST =================
	public double getRateOfInterest() {
		return 10.5;
	}

	// ================= POLYMORPHIC METHOD =================
	public void checkEligibility() {
		System.out.println("Check eligibility in subclass");
	}
}