package com.javalabtasks;
public class Question1 {

    static int firstValue;

   public static void m1(int givingValueFromMainMethod){
   
        System.out.println(givingValueFromMainMethod);

    }
   public static void m2(int secondValue){

        int sum = firstValue+secondValue;
        System.out.println(sum);
    }


    public static void main(String[] args) {

        m1(20);
        m2(30);

    }
}
