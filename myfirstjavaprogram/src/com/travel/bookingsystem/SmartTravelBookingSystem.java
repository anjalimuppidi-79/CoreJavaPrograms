package com.travel.bookingsystem;

import java.util.Scanner;

public class SmartTravelBookingSystem {

	 static Scanner sc = new Scanner(System.in);

	// ================= DISPLAY MENU =================
	public static void displayMenu() {

		System.out.println("\n====== SMART TRAVEL BOOKING SYSTEM ======");
		System.out.println("1. Bus Booking");
		System.out.println("2. Train Booking");
		System.out.println("3. Flight Booking");
		System.out.println("4. Exit");
		System.out.println("Enter Your Choice:");
	}

	// ================= COMMON TICKET METHOD =================
	public static void generateTicket(
			String travelMode,
			String passengerName,
			String source,
			String destination,
			String travelType,
			int tickets,
			int farePerTicket) {

		// Total Calculation
		int total = farePerTicket * tickets;

		// GST Calculation
		double gst = total * 0.05;

		// Discount Calculation
		double discount = 0;

		if (tickets >= 5) {
			discount = total * 0.10;
		}

		// Final Amount
		double finalAmount = total + gst - discount;

		// Ticket Output
		System.out.println("\n========== " + travelMode + " TICKET ==========");

		System.out.println("Passenger Name : " + passengerName);
		System.out.println("Source         : " + source);
		System.out.println("Destination    : " + destination);
		System.out.println("Travel Type    : " + travelType);
		System.out.println("Tickets        : " + tickets);
		System.out.println("Fare Per Ticket: " + farePerTicket);
		System.out.println("Total Amount   : " + total);
		System.out.println("GST (5%)       : " + gst);
		System.out.println("Discount       : " + discount);
		System.out.println("Final Amount   : " + finalAmount);
	}

	// ================= BUS BOOKING =================
	public static void busBooking() {

		sc.nextLine();

		System.out.println("\n========== BUS BOOKING ==========");

		System.out.println("Enter Passenger Name:");
		String name = sc.nextLine();

		System.out.println("Enter Source:");
		String source = sc.nextLine();

		System.out.println("Enter Destination:");
		String destination = sc.nextLine();

		System.out.println("\nSelect Bus Type:");
		System.out.println("1. Sleeper");
		System.out.println("2. Semi Sleeper");
		System.out.println("3. AC Sleeper");

		int busChoice = sc.nextInt();

		String busType = "";
		int fare = 0;

		switch (busChoice) {

		case 1 -> {
			busType = "Sleeper";
			fare = 500;
		}

		case 2 -> {
			busType = "Semi Sleeper";
			fare = 700;
		}

		case 3 -> {
			busType = "AC Sleeper";
			fare = 1000;
		}

		default -> {
			System.out.println("Invalid Bus Type!");
			return;
		}
		}

		System.out.println("Enter Number Of Tickets:");
		int tickets = sc.nextInt();

		generateTicket(
				"BUS",
				name,
				source,
				destination,
				busType,
				tickets,
				fare);
	}

	// ================= TRAIN BOOKING =================
	public static void trainBooking() {

		sc.nextLine();

		System.out.println("\n========== TRAIN BOOKING ==========");

		System.out.println("Enter Passenger Name:");
		String name = sc.nextLine();

		System.out.println("Enter Source:");
		String source = sc.nextLine();

		System.out.println("Enter Destination:");
		String destination = sc.nextLine();

		System.out.println("\nSelect Train Class:");
		System.out.println("1. Sleeper");
		System.out.println("2. AC");
		System.out.println("3. First Class");

		int trainChoice = sc.nextInt();

		String trainType = "";
		int fare = 0;

		switch (trainChoice) {

		case 1 -> {
			trainType = "Sleeper";
			fare = 800;
		}

		case 2 -> {
			trainType = "AC";
			fare = 1500;
		}

		case 3 -> {
			trainType = "First Class";
			fare = 2500;
		}

		default -> {
			System.out.println("Invalid Train Class!");
			return;
		}
		}

		System.out.println("Enter Number Of Tickets:");
		int tickets = sc.nextInt();

		generateTicket(
				"TRAIN",
				name,
				source,
				destination,
				trainType,
				tickets,
				fare);
	}

	// ================= FLIGHT BOOKING =================
	public static void flightBooking() {

		sc.nextLine();

		System.out.println("\n========== FLIGHT BOOKING ==========");

		System.out.println("Enter Passenger Name:");
		String name = sc.nextLine();

		System.out.println("Enter Source:");
		String source = sc.nextLine();

		System.out.println("Enter Destination:");
		String destination = sc.nextLine();

		System.out.println("\nSelect Flight Class:");
		System.out.println("1. Economy");
		System.out.println("2. Business");
		System.out.println("3. First Class");

		int flightChoice = sc.nextInt();

		String flightType = "";
		int fare = 0;

		switch (flightChoice) {

		case 1 -> {
			flightType = "Economy";
			fare = 3000;
		}

		case 2 -> {
			flightType = "Business";
			fare = 6000;
		}

		case 3 -> {
			flightType = "First Class";
			fare = 10000;
		}

		default -> {
			System.out.println("Invalid Flight Class!");
			return;
		}
		}

		System.out.println("Enter Number Of Tickets:");
		int tickets = sc.nextInt();

		generateTicket(
				"FLIGHT",
				name,
				source,
				destination,
				flightType,
				tickets,
				fare);
	}

	// ================= MAIN METHOD =================
	public static void main(String[] args) {

		String continueChoice;

		do {

			displayMenu();

			int option = sc.nextInt();

			switch (option) {

			case 1 -> busBooking();

			case 2 -> trainBooking();

			case 3 -> flightBooking();

			case 4 -> {
				System.out.println("Thank You For Using Smart Travel Booking System!");
				System.exit(0);
			}

			default -> System.out.println("Invalid Choice!");
			}

			System.out.println("\nDo You Want To Continue? (Y/N)");
			sc.nextLine();
			continueChoice = sc.nextLine();

		} while (continueChoice.equalsIgnoreCase("Y"));

		sc.close();
	}
}