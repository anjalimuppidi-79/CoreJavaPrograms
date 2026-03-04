/*Scenario:
User books a cab.
Create methods:
double calculateFare(double km) → 12 per km
double addNightCharge(double amount) → +100 if night
double addGST(double amount) → 5%
void printReceipt(double finalAmount)
👉 Flow:
Fare → Night Charge → GST → Print*/

package com.javalabtasksmethods;

import java.util.Scanner;

public class CabBookingSystem {
	static double calculateFare(double km) {
		double price = 12 * km;
		return price;
	}

	static double addNightCharge(double price) {
		double charge = 100;
		double amount = charge + price;
		return amount;

	}

	static double addGST(double amount) {
		double gst = amount * 0.05;
		double total_Gst = amount + gst;
		return total_Gst;
	}

	static void printReceipt(double total_Gst) {
		double finalAmount = total_Gst;
		System.out.println("final amount:" + finalAmount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many kilometers:");
		double km = sc.nextDouble();
		double price = calculateFare(km);
		printReceipt(addGST(addNightCharge(price)));

		sc.close();

	}

}
