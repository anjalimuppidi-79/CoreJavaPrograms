//15)print * * * * * 
//          * * * * 
//           * * * 
//            * * 
//             *
package com.java.patterns;

public class Patterns15 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {// this for loop for spaces
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {// this for stars
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
