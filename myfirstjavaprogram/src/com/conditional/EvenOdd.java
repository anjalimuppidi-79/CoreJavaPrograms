//22-03-2026
/*(Even/Odd + Positive/Negative)

👉 Input number
👉 Output:

Positive Even
Positive Odd
Negative Even
Negative Odd*/

package com.conditional;

public class EvenOdd {

	public static void main(String[] args) {
		int a = -44;
		if (a > 0) {
			if (a % 2 == 0) {
				System.out.println("Positive Even Number");
			} else {
				System.out.println("Positive odd Number");
			}
		} else {
			if (a % 2 == 0) {
				System.out.println("Negative Even Number");
			} else {
				System.out.println("Negative odd Number");
			}
		}

	}

}
