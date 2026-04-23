//14-04-2024
//wAP to find sum of all elements in a 2D array 
//input:[1 2
//5 10]
//output:18
package com.array;

public class TwoDimArraySum {

	public static void main(String[] args) {
		int[][] arr = { { 1, 5 }, { 2, 10 } };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];

			}
		}
		System.out.println(sum);

	}

}
