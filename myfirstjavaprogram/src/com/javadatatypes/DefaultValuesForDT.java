package com.javadatatypes;

public class DefaultValuesForDT {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	boolean boo;
	static byte by;
	static short sh;
	static int in;
	static long lo;
	static float fl;
	static double de;
	static char cha;
	static boolean bool;

	public static void main(String[] args) {
		// to instance variables we need to create object to access instance variable in
		// static area
		DefaultValuesForDT d1 = new DefaultValuesForDT();
		// Accessing instance variables those var default values
		System.out.println("byte default vale:" + d1.b);// 0
		System.out.println("short default vale:" + d1.s);// 0
		System.out.println("int default vale:" + d1.i);// 0
		System.out.println("long default vale:" + d1.l);// 0
		System.out.println("float default vale:" + d1.f);// 0.0
		System.out.println("double default vale:" + d1.d);// 0.0
		System.out.println("byte default vale:" + d1.ch);// space or '\u0000'
		System.out.println("byte default vale:" + d1.boo);// false
		// accessing static variables
		System.out.println("byte default vale:" + by);// 0
		System.out.println("short default vale:" + sh);// 0
		System.out.println("int default vale:" + in);// 0
		System.out.println("long default vale:" + lo);// 0
		System.out.println("float default vale:" + fl);// 0.0
		System.out.println("double default vale:" + de);// 0.0
		System.out.println("byte default vale:" + cha);// '\u0000'
		System.out.println("byte default vale:" + bool);// false

	}

}
