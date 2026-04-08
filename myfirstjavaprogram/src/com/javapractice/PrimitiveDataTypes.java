//17-03-2026
//Write a program to print all primitive data types values.

package com.javapractice;

public class PrimitiveDataTypes {
	byte b = 127;
	short s = 300;
	int i = 32378;
	long l = 998877665544L;
	float f = 98565.356f;
	double d = 3568900.975433678888;
	char c = 'A';
	char ch = 97;
	boolean moonLooksBeautiful = true;

	public static void main(String[] args) {

		PrimitiveDataTypes p1 = new PrimitiveDataTypes();
		p1.show();

	}

	void show() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(ch);
		System.out.println(moonLooksBeautiful);
	}

}
