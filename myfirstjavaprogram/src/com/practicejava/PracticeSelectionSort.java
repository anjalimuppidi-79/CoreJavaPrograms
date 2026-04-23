package com.practicejava;

public class PracticeSelectionSort {

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };

		System.out.println("Before Sorting:");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println();
		System.out.println("After Selection Sorting:");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
