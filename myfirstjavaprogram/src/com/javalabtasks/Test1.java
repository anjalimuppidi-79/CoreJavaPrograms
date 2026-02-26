package com.javalabtasks;

// Program to calculate number of notes and coins
// for a given amount using division (/) and modulus (%)

class Test3 {

    public static void main(String[] args) {

        // Total amount to be divided into denominations
        int amount = 6688;

        // Printing the total amount
        System.out.println("Total Amount: " + amount);
        System.out.println("---------------------------");

        // ===== 2000 Notes =====
        int notes2000 = amount / 2000;   // Divide amount by 2000 to get number of 2000 notes
        amount = amount % 2000;          // Update amount with remaining value

        // ===== 500 Notes =====
        int notes500 = amount / 500;     // Divide remaining amount by 500
        amount = amount % 500;           // Update remaining amount

        // ===== 100 Notes =====
        int notes100 = amount / 100;     // Divide remaining amount by 100
        amount = amount % 100;           // Update remaining amount

        // ===== 50 Notes =====
        int notes50 = amount / 50;       // Divide remaining amount by 50
        amount = amount % 50;            // Update remaining amount

        // ===== 20 Notes =====
        int notes20 = amount / 20;       // Divide remaining amount by 20
        amount = amount % 20;            // Update remaining amount

        // ===== 10 Notes =====
        int notes10 = amount / 10;       // Divide remaining amount by 10
        amount = amount % 10;            // Update remaining amount

        // ===== 5 Rupees Coins =====
        int coins5 = amount / 5;         // Divide remaining amount by 5
        amount = amount % 5;             // Update remaining amount

        // ===== 2 Rupees Coins =====
        int coins2 = amount / 2;         // Divide remaining amount by 2
        amount = amount % 2;             // Update remaining amount

        // ===== 1 Rupee Coins =====
        int coins1 = amount;             // Whatever amount is left is 1 rupee coins

        // ===== Printing Results =====
        System.out.println("2000 Notes: " + notes2000);
        System.out.println("500 Notes: " + notes500);
        System.out.println("100 Notes: " + notes100);
        System.out.println("50 Notes: " + notes50);
        System.out.println("20 Notes: " + notes20);
        System.out.println("10 Notes: " + notes10);
        System.out.println("5 Rupees Coins: " + coins5);
        System.out.println("2 Rupees Coins: " + coins2);
        System.out.println("1 Rupee Coins: " + coins1);
    }
}