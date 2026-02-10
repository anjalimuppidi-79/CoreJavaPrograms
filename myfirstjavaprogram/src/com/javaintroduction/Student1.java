package com.javaintroduction;

public class Student1 {
	// instance variable declaration
	int sid;
	String sname;
   // static variable declration
	static int collegeId = 111;
	static String collegeName = "Education";
   //
	void main(String[] args) {
		System.out.println("------------stu1------------");
		System.out.println("collegeid:" + collegeId);
		System.out.println("collegename:" + collegeName);
		//object creation
		Student1 s1 = new Student1();
		s1.sid = 1;
		s1.sname = "sony";
		System.out.println("Stuid:" + s1.sid);
		System.out.println("stuname:" + s1.sname);

		System.out.println("stu2 info");
		System.out.println("collegeid:" + collegeId);
		System.out.println("collegename:" + collegeName);
		Student1 s2 = new Student1();
		s2.sid = 2;
		s2.sname = "honey";
		System.out.println("Stuid:" + s2.sid);
		System.out.println("stuname:" + s2.sname);
		//initialization
		collegeId=222;
		collegeName="vcube";
		//object3
		Student1 s3 = new Student1();
		//initialization
		s3.sid=3;
		s3.sname="priya";
		System.out.println("collegeId:"+collegeId);
		System.out.println("collegeName:"+collegeName);
		
		System.out.println("stuid:"+s3.sid);
		System.out.println("stuname:"+s3.sname);
		
		

	}

}
