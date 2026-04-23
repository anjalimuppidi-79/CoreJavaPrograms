//bubble sort
//input:{9,8,7,6,5}
//output:{5,6,7,8,9}
package com.practicejava;

public class PracticeBubbleSort {

	public static void main(String[] args) {
		// declaration and creating an array
		int[] arr = {6,7,8,10,9};
		int temp = 0;
		int count = 0;
		int count1 = 0;

		System.out.println("Array before bubble sort:");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		// writing for loop for no.of rotations
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapped = false;
			count++;// no.of Rotations(n-1)(here n =length of an array)

			for (int j = 0; j < arr.length - 1 - i; j++) {// for swapping elements
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
				count1++;
			}

			if (!swapped) {
				break;

			}

		}
		System.out.println();
		System.out.println(count);
		System.out.println(count1);
		System.out.println("Array After bubble sort:");
		for (int a : arr) {
			System.out.print(a + " ");

		}

	}

}
