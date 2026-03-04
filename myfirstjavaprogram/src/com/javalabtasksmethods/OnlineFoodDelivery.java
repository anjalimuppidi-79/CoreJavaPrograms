/*Online Food Order System
Scenario:
A customer orders food from a restaurant.
Create methods:
double calculateItemTotal(double price, int quantity)
double addGST(double amount) → GST = 5%
double addDeliveryCharge(double amount) → Delivery = 40
void printBill(double finalAmount)
👉 Flow:
Item total → GST → Add delivery → Print final bill
Each method must return value except print method.*/


package com.javalabtasksmethods;
import java.util.Scanner;


public class OnlineFoodDelivery {
	
	static double calculateItemTotal(double price, int quantity) {
		 double calItem=price*quantity;
		 return calItem;
		
	}
	static double addGst(double calItem) {
		 double amount1=0.05*calItem;
		 return calItem+amount1;
	}
	static double addDeliveryCharge(double amount1) {
		double adcharge=40+amount1;
		return adcharge;
	}
	static void printBill(double adcharge) {
		double finalPrice=adcharge;
	    System.out.println("Final Amount:"+finalPrice);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter price of the item:");
		double p=sc.nextDouble();
		System.out.println("enter quantity of item:");
		int q=sc.nextInt();
	    printBill(addDeliveryCharge(addGst(calculateItemTotal(p,q))));
	
		sc.close();
	
	}

}
