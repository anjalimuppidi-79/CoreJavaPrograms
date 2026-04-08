//01-04-2026
//WAP to reverse a number
//ex:123455,reverse number 554321
//logic to get last digit to  get last number we use    we use num%10 here we get remainder 
//to get remaining digit we use num% 10 to get quotient 
//ex:123
//r=num%10=3;    num=num/10=12
//  num%10=2;          num/10=1
//   num%10=1;   10)1(0
//              0/1 

//reverse=rev*10+reminder
package com.conditional.whileloops;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int num = 123;
		int r = 0;
		int rev = 0;

		while (num > 0) {
			
			r = num % 10;// 3
			num = num / 10;// 12
			rev = rev * 10 + r;

		}
		System.out.println("Reverse of a given number is:" + rev);
	}

}
