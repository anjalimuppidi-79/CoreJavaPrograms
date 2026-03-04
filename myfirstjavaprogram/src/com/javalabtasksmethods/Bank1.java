package com.javalabtasksmethods;

import java.util.Scanner;

public class Bank1 {
	long accNo;
	String name;
	double balance;
	String pin;

	static double getDepositAmt(double dep) {
		return dep;

	}

	static int displayWithdrawAmount(int wAmt) {
		return wAmt;
	}

	static double getCurrentBAlance(double cBal) {
		return cBal;
	}

	static String changePin(String chpin) {
		return chpin;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank1 b1 = new Bank1();
		System.out.println("Enter AccountNumber:");
		b1.accNo = sc.nextLong();
		System.out.println("Enter Name:");
		b1.name = sc.next();
		System.out.println("Enter Balance:");
		b1.balance = sc.nextDouble();
		System.out.println("Enter pin:");
		b1.pin = sc.next();
		System.out.println("Enter Deposited Amount:");
		double d = sc.nextDouble();
		double dep = getDepositAmt(d);
		double depAmt = dep + b1.balance;
		System.out.println("Enter withdarw Amount:");
		int wd = sc.nextInt();
		System.out.println("Enter withdraw Amount:" + wd);
		/*
		 * int withDarw = displayWithdrawAmount(wd);
		 * System.out.println("Enter a New Pin:"); String chpin = sc.next(); String
		 * changepin = changePin(chpin);
		 * 
		 * System.out.println("Account Number is:" + b1.accNo);
		 * System.out.println("Accountholder Name  is:" + b1.name);
		 * System.out.println("Current Balance  is:" + b1.balance);
		 * System.out.println("Current pin  is:" + b1.pin);
		 * System.out.println("Account balance after deposit" + depAmt);
		 * System.out.println("Enter withdraw Amount:" + withDarw); double cub =
		 * b1.balance + depAmt - withDarw; double currentBalance =
		 * getCurrentBAlance(cub); System.out.println("Current Balance:" +
		 * currentBalance); System.out.println("Pin changed successfully!!");
		 * System.out.println("Updated pin!!!"); System.out.println("changed pin:" +
		 * changepin);
		 */
		sc.close();
	}

}
