//13-mar-2026
  /*Simple Interest Calculator
Write a program to calculate Simple Interest.
Formula:
SI = (P × T × R) / 100
Where:
P = Principal
T = Time
R = Rate*/

package com.javaoperators;

public class ArithmeticOper {
	int p = 20;
	int t = 125;
	int r = 1500;
	int simpleInterest;

	void displaySI() {
		simpleInterest = (p * t * r) / 100;
		System.out.println("Simple Interest:" + simpleInterest);

	}

	public static void main(String[] args) {
		ArithmeticOper a1 = new ArithmeticOper();
		a1.displaySI();

	}

}
