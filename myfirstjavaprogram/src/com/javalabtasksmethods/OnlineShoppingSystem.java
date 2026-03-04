/*1) Online Shopping System
Scenario:
A customer buys a product.
Create methods:
double calculateTotal(double price, int quantity)
double applyDiscount(double amount) → 10% discount
double addGST(double amount) → 18%
void printInvoice(double finalAmount)
👉 Flow:
Total → Discount → GST → Print*/

package com.javalabtasksmethods;

import java.util.Scanner;

public class OnlineShoppingSystem {

	// Method 1: Calculate total price based on price and quantity
	double calculateTotal(double price, int quantity) {
		// Multiply price with quantity
		double amount = price * quantity;
		return amount; // return total amount
	}

	// Method 2: Apply 10% discount on total amount
	double applyDiscount(double amount) { // amount received as parameter

		// Calculate 10% discount
		double discount = 0.10 * amount;

		// Subtract discount from original amount
		double amountAfterDiscount = amount - discount;

		return amountAfterDiscount; // return discounted amount
	}

	// Method 3: Add 18% GST to discounted amount
	double addGSt(double amountAfterDiscount) {

		// Calculate 18% GST
		double gst = 0.18 * amountAfterDiscount;

		// Add GST to amount
		double finalAmount = amountAfterDiscount + gst;

		return finalAmount; // return final bill amount
	}

	// Method 4: Print final invoice
	void printInvoice(double finalAmount) {
		System.out.println("Final Amount to Pay: " + finalAmount);
	}

	public static void main(String[] args) {

		// Create object to call non-static methods
		OnlineShoppingSystem s1 = new OnlineShoppingSystem();

		// Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Taking input from user
		System.out.println("Enter price of item:");
		double price = sc.nextDouble();

		System.out.println("Enter quantity of items:");
		int quantity = sc.nextInt();

		// Step 1: Calculate total amount
		double totalAmount = s1.calculateTotal(price, quantity);

		// Step 2: Apply discount
		double discountedAmount = s1.applyDiscount(totalAmount);

		// Step 3: Add GST
		double finalAmount = s1.addGSt(discountedAmount);

		// Step 4: Print final invoice
		s1.printInvoice(finalAmount);

		// Close scanner to avoid resource leak
		sc.close();
	}
}