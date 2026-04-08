/* Write a Java program using for loop and if conditions to print numbers from 1 to 50:
Divisible by 3 → Fizz
Divisible by 5 → Buzz
Divisible by 3 and 5 → FizzBuzz*/

package com.conditional.loops;

public class Test {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("  FizzBuzz ");
			} else if (i % 5 == 0) {
				System.out.print(" Buzz ");
			} else if (i % 3 == 0) {
				System.out.print(" Fizz");
			} else {
				System.out.print(" " + i + " ");
			}
		}

	}

}
