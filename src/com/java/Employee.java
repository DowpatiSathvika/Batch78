package com.java;

public class Employee {
	int empid;
	byte age;
	short sal;
	char grade;
	float yearsofexp;
	boolean active_status;
	int noofleaves;
	long phnno;
	void display() {
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empid = 101;
		e1.age = 28;
		e1.sal = 8000;
		e1.grade= 'A';
		e1.yearsofexp = 3.5f;
		e1.active_status = true;
		e1.noofleaves = 5;
		e1.phnno = 9966966918L;
		System.out.println("empid:"+e1.empid);
		System.out.println("age:"+e1.age);
		System.out.println("sal:"+e1.sal);
		System.out.println("grade:"+e1.grade);
		System.out.println("yearsofexp:"+e1.yearsofexp);
		System.out.println("active_status:"+e1.active_status);
		System.out.println("active_status:"+e1.active_status);
		e1.display();
		
	

	}

}
