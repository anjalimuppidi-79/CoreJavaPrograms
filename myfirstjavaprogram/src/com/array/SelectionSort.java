package com.array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 20, 4, 45, 8, 1, 9 };
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;// 0
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		for (int num : arr) {
			System.out.println(num + " ");

		}

	}

}
