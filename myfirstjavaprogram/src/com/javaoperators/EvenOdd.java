package com.javaoperators;
//

//import java.util.Scanner;
//
//public class EvenOdd {
//	int a;
//
//	public static void main(String[] args) {
//		char ch=65;
//		char c='A';
//		System.out.println(ch==c);
//		System.out.println(ch);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number :");
//		int number = sc.nextInt();
//		if ((number & 1) == 0) {
//			System.out.println("Even");
//		} else {
//			System.out.println("Odd");
//		}
//		sc.close();
//	}
//
//}

public class EvenOdd {

	public static void main(String[] args) {
		int a = 72;
		int b = 2;

		int result = a | b;
		int result1 = a & b;

		System.out.println("a & b = " + result);
		System.out.println("a | b = " + result1);
		System.out.println(false && (10 / 0 > 1));

		int a1 = 10;
		int b1 = 20;

		//int minimum = (a1 < b1) ? a1 : b1;//10
		int max = (a1 > b1) ? a1 : b1;
		int minimum = (a1 < b1) ? b1 : a1;//20

		System.out.println(minimum);
		System.out.println(max);

	}

}
