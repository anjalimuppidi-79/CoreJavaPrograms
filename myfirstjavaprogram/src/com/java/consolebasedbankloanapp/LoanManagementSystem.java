
package com.java.consolebasedbankloanapp;

import java.util.Scanner;

public class LoanManagementSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Loan loan = null;

		System.out.println("\n===== BANK LOAN MANAGEMENT SYSTEM =====");

		System.out.println("1. Personal Loan");
		System.out.println("2. Home Loan");
		System.out.println("3. Gold Loan");
		System.out.println("4. Car Loan");

		System.out.println("Enter Your Choice:");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			loan = new PersonalLoan();
			break;

		case 2:
			loan = new HomeLoan();
			break;

		case 3:
			loan = new GoldLoan();
			break;

		case 4:
			loan = new CarLoan();
			break;

		default:
			System.out.println("Invalid Choice");
			System.exit(0);
		}

		// Runtime Polymorphism
		loan.checkEligibility();

		sc.close();
	}
}