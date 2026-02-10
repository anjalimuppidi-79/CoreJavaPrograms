package com.javaintroduction;

// Program to calculate how many pencils a person can buy
// If a person has 100 rupees and each pencil costs 7 rupees

public class Task1 {

    // Total money the person has
    int a = 100;

    // Cost of one pencil
    int b = 7;

    // Remaining amount after buying pencils
    // % (modulus) gives the remainder
    int c = a % b;

    public static void main(String[] args) {

        // Creating object to access instance variables
        Task1 t = new Task1();

        // Printing total amount
        System.out.println("Total Amount: " + t.a);

        // Printing cost of one pencil
        System.out.println("Pencil cost: " + t.b);

        // Printing remaining amount after purchase
        System.out.println("Remaining Amount: " + t.c);
    }
}
