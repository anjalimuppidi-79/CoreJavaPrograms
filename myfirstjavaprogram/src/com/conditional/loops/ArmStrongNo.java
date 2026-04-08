package com.conditional.loops;

public class ArmStrongNo {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int count = String.valueOf(num).length();//to count number of digits
		int sum = 0;
		for (; num > 0; num = num / 10) {//already initialized num val
			int r = num % 10;
			sum += (int) (Math.pow(r, count));//math.pow is used to cal r^count(i.e,1^3)
		}
		System.out.println(sum == temp ? "ArmStrong" : "Not ArmStrong");

	}

}
