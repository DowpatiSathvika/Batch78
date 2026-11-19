package com.oops;

public class Cars extends Vehicles {
	int speed;
	
	@Override
	void display() {
		System.out.println("Car speed:"+speed);
	}
	
	public static void main(String[]args) {
		Vehicles v = new Cars();
		System.out.println(v.speed);
		v.display();
	}

}
