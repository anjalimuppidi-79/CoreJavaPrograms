package com.javapractice;

public class Assignment {

    public static void main(String[] args) {

        int result = 10;

        int addValue = 75;
        result += addValue;
        System.out.println("Result after += : " + result);

        int subValue = 25;
        result -= subValue;
        System.out.println("Result after -= : " + result);

        int mulValue = 3;
        result *= mulValue;
        System.out.println("Result after *= : " + result);

        result /= mulValue;
        System.out.println("Result after /= : " + result);

        result %= 2;
        System.out.println("Result after %= : " + result);

        // Demonstrating type casting behavior
        int result1 = 10;
        double d = 89.0;

        result1 += d;
        System.out.println("Result after += with double: " + result1);

        double d1 = 9.7;
        result1 -= d1;
        System.out.println("Result after -= with double: " + result1);
    }
}