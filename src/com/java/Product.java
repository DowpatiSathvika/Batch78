package com.java;

public class Product {
	int id;
	String name;
	double price;
	int quantity;
	
	Product(int id,String name,double price,int quantity){
		this.id=id;
		this.name = name;
		this.price=price;
		this.quantity=quantity;
	}

	public static void main(String[] args) {
		Product p = new Product(1,"soap",50.00,1);
		
		
	}

	void display() {
		System.out.println("Product id is :"+id);
		System.out.println("Product name is :"+name);
		System.out.println("Product price is :"+price);
		System.out.println("Product quantity is :"+quantity);
	}
	void calculateTotal() {
		System.out.println("Total:"+price*quantity);
	}
}
