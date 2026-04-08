//24-03-2026

package com.conditional.switchcase;

import java.util.Scanner;

public class HostelMenuDoWhile {

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
		Scanner sc = new Scanner(System.in);
		String choice;

		do {
			System.out.println("Enter a day(Monday to Sunday):");
			String day = sc.next();

			// display result
			System.out.println("Breakfast:" + getHostelMenuDetails(day));

			// Ask user to continue
			System.out.println("Do you want to check another day?(Y/N):");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("Y"));

		sc.close();

	}

}
