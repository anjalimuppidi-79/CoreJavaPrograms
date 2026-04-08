package com.corejavafundamentals;

//Temperature converter
public class TemperatureConverter {
	double celsius = 30;
	double fah = ((celsius * 9 / 5) + 32);
	double c1 = ((fah - 32) * 5 / 9);
	double f1 = 90;
	double c = ((f1 - 32) * 5 / 9);

	public static void main(String[] args) {
		TemperatureConverter t1 = new TemperatureConverter();
		System.out.println("Celsius:" + t1.celsius);
		System.out.println("converstion from celsius to fahrenheit of " + t1.celsius + " is " + t1.fah);
		System.out.println("converstion from fahrenheit  to celsius of " + t1.fah + " is" + t1.c1);
		System.out.println("converstion from fahrenheit  to celsius of " + t1.f1 + " is" + t1.c);

	}

}
