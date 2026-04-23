//19)print *********
//          *******
//           *****
//            ***
//             *
//            ***
//           *****
//          *******
//         *********

package com.java.patterns;

public class Patterns19 {

	public static void main(String[] args) {

		int i, j, space = 0, star = 9;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if (i < 5) {
				star = star - 2;
				space = space + 1;
			} else {
				star = star + 2;
				space = space - 1;
			}
			System.out.println();

		}

	}

}
