package com.javaintroduction;
class Program {
	
	@Override
	protected void finalize() throws Throwable{
	  System.out.println("finalize method called");	
	}
	
	static Program p=new Program();
	static void hello() {
		System.out.println("hello methodstarted");
		 Program p11=new Program();
		 System.out.println(p11);
		 System.out.println("Hello method ended");
		 
	}

	
	public static void main(String[] args)
	{
		
		Program p1=new Program();
		Program p2=new Program();
		Program p3=new Program();
		System.out.println(p1);//it going to print address of
		//this object it will take address from ram
		//output:com.javaintroduction.Program@2b2fa4f7
		
		System.out.println(p2);//o/p:com.javaintroduction.Program@2b2fa4f7
		//com.javaintroduction.Program@1dbd16a6--allocates memory
		
		System.out.println(p3);//com.javaintroduction.Program@7ad041f3
		
		System.out.println(p);
		//o/p:com.javaintroduction.Program@2b2fa4f7
		//com.javaintroduction.Program@1dbd16a6
		//com.javaintroduction.Program@7ad041f3
		//com.javaintroduction.Program@251a69d7

		//we need to request system can go and collect the gc
		//runs the garbage collector in the jvm
		//calling the gc method suggests that the jvm
		//expend effort toward recycling unused obj in order to make the 
		//memory they currently occupy available for reuse by the jvm.
		System.gc();
		//this will ask jvm to remove objects
		//how jvm can know unused obj
		//there are few steps how can we make obj unused
		//1.Nullifying the object.
		//2.re-assigning the object
		//3.Anonymous object
		//Isolation of Island at this area jvm can understand unused objts
		//every concept going to learn through JAVA API
		/*java.lang
		  java.math
		  java.util
		  java.util.
		 every class parent cls  is object cls
		 finalize method is available with obj class-called by gc
		 on an object when gc determines that there ae no more 
		 references to the object.
		 we can override the finalize method.
		 when unsed data will called
		 
		 
		 *///1)nullifying objects
		p3=null;
		//2)reassigning objects
		Program p4=new Program();
		p4=p2;//re-assign the object using same memory
		//3)
		//creating anonymous objects
		new Program();
		
		//4)
		hello();//object inside the methods eligible for garbage.
		
		System.out.println(p3);
		System.out.println(p1);//it going to print address of
		//this object it will take address from ram
		//output:com.javaintroduction.Program@2b2fa4f7
		
		System.out.println(p2);//o/p:com.javaintroduction.Program@2b2fa4f7
		//com.javaintroduction.Program@1dbd16a6--allocates memory
		
		System.out.println(p3);//com.javaintroduction.Program@7ad041f3
		
		System.out.println(p);
		//finalize method called by gc 
		//this is one way that is nullifying objects.
		System.out.println(p4);
		
		
		
				
	}
}
