package com.java;

public class Methodsdemo {

	public static void main(String[] args) {
	Methodsdemo m1 = new Methodsdemo();
	int r=10;
	m1.divison(50, 9);
	cube(10);
	average(5,3,2);
	si(20,5,2);
	Areaofrectangle(5,2);
	Methodsdemo m2 = new Methodsdemo();
	int l = 5;
	m2.Perimeterofcircle(l, 10);
	

	}
	
	void addition(int a,int b){
		System.out.println(a+b);
			
	}
	
	void subtraction(int m, int n) {
		System.out.println(m-n);
		int o = m-n;
		addition(o,15);
	}
	
	void multiplication(int p, int q) {
		System.out.println(p*q);
		int t = p*q;
		subtraction(t,4);
	}
	
	void divison(int x, int y) {
		System.out.println(x/y);
		int s=x/y;
		multiplication(s,3);
	}
	
	static void cube(int a) {
		System.out.println("cubing method started");
		System.out.println(a*a*a);
		
	}
	static void average(int a,int b, int c) {
		System.out.println((a+b)/2);
		System.out.println("Average method executed");
		
	}
	
	static void si(int a,int b, int c) {
		System.out.println((a*b*c)/100);
		System.out.println("Simple Interest method executed");
	}
	
	static void Areaofrectangle(int l,int b) {
		System.out.println(l*b);
		System.out.println(" Areaofrectangle method executed");
	}
	void Perimeterofcircle(int l,int b) {
		System.out.println (2*(l+b));	
		System.out.println(" Perimeterofrectangle method executed");
		
	}
}
	
	

