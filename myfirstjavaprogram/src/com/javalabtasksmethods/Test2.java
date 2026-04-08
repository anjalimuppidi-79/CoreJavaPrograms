//26-02-2026
package com.javalabtasksmethods;

// Program to calculate number of notes and coins
// for a given amount using division (/) and modulus (%)

class Test2 {

	public static void main(String[] args) {

		// Total amount to be divided
		int amount = 6688;

		System.out.println("Total Amount: " + amount);
		System.out.println("---------------------------");

		// ===== 2000 Notes =====
		int notes2000 = amount / 2000; // Divide amount by 2000
		amount = amount % 2000; // Store remaining amount

		// ===== 500 Notes =====
		int notes500 = amount / 500;
		amount = amount % 500;

		// ===== 100 Notes =====
		int notes100 = amount / 100;
		amount = amount % 100;

		// ===== 50 Notes =====
		int notes50 = amount / 50;
		amount = amount % 50;

		// ===== 20 Notes =====
		int notes20 = amount / 20;
		amount = amount % 20;

		// ===== 10 Notes =====
		int notes10 = amount / 10;
		amount = amount % 10;

		// ===== 5 Rupees Coins =====
		int coins5 = amount / 5;
		amount = amount % 5;

		// ===== 2 Rupees Coins =====
		int coins2 = amount / 2;
		amount = amount % 2;

		// ===== 1 Rupee Coins =====
		int coins1 = amount; // Whatever is left

		// ===== Printing Results =====
		System.out.println("2000 Notes: " + notes2000);
		System.out.println("500 Notes: " + notes500);
		System.out.println("100 Notes: " + notes100);
		System.out.println("50 Notes: " + notes50);
		System.out.println("20 Notes: " + notes20);
		System.out.println("10 Notes: " + notes10);
		System.out.println("5 Rupees Coins: " + coins5);
		System.out.println("2 Rupees Coins: " + coins2);
		System.out.println("1 Rupee Coins: " + coins1);
	}
}