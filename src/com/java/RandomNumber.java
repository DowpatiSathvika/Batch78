package com.java;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		Random rs = new Random();
		int rn = rs.nextInt(10)+1;
//		System.out.println(rn);
		int chances =1;
		int guess;
		
		
		while(chances<=3) {
			System.out.println("Enter the number between 1 and 10");
			guess = sc.nextInt();
			
			if(guess==rn) {
				System.out.println("Congratulations! You guessed the correct number");
				break;
			}
			else if(chances == 3) {
			    System.out.println("Game Over! The correct number is " + rn);
			}
			else if(guess<rn) {
			    System.out.println("Too low! try again");
			}
			else if(guess>rn) {
			    System.out.println("Too high! try again");
			}
			
			chances++;
			
		}
		
	}

}
