package com.java;

public class BankAccount1 {
	
	static int balance = 1000;
	

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		deposit(500);
		withdrawal(300);
		RemainingBalance(balance);
		
		
		System.out.println("Main method ended");
	}
	static void deposit(int a) {
		balance=balance + a;
		System.out.println("deposit amount is"+ a);
		
	}
	static void withdrawal(int b) {
		balance = balance -b;
		System.out.println("withdrawal amount is"+ b);
		
	}
	static void RemainingBalance(int c) {
		System.out.println("RemainingBalance is"+ c);
		
	}
	

}
