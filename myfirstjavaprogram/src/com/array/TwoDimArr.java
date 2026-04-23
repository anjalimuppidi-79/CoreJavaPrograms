package com.array;

public class TwoDimArr {

	public static void main(String[] args) {
		String[][] names = { { "Soumya", "Soujanya", "Anjali", }, { "Advith", "Vihan", "laddu" } };
		System.out.println(names);// [[Ljava.lang.String;@2b2fa4f7
		// representing
		/*
		 * for (int i = 0; i < names.length; i++) { for (int j = 0; j < names[i].length;
		 * j++) { System.out.print(names[i][j] + "     "); } System.out.println(); }
		 */
		for (String[] n1 : names) {
			for (String n : n1) {
				System.out.print(n + "   ");
			}
			System.out.println();
		}

	}

}
