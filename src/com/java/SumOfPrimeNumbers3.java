package com.java;

import java.util.Scanner;

public class SumOfPrimeNumbers3 {
	public static void main(String[] args) {

	    System.out.println("Main method started");

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the number:");
	    int n = sc.nextInt();

	    int sum = 0;

	    for(int i = 1; i <= n; i++) {

	        if(isPrime(i)) {

	            sum = sum + i;

	        }
	    }

	    System.out.println("Sum of Prime Numbers: " + sum);

	    sc.close();
	}

	static boolean isPrime(int n) {

	    if(n <= 1) {
	        return false;
	    }

	    for(int i = 2; i < n; i++) {

	        if(n % i == 0) {
	            return false;
	        }
	    }

	    return true;
	}
}
