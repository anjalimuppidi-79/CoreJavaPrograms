package com.conditional.whileloops;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
	    int i=1;
		System.out.print(n1+ " "+n2);
		while(i<=10-2) {
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			i++;
		}
		

	}

}
