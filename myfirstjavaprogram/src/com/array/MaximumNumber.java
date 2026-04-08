//07-04-2026
//QUESTION 2

/*👉 Write a program to:

🔹 Find MAXIMUM element in array

📌 Example:

Input:  {10, 50, 30}
Output: 50*/
package com.array;

public class MaximumNumber {

	public static void main(String[] args) {
		int[] arr = { 10, 50, 30 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("Maximum number:" + max);

	}

}
