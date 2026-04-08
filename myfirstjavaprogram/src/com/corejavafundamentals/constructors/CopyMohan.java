package com.corejavafundamentals.constructors;

public class CopyMohan {
	int age;
	String name;
	String city;
	CopyMohan(String name,String city){
		this.name=name;
		this.city=city;
		System.out.println("Name:"+name);
		System.out.println("city:"+city);
		
	}
	CopyMohan(CopyMohan c,int age){
		this.name=c.name;
		this.city=c.city;
		this.age=c.age;
		System.out.println("obj 2 data");
		System.out.println("Name:"+name);
		System.out.println("city:"+city);
		System.out.println("age"+age);
		
	}
    
	public static void main(String[] args) {
		CopyMohan c1=new CopyMohan("abc","hyd");
		CopyMohan c2=new CopyMohan(c1,20);
		

	}

}
