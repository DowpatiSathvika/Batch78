package com.java;

public class Mobilebill {
	
	
	String model;
	int quantity;
	double price;
	double deliverycharges;
	double mcost;
	double finalbill;
	
	
	Mobilebill(){
		this("Apple");
	}
	
	Mobilebill(String model){
		this(model,1);
	}
	
	
	Mobilebill(String model,int quantity){
		this(model,quantity,80000.00);
	}
	
	Mobilebill(String model,int quantity,double price){
		this(model,quantity,80000.00,250.00);
	}
	
	Mobilebill(String model,int quantity,double price,double deliverycharges){
		this.model = model;
		this.quantity = quantity;
		this.price = price;
		this.deliverycharges = deliverycharges;
		mcost = price*quantity;
		finalbill = mcost+deliverycharges;
		
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Mobilebill m = new Mobilebill();
		m.Mobilebillinfo();
		
		System.out.println("Main method ended");
		
	}
	
	void Mobilebillinfo() {
		System.out.println("Model of the Mobile:"+ model);
		System.out.println("No.of Mobiles: "+ quantity);
		System.out.println("price of the Mobile is "+ price);
		System.out.println("Delivery charges applied for mobile:"+deliverycharges);
		System.out.println("Mobile cost:"+mcost);
		System.out.println("final bill:"+finalbill);
		
		
	}

}
