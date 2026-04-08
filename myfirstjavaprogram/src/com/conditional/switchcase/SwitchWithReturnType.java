// 24-03-2026
// Program: Switch Case with Return Type
// Question:
// Write a Java program to display hostel breakfast menu based on the given day.
// Use a method with return type and switch-case to return the menu item.

package com.conditional.switchcase;

import java.util.Scanner;

public class SwitchWithReturnType {

	/*
	 * Method: getHostelMenuDetails Purpose: Returns breakfast item based on the day
	 * Parameter: day (String) Return: String (Breakfast item)
	 */
	static String getHostelMenuDetails(String day) {

		// Switch case based on day
		switch (day) {

		case "Monday":
			return "Bonda";

		case "Tuesday":
			return "Idli";

		case "Wednesday":
			return "Puri";

		case "Thursday":
			return "Dosa";

		case "Friday":
			return "Upma";

		case "Saturday":
			return "Uthapam";

		case "Sunday":
			return "Pulihora";

		// Default case for invalid input
		default:
			return "Entered day is invalid";
		}
	}

	public static void main(String[] args) {

		// Scanner for user input
		Scanner sc = new Scanner(System.in);

		// Asking user for day
		System.out.println("Enter a day (Monday to Sunday):");
		String day = sc.next();

		// Calling method and printing result
		System.out.println("Breakfast: " + getHostelMenuDetails(day));

		// Closing scanner
		sc.close();
	}
}