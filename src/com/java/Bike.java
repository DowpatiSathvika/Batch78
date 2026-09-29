package com.java;

class Vehicle {
	String model;
	String brand;
	double price;
	
	Vehicle(){
		System.out.println("No arg constructor called from vehicle");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started from vehicle");
		
	}
}
public class Bike extends Vehicle{
	Bike(){
		System.out.println("No arg constructor called from Bike");
	}
	
	Bike(String model,String brand,double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
		
	}
	


	public static void main(String[] args) {
		System.out.println("Main method started from Bike");
		Bike b1 = new Bike("RoyalEnfield","Classic",300000);
		b1.bikeinfo();
		
		
	}
	void bikeinfo() {
		System.out.println("Brand of the Bike : " + brand);
		System.out.println("Model of the Bike : " + model);
		System.out.println("Price of the Bike : " + price);
	}
}



