package com.array;

public class BubbleSort {

	public static void main(String[] args) {

		// Input array
		int[] num = { 9, 5, 3, 10, 50, 30 };

		// Temporary variable for swapping
		int temp = 0;

		// count → number of passes (outer loop)
		int count = 0;

		// count1 → number of comparisons (inner loop)
		int count1 = 0;

		// Print array before sorting
		System.out.println("Array Before Sorting:");
		for (int a : num) {
			System.out.print(a + " ");
		}

		System.out.println();

		// Outer loop → controls number of passes
		for (int i = 0; i < num.length - 1; i++) {

			count++; // increment pass count

			// Optimization: check if any swap happens
			boolean swapped = false;

			// Inner loop → compares adjacent elements
			// (largest element moves to end after each pass)
			for (int j = 0; j < num.length - 1 - i; j++) {

				// Compare current element with next element
				if (num[j] > num[j + 1]) {

					// Swap elements
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;

					// Mark that swapping happened
					swapped = true;
				}

				// Count comparisons
				count1++;
			}

			// If no swapping happened → array already sorted
			if (!swapped) {
				break;
			}
		}

		// Print number of passes
		System.out.println("\nPass count: " + count);

		// Print number of comparisons
		System.out.println("Comparison count: " + count1);

		// Print sorted array
		System.out.println("After Array sorting:");
		for (int n : num) {
			System.out.print(n + " ");
		}
	}
}