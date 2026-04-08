//06-04-2026
//Basic program an array

package com.array;

public class Array1 {
	// Main method: entry point of the Java program
	public static void main(String[] args) {
		// Declaring an array of type byte with size 5
        // Default values will be 0
		String[] name = new String[5];
		name[0] = "Advith";
		name[1] = "Vihan";
		name[2] = "sunny";
		name[3] = "Laddu";
		name[4] = "chitti";
		for (int i = 0; i < name.length; i++) {
			System.out.println("Name of the student:" + name[i]);
		}

	}

}
