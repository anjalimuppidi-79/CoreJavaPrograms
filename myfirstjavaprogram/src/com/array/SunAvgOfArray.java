//07-04-2026
//sum and avg of array
package com.array;

public class SunAvgOfArray {

	public static void main(String[] args) {
		int[] arr = { 45, 65, 65, 70, 75 };
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of the array:" + sum);
		avg = sum /arr.length;
		System.out.println("Average of an Array:" + avg);
	}

}
