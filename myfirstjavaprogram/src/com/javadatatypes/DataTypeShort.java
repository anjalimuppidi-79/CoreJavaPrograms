package com.javadatatypes;

//"short" is the most rarely used data type in java
//Range:-32768 to 32787
public class DataTypeShort {
	// instance variable we can access this variables by creating object
	short x = 32767;
	short y = -32768;
	// short z=32769;//Compile-time error:Type mismatch: cannot convert from int to
	// short
	// short a = false;//Compile-time error:Type mismatch: cannot convert from
	// boolean to short
	// short b = "java";//compile-time error:Type mismatch: cannot convert from
	// String to short

	public static void main(String[] args) {
		// creating object
		DataTypeShort s1 = new DataTypeShort();
		System.out.println(s1.x);
		System.out.println(s1.y);
		/*
		 * System.out.println(s1.a); System.out.println(s1.b);
		 */

	}

}
