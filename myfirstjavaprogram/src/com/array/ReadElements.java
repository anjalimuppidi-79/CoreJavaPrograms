package com.array;

import java.util.Scanner;

public class ReadElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements into an array:");
		// by using for loop
		/*
		 * for (int i = 0; i < size; i++) { arr[i] = sc.nextInt(); 
		 * } for (int i = 0; i <arr.length; i++) {
		 *  System.out.println(arr[i] + " ");
		 *   }
		 */
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int a : arr) {
			System.out.println(a);
		}

		sc.close();
	}

}
