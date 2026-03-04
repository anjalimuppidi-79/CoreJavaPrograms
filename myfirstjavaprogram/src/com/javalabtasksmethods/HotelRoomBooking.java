/*3) Hotel Room Booking
Scenario:
Customer books hotel room.
Create methods:
double calculateRoomRent(double pricePerDay, int days)
double addServiceCharge(double amount) → 8%
double addLuxuryTax(double amount) → 12%
void printBill(double finalAmount)
👉 Flow:
Room Rent → Service Charge → Luxury Tax → Print*/
package com.javalabtasksmethods;

import java.util.Scanner;

public class HotelRoomBooking {
	static double calculateRoomRent(double pricePerDay, int days) {
		double roomRentPrice = pricePerDay * days;
		return roomRentPrice;
	}

	static double addServiceCharge(double roomRentPrice) {
		double serviceCharges = 0.08 * roomRentPrice;
		double sC = serviceCharges + roomRentPrice;
		return sC;
	}

	static double addLuxuryTax(double sC) {
		double lTax = 0.12 * sC;
		double amount1 = sC + lTax;
		return amount1;
	}

	static void printBill(double amount1) {
		System.out.println("Final Amount:" + amount1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price per day:");
		double pricePerDay = sc.nextDouble();
		System.out.println("enter days:");
		int days = sc.nextInt();
		printBill(addLuxuryTax(addServiceCharge(calculateRoomRent(pricePerDay, days))));

		sc.close();
	}

}
