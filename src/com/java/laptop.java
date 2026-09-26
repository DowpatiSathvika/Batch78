package com.java;

public class laptop {
	String brand;
	String model;
	String color;
	double price;
	int year;
	
	
	laptop(){
		this("hp");
	}
	
	laptop(String brand){
		this(brand,"pavillion");
	}
	
	laptop(String model,String brand){
		this(model,brand,"grey");
		
	}
	laptop(String model,String brand,String color){
		this(brand,model,color,80000.00);
	}
	laptop(String model,String brand,String color,double price){
		this(brand,model,color,price,2020);
	
	}
	laptop(String model,String color,String brand,double price,int year){
		this.model = model;
		this.color = color;
		this.brand = brand;
		this.year = year;
		this.price = price;
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to vube laptop store");
		
		laptop l = new laptop();
		l.laptopinfo();
		
		laptop l1 = new laptop("hp");
		l1.laptopinfo();
		
		laptop l2 =new laptop("hp","pavillion");
		l2.laptopinfo();
		
		laptop l3 = new laptop("hp","pavillion","grey");
		l3.laptopinfo();
		
		laptop l4 = new laptop("hp","pavillion","grey",80000.00);
		l4.laptopinfo();
		
		laptop l5 = new laptop("hp","pavillion","grey",80000.00,2020);
		l5.laptopinfo();
		
		System.out.println("main method ended");
		
	}
	void laptopinfo() {
		System.out.println("****************************");
		System.out.println("Brand of the laptop : " + brand);
		System.out.println("Model of the laptop : " + model);
		System.out.println("Price of the laptop : " + price);
		System.out.println("Color of the laptop : " + color);
		System.out.println("Year of the laptop : " + year);

	}

	

}
