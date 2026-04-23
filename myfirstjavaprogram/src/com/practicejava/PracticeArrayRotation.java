package com.practicejava;

public class PracticeArrayRotation {
	public static void arrayReverse(int[] arr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}

	}

	public static void arrayRotation(int[] arr, int r) {
		int start = 0;
		int end = arr.length-1;
		// reversing an array
		arrayReverse(arr, start, end);

		// rotating first half
		arrayReverse(arr, start, r-1);

		// rotating second half
		arrayReverse(arr, r, end);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int r = 3;

		arrayRotation(arr, r);
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
