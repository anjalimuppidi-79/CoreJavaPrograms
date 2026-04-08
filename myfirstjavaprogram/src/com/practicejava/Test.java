package com.practicejava;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String yn;
		do {
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			int count = 0;

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("The given number is a prime number!!");
			} else {
				System.out.println("The given number is not a prime number!!");
			}
			System.out.println("Do u want to check with other number type(y/n)?");
			yn = sc.next();
		} while (yn.equals("y"));

		sc.close();

	}

}
