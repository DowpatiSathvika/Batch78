package com.java;

public class Employe {
	int id;
	String name;
	double salary;
	Employe(){
		 id =1;
		 name = "sathvika";
		 salary = 100000.00;
	}
	
		Employe(int id, String name,double salary){
		this.id =id;
		this.name = name;
		this.salary = salary;
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		Employe e = new Employe();
		e.Employeinfo();
		
		Employe e1 = new Employe(2,"Yashnaaa",150000.00);
		e1.Employeinfo();
		Employe e2 = new Employe();
		
		e2.id = 3;
		e2.name = "Tarak";
		e2.salary = 125000.00;
		e2.Employeinfo();
		
	}
	
	
	void Employeinfo() {
		System.out.println("Employe id:"+id);
		System.out.println("Employe name:"+name);
		System.out.println("salary:"+salary);
	}
	
	

}
