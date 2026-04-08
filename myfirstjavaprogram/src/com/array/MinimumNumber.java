//07-04-2026
//Write a program to find minimum number
/*Write a program to:

🔹 Find MINIMUM element in array*/
package com.array;

public class MinimumNumber {

	public static void main(String[] args) {
		int[] arr = { 10, 25, 7, 85, 200 };
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Number:" + min);
	}

}
