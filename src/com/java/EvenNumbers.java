package com.java;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		System.out.println("Main method ended");
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i+ "");
				
			}
		}
			
			

	}

}
