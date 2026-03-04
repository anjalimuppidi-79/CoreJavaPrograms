//04-03-2026
/*🔟 Default vs No-Args Constructor Comparison
Problem
Create class Pen with variables:brand,price
First run program without constructor.
Then add no-args constructor assigning custom values.
Compare the outputs.*/

package com.corejavafundamentals.constructors;

public class Pen {
	String brand;
	int price;

	// No-Args Constructor
	Pen() {
		brand = "agni";
		price = 10;
	}

	public static void main(String[] args) {
		Pen obj = new Pen();
		System.out.println(obj.brand);// agni
		System.out.println(obj.price);// 10
		/*
		 * If we remove this constructor, output would be:
		 * 
		 * brand → null price → 0
		 */

	}

}
