package com.javaintroduction;

public class Student {
	//Declaration of instance variables
	int sid;
	String sname;
	//Declaration  of static variables
	static int collegeId=1234;
	static String collegeName="SCIET";

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("****Stu1 Info****");
		System.out.println("College Id:" + collegeId);
		System.out.println("College Name:" + collegeName);
		//to access instance variable at static area we need to create objects
		Student s1=new Student();
		s1.sid=1;
		s1.sname="Advith";
		System.out.println("Student Id:"+s1.sid);
		System.out.println("student Name:" + s1.sname);
		
		System.out.println("****Stu2 Info****");
		System.out.println("College Id:" + collegeId);
		System.out.println("College Name:" + collegeName);
		Student s2=new Student();
		s2.sid=2;
		s2.sname="Vihan";
		System.out.println("Student Id:"+s2.sid);
		System.out.println("student Name:" + s2.sname);
		
		System.out.println("****Stu3 Info****");
		System.out.println("College Id:" + collegeId);
		System.out.println("College Name:" + collegeName);
		Student s3=new Student();
		s3.sid=3;
		s3.sname="Narender";
		System.out.println("Student Id:"+s3.sid);
		System.out.println("student Name:" + s3.sname);
		
		System.out.println("****Stu3 Info****");
		collegeId=5678;
		collegeName="Sri Indu College of Engineering and Technology";
		System.out.println("College Id:" + collegeId);
		System.out.println("College Name:" + collegeName);
		Student s4=new Student();
		s4.sid=4;
		s4.sname="Ajay";
		System.out.println("Student Id:"+s4.sid);
		System.out.println("student Name:" + s4.sname);
		
		System.out.println("****Stu3 Info****");
		System.out.println("College Id:" + collegeId);
		System.out.println("College Name:" + collegeName);
		Student s5=new Student();
		s5.sid=5;
		s5.sname="Aravind";
		System.out.println("Student Id:"+s5.sid);
		System.out.println("student Name:" + s5.sname);	

	}

}
