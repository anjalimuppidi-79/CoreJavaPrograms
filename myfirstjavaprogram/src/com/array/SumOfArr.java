//07-04-2026
//Write program to find SUM of array using Scanner
package com.array;

import java.util.Scanner;

public class SumOfArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter elements in an array:");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();//to give numbers from console
		}
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			 sum += numbers[i];
		}
		System.out.println("Sum of an array is:" + sum);

		sc.close();
	}

}
