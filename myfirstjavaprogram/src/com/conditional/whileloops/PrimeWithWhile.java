package com.conditional.whileloops;

public class PrimeWithWhile {

	public static void main(String[] args) {
		int i = 2;
		int num = 22;
		int count = 0;
		while (i < num / 2) {
			if (num % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 0) {
			System.out.println("Given number " + num + " is prime!!");
		} else {
			System.out.println("Given number " + num + " is not a prime!!");
		}

	}

}
