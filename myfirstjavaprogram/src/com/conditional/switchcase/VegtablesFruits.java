//25-03-2026
//Write a program for vegetables and fruits console based application
package com.conditional.switchcase;

import java.util.Scanner;

public class VegtablesFruits {

	public static void main(String[] args) {

		// Scanner is used to take input from user
		Scanner sc = new Scanner(System.in);

		String input; // to control loop continuation

		// 🔁 DO-WHILE LOOP START
		// This loop runs at least once and repeats if user enters 'y'
		do {

			// Asking user to choose category
			System.out.println("Enter the Category (Veg/Frt):");
			String cate = sc.next(); // reading category input

			// OUTER SWITCH START
			// This switch decides whether user selected Veg or Fruit
			switch (cate) {

			case "Veg" -> {
				// This block runs if user enters "Veg"

				System.out.println("Enter a Vegetable code:");
				String veg = sc.next(); // take vegetable code

				//  INNER SWITCH START (Vegetables)
				// This switch checks which vegetable is selected
				switch (veg) {

				case "tmt" -> System.out.println("Tomato its price is 30 per kg");
				case "ptt" -> System.out.println("Potato its price is 40 per kg");
				case "onn" -> System.out.println("Onion its price is 15 per kg");
				case "chly" -> System.out.println("Chilly its price is 10 per kg");
				case "brj" -> System.out.println("Brinjal its price is 20 per kg");
				case "dmsk" -> System.out.println("Drum Stick its price is 60 per kg");
				case "bg" -> System.out.println("Bottle gourd its price is 20 per kg");

				// If code doesn't match
				default -> System.out.println("Invalid Vegetable!!");

				} //  INNER SWITCH END (Vegetables)

			} //  END of Veg block

			case "Frt" -> {
				//  This block runs if user enters "Frt"

				System.out.println("Enter a fruit code:");
				String frt = sc.next(); // take fruit code

				//  INNER SWITCH START (Fruits)
				// This switch checks which fruit is selected
				switch (frt) {

				case "bnb" -> System.out.println("Banana its price is 80 per dozen");
				case "Apl" -> System.out.println("Apple its price is 100 per kg");
				case "org" -> System.out.println("Orange its price is 60 per kg");
				case "mng" -> System.out.println("Mango its price is 400 per kg");
				case "grp" -> System.out.println("Grapes its price is 80 per kg");
				case "pal" -> System.out.println("Pine apple its price is 40 per kg");
				case "wtm" -> System.out.println("Watermelon its price is 70 per kg");

				// If code doesn't match
				default -> System.out.println("Invalid Fruit!!!");

				} //  INNER SWITCH END (Fruits)

			} //  END of Fruit block

			// If category is not Veg or Frt
			default -> System.out.println("Invalid category! Enter Veg or Frt");

			} //  OUTER SWITCH END

			// Ask user whether to repeat the program
			System.out.println("Do you want to proceed ? (y/n):");
			input = sc.next(); // read user choice

		} while (input.equalsIgnoreCase("y"));
		//  DO-WHILE LOOP END

		// Closing scanner to avoid memory leak
		sc.close();
	}
}