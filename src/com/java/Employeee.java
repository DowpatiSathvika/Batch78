package com.java;

public class Employeee {
	int empid;
	String empname;
	int empsal;

	public static void main(String[] args) {
		Employeee e1 = new Employeee();
		e1.empid = 101;
		e1.empname = "sathvika";
		e1.empsal = 60000;
		
		Employeee e2 = new Employeee();
		e2.empid = 102;
		e2.empname = "Yashnaaa";
		e2.empsal = 80000;
		
		Employeee e3 = new Employeee();
		e3.empid = 103;
		e3.empname = "Ammulu";
		e3.empsal = 70000;
		
		
		System.out.println(e1.empid);
		System.out.println(e1.empname);
		System.out.println(e1.empsal);
		
		System.out.println(e2.empid);
		System.out.println(e2.empname);
		System.out.println(e2.empsal);
		
		System.out.println(e3.empid);
		System.out.println(e3.empname);
		System.out.println(e3.empsal);

		

	}

}
