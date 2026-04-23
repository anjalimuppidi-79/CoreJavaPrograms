package com.practicejava;

public class Practice2 {

	public static void main(String[] args) {
		int[] arr = { 3, 9, 2, 52, 7, 13, 11 };

		int temp, j;

		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];// 9 //2
			j = i;// 1
			while (j > 0 && arr[j - 1] > temp) {// 1>0,3>9 (false); 2>0,9>2(true)
				arr[j] = arr[j - 1];// arr[2]=store 9
				j = j - 1;// 1
			}
			arr[j] = temp;// arr[1]=2
		}

		System.out.println("After Insertion Sort:");
		for (int n : arr) {
			
			System.out.print(n + " ");

		}
	}

}
