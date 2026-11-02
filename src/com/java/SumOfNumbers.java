package com.java;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		int sum = 0;
		
		
		for(int i=1;i<=n;i++) {
			if(i%3==0 & i%5==0) {
			sum = sum +i;
			
			
		}
			
		}
		System.out.println("The result is:"+sum);
	
		System.out.println("Main method ended");
	}

}
