package com.javalabtasksmethods;
//Write a java to count the number of objects created without using instance block.
public class Task1 {
	static int count=0;
	
	Task1(){
		count+=1;
		System.out.println("object count:"+count);
	}
	

	public static void main(String[] args) {
		Task1 t1=new Task1();//count =1
		Task1 t2=new Task1();//count=1+1=2
		Task1 t3=new Task1();
		Task1 t4=new Task1();
		Task1 t5=new Task1();
		Task1 t6=new Task1();
		
		

	}


}