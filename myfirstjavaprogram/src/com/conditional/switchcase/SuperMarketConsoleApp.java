package com.conditional.switchcase;

import java.util.Scanner;

public class SuperMarketConsoleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;

		do {
			int price = 0;// reset every loop
			String itemName = ""; // to display in bill
			System.out.println("Enter a Category(Veg/Frt):");
			String cate = sc.next();
			// outer switch
			switch (cate) {
			case "Veg" -> {
				System.out.println("Enter Vegetable name to get their prices:");
				String vegetable = sc.next().toLowerCase();
				switch (vegetable) {

				case "tomato" -> {
					price = 25;
					itemName = "Tomato";
				}
				case "potato" -> {
					price = 40;
					itemName = "Potato";
				}
				case "carrot" -> {
					price = 20;
					itemName = "Carrot";
				}
				case "brinjal" -> {
					price = 30;
					itemName = "Brinjal";
				}
				case "onion" -> {
					price = 15;
					itemName = "Onion";
				}
				case "cabbage" -> {
					price = 18;
					itemName = "Cabbage";
				}
				case "cauliflower" -> {
					price = 35;
					itemName = "Cauliflower";
				}
				case "spinach" -> {
					price = 10;
					itemName = "Spinach";
				}
				case "beans" -> {
					price = 45;
					itemName = "Beans";
				}
				case "capsicum" -> {
					price = 50;
					itemName = "Capsicum";
				}
				case "bottlegourd" -> {
					price = 22;
					itemName = "Bottle Gourd";
				}
				case "drumstick" -> {
					price = 60;
					itemName = "Drumstick";
				}

				default -> System.out.println("Vegetable not available!");
				}

			} // inner switch close

			case "Frt" -> {
				System.out.println("Enter Fruit name to get their prices:");
				String fruit = sc.next().toLowerCase();
				switch (fruit) {

				case "apple" -> {
					price = 120;
					itemName = "Apple";
				}
				case "banana" -> {
					price = 80;
					itemName = "Banana";
				}
				case "orange" -> {
					price = 60;
					itemName = "Orange";
				}
				case "mango" -> {
					price = 150;
					itemName = "Mango";
				}
				case "grapes" -> {
					price = 90;
					itemName = "Grapes";
				}
				case "pineapple" -> {
					price = 50;
					itemName = "Pineapple";
				}
				case "watermelon" -> {
					price = 40;
					itemName = "Watermelon";
				}
				case "papaya" -> {
					price = 45;
					itemName = "Papaya";
				}
				case "guava" -> {
					price = 55;
					itemName = "Guava";
				}
				case "strawberry" -> {
					price = 200;
					itemName = "Strawberry";
				}
				case "kiwi" -> {
					price = 250;
					itemName = "Kiwi";
				}

				default -> System.out.println("Fruit not available!");
				}
			}

			default -> System.out.println("Entered category is not available!!");

			}// outer switch-case close

			// to calculated total amount for selected items
			if (price > 0) {
				System.out.println("Enter quantity:");
				int qty = sc.nextInt();

				int total = price * qty;

				// discount
				double discount = 0;
				if (total >= 500) {
					discount = total * 0.10;// 1-% discount
				} else if (total >= 300) {
					discount = total * 0.05;// 5% discount
				}
				double finalAmount = total - discount;

				// Bill outPut
				System.out.println("--------Bill--");
				System.out.println("Price per unit:" + price);
				System.out.println("Quantity:" + qty);
				System.out.println("Total:" + total);
				System.out.println("Discount:" + discount);
				System.out.println("Final Amount:" + finalAmount);

			}

			System.out.println("Do you want proceed with another veg/frt?:(y/n)");
			input = sc.next();
		} while (input.equalsIgnoreCase("y"));

		sc.close();
	}// main method ending

}
