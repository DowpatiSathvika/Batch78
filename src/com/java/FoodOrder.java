package com.java;

import java.util.Scanner;

public class FoodOrder {

	public static void main(String[] args) {
		int price=0;
		String item = null;	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Order here");
		
		System.out.println("1.Pizza – ₹200");
		System.out.println("2.Burger – ₹120");
		System.out.println("3.Biryani – ₹180");
		System.out.println("4.Noodles – ₹100");
		
		System.out.println("Enter the item:");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 ->{
			item = "pizza";
			price = 200;
			break;
		}
		case 2 ->{
			item = "Burger";
			price = 120;
			break;
		}
		case 3->{
			item = "Biryani";
			price = 180;
			break;
		}
		case 4 ->{
			item = "Noodles";
			price = 100;
			break;
		}
		}
		System.out.println("Enter the quantity");
		int quantity = sc.nextInt();
		int total = price*quantity;
		System.out.println("item:"+item);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		System.out.println("Total:"+total);
		sc.close();
	}

}
