//23-03-2026
/*PART 2: Real-World Scenario (ATM System)
🧠 Q3 (Nested if – Real logic)
👉 Conditions:
Balance > 1000 → proceed
PIN correct → proceed
Amount <= balance → withdraw
Else print proper message
👉 Output cases:
Insufficient balance
Wrong PIN
Withdrawal successful
Not enough balance for withdrawal*/

package com.conditional;

import java.util.Scanner;

public class ATMSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double balance = 5000;
		int correctPin = 1234;

		System.out.println("enter your pin:");
		int pin = sc.nextInt();

		if (pin == correctPin) {
			System.out.println("Enter withdrawal amount:");
			double amount = sc.nextDouble();
			if (amount <= balance) {
				System.out.println("Withdraw Successful!!");
				balance = balance - amount;
				System.out.println("Remaining balance:" + balance);

			} else {
				System.out.println("Not enough balance for withdrawal");
			}
		} else {
			System.out.println("Wrong pin");
		}
		sc.close();
	}

}
