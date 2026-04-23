package com.array;

public class DescBubbleSort {

	public static void main(String[] args) {

		// Input array
		int[] arr = { 10, 50, 100, 40, 70 };

		// Temporary variable for swapping
		int temp = 0;

		// count → number of passes (outer loop runs)
		int count = 0;

		// count1 → number of comparisons (inner loop runs)
		int count1 = 0;

		// Print array before sorting
		System.out.println("Before descending order:");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println();

		// Outer loop → controls number of passes
		for (int i = 0; i < arr.length - 1; i++) {

			count++; // increment pass count

			// Optimization flag → checks if swapping happens
			boolean swapped = false;

			// Inner loop → compares adjacent elements
			// Largest elements move to the front in descending order
			for (int j = 0; j < arr.length - 1 - i; j++) {

				// For descending → swap if left is smaller than right
				if (arr[j] < arr[j + 1]) {

					// Swap elements
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					// Mark swap happened
					swapped = true;
				}

				// Count comparisons
				count1++;
			}

			// If no swapping → array already sorted
			if (!swapped) {
				break;
			}
		}

		// Print number of passes
		System.out.println("\nPass count: " + count);

		// Print number of comparisons
		System.out.println("Comparison count: " + count1);

		// Print sorted array (descending order)
		System.out.println("After Sorting in Descending order:");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}