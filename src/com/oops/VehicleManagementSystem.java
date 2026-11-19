package com.oops;

public class VehicleManagementSystem {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.name = "bmw";
		c.speed = 120.00;
		System.out.println("Car name is:"+c.name);
		System.out.println("Car speed is:"+c.speed);
		c.start();
		c.sunroof();
		c.stop();
		
		Bike b = new Bike();
		b.name = "RE";
		b.speed = 120.00;
		System.out.println("Bike name is:"+b.name);
		System.out.println("Bike speed is:"+b.speed);
		b.start();
		b.dowheelie();
		b.stop();
		
		Truck t = new Truck();
		t.name = "Tata";
		t.speed = 100.00;
		System.out.println("Truck name is:"+t.name);
		System.out.println("Truck speed is:"+t.speed);
		t.start();
		t.loadCargo();
		t.stop();
		
	}

}
