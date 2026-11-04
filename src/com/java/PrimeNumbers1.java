package com.java;

import java.util.Scanner;

public class PrimeNumbers1 {
	static boolean isPrime(int n) {
		boolean status = true;
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			
			}
		}
		return status;
	}
	

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("Enter the nth number you want to print:");
		int n1= sc.nextInt();
		
	
		
		for(int i=0;i<=n;i++){
			if(isPrime(i)) {
				count++;
				 if (count == n1) {
					 System.out.println(i+"-"+count);				
					 break;
	                }
				
				
			}
		}
		sc.close();
}

}
