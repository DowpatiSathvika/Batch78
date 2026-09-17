package com.java;

public class Methodsdemo {

	public static void main(String[] args) {
	Methodsdemo m1 = new Methodsdemo();
	int r=10;
	m1.divison(50, 9);

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
	
}
