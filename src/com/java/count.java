package com.java;

public class count {
	static int count = 0;
	{
		count++;
	}

	public static void main(String[] args) {
	count c1 = new count();
	count c2 = new count();
	System.out.println(count);
		

	}

}
