//WAP to print frequency of an element in the given array

package com.array;

public class Frequency {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 1, 4, 2 }; // Input array
		int n = arr.length; // Size of array

		// This array keeps track of elements that are already counted
		boolean[] visited = new boolean[n];

		for (int i = 0; i < n; i++) {

			// If element is already counted, skip it
			if (visited[i]) {
				continue;
			}

			int count = 1; // Count starts from 1 (current element itself)

			// Compare current element with remaining elements
			for (int j = i + 1; j < n; j++) {

				// If duplicate element found
				if (arr[i] == arr[j]) {
					count++; // Increase count
					visited[j] = true; // Mark this index as visited
				}
			}

			// Print the frequency of current element
			System.out.println(arr[i] + " occurs " + count + " times");
		}
	}
}