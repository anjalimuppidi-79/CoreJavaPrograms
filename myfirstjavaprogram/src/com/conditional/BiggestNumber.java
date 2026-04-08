//23-03-2026
/*Q9 (Biggest of 3 numbers)

👉 Without using loops
👉 Input: a, b, c
👉 Output: largest number*/
/*package com.conditional;

public class BiggestNumber {

	public static void main(String[] args) {
		int a = 200;
		int b = 500;
		int c = 1000;
		if (a > b && a > c) {
			System.out.println("a is largest number");
		} else if (b > a && b > c) {
			System.out.println("b is largest number");
		} else {
			System.out.println("c is largest number");
		}
	}
}
*/

//for nested-if

package com.conditional;

public class BiggestNumber {

	public static void main(String[] args) {
		int a = 200;
		int b = 500;
		int c = 1000;
		if (a > b) {
			if (a > c) {
				System.out.println("a is larger number");
			} else {
				System.out.println("c is larger number");
			}
		} else {
			if (b > c) {
				System.out.println("b is larger number");
			} else {
				System.out.println("c is larger number");
			}
		}
	}
}
