package com.javaintroduction;

// Program to demonstrate Class.forName() usage
public class TestDemo {

    public static void main(String[] args) throws ClassNotFoundException {

        // This line prints when the program starts
        System.out.println("Main Method started");

        // Class.forName() is used to load a class at runtime
        // Here we are loading MySQL JDBC Driver class
        // When this class loads, its static block gets executed
        Class.forName("com.mysql.cj.jdbc.Driver"); // Driver is a class inside MySQL library

        // If the class is found and loaded successfully, this line will execute
        System.out.println("Class loaded successfully!!");
    }
}
