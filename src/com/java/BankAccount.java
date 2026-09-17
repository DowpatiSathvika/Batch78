package com.java;



public class BankAccount {

	
		int Accno;
		String accholdername;
		int balance;
		 static int accountNoGenerator = 1000;
		 {
		 accountNoGenerator++;
		 Accno = accountNoGenerator++;
		 }
		
		

		public static void main(String[] args) {
			BankAccount b1 = new BankAccount();
			b1.Accno = 1;
			b1.accholdername = "sathvika";
			b1.balance = 5000;
			
			
			System.out.println("b1.Accno:"+b1.Accno);
			System.out.println("b1.accholdername:"+b1.accholdername);
			System.out.println("b1. balance:"+b1. balance);
			

		}

	}
