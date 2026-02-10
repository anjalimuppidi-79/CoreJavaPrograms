package com.javaintroduction;

// Program to count how many objects are created in a class
public class TestDemo1 {

    // Static variable to store object count
    // Static means one common copy shared by all objects
    static int count = 0;

    public static void main(String[] args) {

        // Message to show program started
        System.out.println("Main method started");

        // Creating objects of TestDemo1 class
        // Every time an object is created, instance block runs
        TestDemo1 t1 = new TestDemo1();
        TestDemo1 t2 = new TestDemo1();
        TestDemo1 t3 = new TestDemo1();
        TestDemo1 t4 = new TestDemo1();

        // Printing total number of objects created
        System.out.println("Total objects created: " + count);
    }

    // Instance block
    // This block runs automatically whenever an object is created
    // It increases count by 1 for each new object
    {
        count += 1;
    }
}


