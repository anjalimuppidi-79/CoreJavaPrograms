//18)print     *
//            ***
//           *****
//          *******
//         *********
//          *******
//           *****
//            ***
//             *

package com.java.patterns;

public class Patterns18 {

	public static void main(String[] args) {
		int star = 1, space = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			star = star + 2;
			space = space - 1;
			System.out.println();
		}
		int star1 = 7;
		int space1 = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star1; k++) {
				System.out.print("*");
			}
			space1 = space1 + 1;
			star1 = star1 - 2;
			System.out.println();
		}

	}

}

//alternative
//public class Pattern18 {
//	public static void main(String[] args) {
//		int i, j, k, star = 1, space = 4;
//		for (i = 1; i <= 9; i++) {
//			for (j = 1; j <= space; j++) {
//				System.out.print(" ");
//			}
//			for (k = 1; k <= star; k++) {
//				System.out.print("*");
//			}
//			if (i < 5) {
//				star = star + 2;
//				space = space - 1;
//			} else {
//				star = star - 2;
//				space = space + 1;
//			}
//			System.out.println();
//		}
//	}
//}
