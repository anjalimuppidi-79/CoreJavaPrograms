package com.practicejava;

public class TestPracticeBubbleSort {

	public static void main(String[] args) {
		int[] arr = { 6, 2, 8, 4, 10 };

		int temp = 0;

		System.out.println("Before Sorting:");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {// if arr[0] greater than arr[1] then swap
					temp = arr[j];// 6
					arr[j] = arr[i];// 2
					arr[i] = temp;// 6
				}

			}

		}
		// printing elements after bubble sort
		System.out.println();
		System.out.println("After bubble Sorting :");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
