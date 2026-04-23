//14)print * 
//        * * 
//       * * * 
//      * * * * 
//     * * * * *
package com.java.patterns;

public class Patterns14 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {//this for loop for spaces
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {//this for stars
				System.out.print("* ");
			}
			System.out.println();

		}
		

	}

}
