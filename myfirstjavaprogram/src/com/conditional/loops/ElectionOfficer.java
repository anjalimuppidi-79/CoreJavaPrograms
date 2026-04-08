package com.conditional.loops;

import java.util.Scanner;

public class ElectionOfficer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eligibleCount = 0;
        int nonEligibleCount = 0;

        int oldest = 0;
        int youngest = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter age of person " + i + ": ");
            int age = sc.nextInt();

            // First input → initialize oldest & youngest
            if (i == 1) {
                oldest = age;
                youngest = age;
            }

            // Check eligibility
            if (age >= 18) {
                System.out.println("Eligible voter");
                eligibleCount++;
            } else {
                System.out.println("Non-eligible voter");
                nonEligibleCount++;
            }

            // Find oldest
            if (age > oldest) {
                oldest = age;
            }

            // Find youngest
            if (age < youngest) {
                youngest = age;
            }
        }

        // Final Output
        System.out.println("\n----- Results -----");
        System.out.println("Eligible voters: " + eligibleCount);
        System.out.println("Non-eligible voters: " + nonEligibleCount);
        System.out.println("Oldest voter age: " + oldest);
        System.out.println("Youngest voter age: " + youngest);

        sc.close();
    }
}