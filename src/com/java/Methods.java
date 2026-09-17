package com.java;

public class Methods {
	 static void method1(){
		System.out.println("method1 called");
	}
	static void method2(){
		method1();
		System.out.println("method2 called");
		
	}
	void method3(){
		method2();
		System.out.println("method3 called");
	}
	void method4(){
		method3();
		System.out.println("method4 called");
	}
	static {
		System.out.println("Static block called");
			}
	
	


	public static void main(String[] args) {
		Methods m1 = new Methods();
		m1.method4();
	
		
		

	}

}




	
