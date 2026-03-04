package com.javalabtasksmethods;

import java.util.Scanner;

//Date:26-Feb-2026
//By using methods Creating My personal data
public class MyInfo {

	public static byte dispalyMyDetails(byte favouriteNo) {
		return favouriteNo;

	}

	public static short dispalyMyDetails(short myId) {
		return myId;
	}

	public static int dispalyMyDetails(int age) {
		return age;
	}

	public static long dispalyMyDetails(long phoneNo) {
		return phoneNo;
	}

	public static float dispalyMyDetails(float height) {
		return height;
	}

	public static double dispalyMyDetails(double weight) {

		return weight;
	}

	public static char dispalyMyDetails(char gender) {
		return gender;

	}

	public static boolean dispalyMyDetails(boolean favcolorblue) {
		return favcolorblue;
	}

	public static String dispalyMyDetails(String name) {
		return name;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Favourite No:");
		byte s2 = sc.nextByte();
		byte myFavno = dispalyMyDetails(s2);
		System.out.println("Enter Id:");
		short s3 = sc.nextShort();
		short myId = dispalyMyDetails(s3);
		System.out.println("Enter age:");
		int s4 = sc.nextInt();
		int myage = dispalyMyDetails(s4);
		System.out.println("Enter name:");
		sc.nextLine();// use sc.next to not get error
		String s1 = sc.nextLine();
		String myName = dispalyMyDetails(s1);
		System.out.println("Enter Phone Number:");
		long s5 = sc.nextLong();
		long myphn = dispalyMyDetails(s5);

		System.out.println("Enter Height:");
		float s6 = sc.nextFloat();
		float myh = dispalyMyDetails(s6);
		System.out.println("Enter weight:");
		double s7 = sc.nextDouble();
		double myW = dispalyMyDetails(s7);
		System.out.println("Enter Gender:");
		char s8 = sc.next().charAt(0);
		char myGender = dispalyMyDetails(s8);
		System.out.println("Enter favourate color is Blue :");
		boolean s9 = sc.nextBoolean();
		boolean mycolor = dispalyMyDetails(s9);

		System.out.println("Favourite No:" + myFavno);

		System.out.println("Id:" + myId);

		System.out.println("Age:" + myage);

		System.out.println("Name:" + myName);

		System.out.println("Phone Number:" + myphn);

		System.out.println("Height:" + myh);

		System.out.println("weight:" + myW);

		System.out.println("Gender:" + myGender);

		System.out.println("My favourite color is blue:" + mycolor);

		System.out.println("**********************************");

		sc.close();
	}

}
