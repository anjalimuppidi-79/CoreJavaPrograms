package com.array;

//WAP to sort elements in array by using insertion sorting
public class InsertionSort {

	public static void main(String[] args) {
		int[] num = { 18, 6, 28, 29, 16, 9, 7, 11 };

		int temp, j;
		for (int i = 1; i < num.length; i++) {
			temp = num[i];
			j = i;
			while (j > 0 && num[j - 1] > temp) {
				num[j] = num[j - 1];//here we check with left side elements 
				j = j - 1;
			}
			num[j] = temp;
		}
		System.out.println("After insertion sort:");
		for (int n : num) {
			System.out.print(n + " ");
		}

	}

}
