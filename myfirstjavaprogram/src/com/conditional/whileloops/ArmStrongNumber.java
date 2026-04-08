package com.conditional.whileloops;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int org = sc.nextInt();// 153
		int num1 = org;
		int temp = num1;
		int count = 0;
		int sum = 0;
		int r = 0;
		while (org != 0) {
			// org = org / 10;// 15
			count++;
			org = org / 10;
		}
		while (num1 != 0) {
			r = num1 % 10;// 3 5 1
			int power = 1;
			for (int i = 1; i <= count; i++) {
				power = power * r;
			}
			sum = sum + power;
			num1 = num1 / 10;// 15 5 0

		}

		if (sum == temp) {
			System.out.println("The given number is ArmStrong Number");
		} else {
			System.out.println("The given number is not armstrong number");
		}

		sc.close();

	}

}
