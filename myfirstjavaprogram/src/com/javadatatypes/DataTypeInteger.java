package com.javadatatypes;
//Integer data Type 
//The mostly used data type is int
//Range:-2147483648  to 2147483648
public class DataTypeInteger {
	static int a=-2147483648;
	//static int b=2147483649; //compile-time error:The literal 2147483649 of type int is out of range
	//static int c=233456879799; //Type mismatch: cannot convert from long to int
	//static int d=234566789099L; //Type mismatch: cannot convert from long to int
	//static int m=true; //Type mismatch: cannot convert from boolean to int
	
	public static void main(String[] args) {
		System.out.println(a);
		/*
		 * System.out.println(b); 
		 * System.out.println(c); 
		 * System.out.println(d);
		 * System.out.println(m);
		 */
	}

}
