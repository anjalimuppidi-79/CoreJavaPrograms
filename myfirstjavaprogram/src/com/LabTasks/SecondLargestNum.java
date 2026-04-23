//2)Find second largest element in an array
//Input :{23,65,78,11,90}
//Output 78

package com.LabTasks;

public class SecondLargestNum {

	public static void main(String[] args) {
		int[] num = { 23, 65, 78, 11, 90 };
		int lar = num[0];
		for (int a : num) {
			if (a > lar) {
				lar = a;
			}
		}
		System.out.println("First largest number:"+lar);
		int seclar = num[0];
		for (int a : num) {
			if (a < lar && a > seclar) {
				seclar = a;
			}
		}
		System.out.println("Second Largest number:"+seclar);

	}

}
