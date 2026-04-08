package com.corejavafundamentals;
//write a java program to find area of Triangle

public class AreaOfTriangle {
	int b = 5;
	int h = 6;
	float Area;

	public static void main(String[] args) {
		AreaOfTriangle a = new AreaOfTriangle();
		a.Area = (a.b * a.h) / 2;
		System.out.println("Area of Triangle:" + a.Area);

	}

}
