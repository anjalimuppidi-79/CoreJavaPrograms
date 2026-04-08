//08-04-2026
//WAP to find smallest and largest number
//input={10,25,5,40,15}

package com.array;

public class SmallestLargest {

	public static void main(String[] args) {
		int[] arr = { 10, 25, 5, 40, 15 };
		int smallest = arr[0];
		int largest = arr[0];
		for (int a : arr) {
			if (a < smallest) {
				smallest = a;
			}
			if (a > largest) {
				largest = a;
			}

		}
		System.out.println("Smallest number:" + smallest);
		System.out.println("Largest number:" + largest);
	}

}
