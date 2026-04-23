//Reverse an array by using two pointers approach
package com.array;

public class REvArrByEndStart {

	public static void main(String[] args) {
		int[] arr = { 9, 3, 6, 4, 7 };
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
