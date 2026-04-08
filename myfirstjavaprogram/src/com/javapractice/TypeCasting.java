//17-03-2026
//Write a program to demonstrate type casting.
package com.javapractice;

public class TypeCasting {
	int a = 200;
	byte b = (byte) a;
	double d = 98578.9988;
	short s = (short) d;
	float f = 9988477.6f;
	int i = (int) f;
	long l = i;
	int i1 = (int) l;
	float f1 = l;
	double d1 = f1;

	public static void main(String[] args) {
		TypeCasting t1 = new TypeCasting();
		t1.display();

	}

	void display() {
		System.out.println("Type Casting from int to byte:" + b);
		System.out.println("Type Casting from double to short:" + s);
		System.out.println("Type Casting from float to int:" + i);
		System.out.println("Type Casting from int to long:" + l);
		System.out.println("Type Casting from long to int:" + i1);
		System.out.println("Type Casting from long to float:" + f1);
		System.out.println("Type Casting from float to double:" + d1);

	}

}
