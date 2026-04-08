package com.javaintroduction;

// State Bank of India - Account creation program
public class Bank {

	// Static variable: common for all objects
	// Starting account number
	static int accountNumber = 123450;

	// Instance variables: separate for each account holder
	int accNo; // To store unique account number
	String userName; // To store user name
	int phoNo; // To store phone number
	int balance; // To store account balance

	// Instance block
	// This block runs automatically every time an object is created
	// It increments accountNumber and assigns it to accNo
	{
		accountNumber += 1; // Increase account number
		accNo = accountNumber; // Assign new number to this account
	}

	public static void main(String[] args) {

		// -------- Account Holder 1 --------
		System.out.println("----Account holder1---");
		Bank b = new Bank(); // Object created → instance block runs

		System.out.println("Account No: " + b.accNo);
		b.userName = "Advith";
		b.phoNo = 123456789;
		b.balance = 2300;

		System.out.println("User Name: " + b.userName);
		System.out.println("Phone Number: " + b.phoNo);
		System.out.println("Balance: " + b.balance);

		// -------- Account Holder 2 --------
		System.out.println("----Account holder2---");
		Bank b1 = new Bank(); // New object → account number increments automatically

		System.out.println("Account No: " + b1.accNo);
		b1.userName = "Vihan";
		b1.phoNo = 987654321;
		b1.balance = 1500;

		System.out.println("User Name: " + b1.userName);
		System.out.println("Phone Number: " + b1.phoNo);
		System.out.println("Balance: " + b1.balance);

		// -------- Account Holder 3 --------
		System.out.println("----Account holder3---");
		Bank b2 = new Bank(); // Again account number increments

		System.out.println("Account No: " + b2.accNo);
		b2.userName = "Laddu";
		b2.phoNo = 123456777;
		b2.balance = 23000;

		System.out.println("User Name: " + b2.userName);
		System.out.println("Phone Number: " + b2.phoNo);
		System.out.println("Balance: " + b2.balance);
	}
}
