package com.arrays;

import java.util.Scanner;

public class EvenOddNumbers1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		int numbers[]= new int[size];
		int even = 0;
		int odd = 0;
		System.out.println("Enter the Numbers:");
		
		for(int n:numbers) {
			numbers[n]=sc.nextInt();
			if(numbers[n]%2==0) {
				even++;
			}else {
				odd++;
				
			}
			
		}
		System.out.println("Even Numbers : "+even);
		System.out.println("Odd Numbers : "+odd);
	}

}
