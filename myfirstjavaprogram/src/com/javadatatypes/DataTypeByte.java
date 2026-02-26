package com.javadatatypes;

public class DataTypeByte {
	// about byte data type ,it is an integral data type,size of byte is
	// 2bytes=8bits
	// range of byte is from -128 to 127
	static byte a = 120;
	static byte b = 127;
	// static byte c = 128;// Type mismatch: cannot convert from int to byte becz by
	// default integral
	// datatypes are integers
	/*
	 * static byte d = -129;// Type mismatch: cannot convert from int to byte static
	 * byte e = 130; static byte f = true;// Type mismatch: cannot convert from
	 * boolean to byte static byte g = "Anjali";
	 */// Type mismatch: cannot convert from String to byte

	public static void main(String[] args) {
		System.out.println(a);// output is 120
		System.out.println(b);// 127
		//System.out.println(c);

		/*
		 * System.out.println(d); System.out.println(e);// error: incompatible types:
		 * possible lossy conversion from int to byte // Type mismatch: cannot convert
		 * from int to byte becz by default integral System.out.println(f);
		 * System.out.println(g);
		 */
	}
}
