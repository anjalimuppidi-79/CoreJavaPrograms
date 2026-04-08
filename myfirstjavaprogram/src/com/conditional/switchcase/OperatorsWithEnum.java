//24-03-2026

// 24-03-2026
// Program: Enum + Switch Case Example
// Question: Write a Java program to display a special message for each day of the week using enum and switch case.

package com.conditional.switchcase;

import java.util.Scanner;

// Enum to represent fixed days of the week
enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class OperatorsWithEnum {

	public static void main(String[] args) {

		// Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Asking user to enter a day
		System.out.println("Enter your day (MONDAY to SUNDAY):");
		String input = sc.next();

		/*
		 * Convert String input to Enum valueOf() converts String → Enum toUpperCase()
		 * avoids case mismatch (e.g., monday → MONDAY)
		 */
		Day day = Day.valueOf(input.toUpperCase());

		// Switch case using enum
		switch (day) {

		case MONDAY -> {
			// Message for Monday
			System.out.println("Motivation Monday");
			System.out.println("Let’s begin the week with a smile!");
		}

		case TUESDAY -> {
			System.out.println("Talent Tuesday");
			System.out.println("You are talented—show it!");
		}

		case WEDNESDAY -> {
			System.out.println("Wisdom Wednesday");
			System.out.println("Learn something interesting today!");
		}

		case THURSDAY -> {
			System.out.println("Thinking Thursday");
			System.out.println("Use your brain and think smart!");
		}

		case FRIDAY -> {
			System.out.println("Fun Friday");
			System.out.println("Have fun and be happy!");
		}

		case SATURDAY -> {
			System.out.println("Skill Saturday");
			System.out.println("Practice makes you better!");
		}

		case SUNDAY -> {
			System.out.println("Super Sunday");
			System.out.println("Enjoy and get ready for a new week!");
		}
		}

		// Closing scanner to avoid resource leak
		sc.close();
	}
}