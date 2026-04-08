//01-04-2026
//WAP to print fibonacci seriesn 
//0 1 1 2 3 5 8 13 21 34
//0+1=1
//1+1=2
//1+2=3
//2+3=5
//3+5=8
//5+8=13
//8+13=21
//13+21=34

package com.conditional.loops;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1+ " " +n2);
		for (int i = 0; i <= 10-2; i++) {
			n3 = n1 + n2;// 1
			n1 = n2;// 1
			n2 = n3;// 1
			System.out.print(" "+n3);
		}

	}

}
