package com.java;

public class ObjCount {
	static int count = 0;
	{
		count++;
	}

	public static void main(String[] args) {
	ObjCount c1 = new ObjCount();
	ObjCount c2 = new ObjCount();
	System.out.println(count);

	

	}

}
