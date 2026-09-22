package com.java;

public class Student {
	int sid;
	String sname;
	Student(){
		
	}
	Student(int sid,String sname){
		
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		
		
		s1.sid = 101;
		s1.sname = "sathvika";
		s1.studentinfo();
		
		Student s2 = new Student();
		s2.studentinfo();
		
		Student s3 = new Student(102,"Yashnaaa");
		s3.studentinfo();
		
		
	}
	void studentinfo() {
		System.out.println("Student id:"+sid);
		System.out.println("Student name:"+sname);
	}

}



