package com.java;

public class Students {
	static String name;
	int age;
	String college;
	void display() {
		name = "Sathvika";
		age = 22;
		college = "vrk";
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("college:"+college);
	}

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.display();
	}

}
