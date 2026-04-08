//30-03-2026
//WAP to check the given number is perfect number r not

package com.conditional.loops;

import java.util.Scanner;

public class ToCheckPerfectNumber {
	static boolean isPerfectNumber(int num) {
		boolean status =false;
		int sum=0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum=sum+i;
			}

		}
		if(sum==num) {
			status=true;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		if (isPerfectNumber(num)) {
			System.out.println("The given number is perfect!");
		} else {
			System.out.println("The given number is not perfect!");
		}

		sc.close();
	}

}
