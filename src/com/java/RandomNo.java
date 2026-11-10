package com.java;

import java.util.Random;
import java.util.Scanner;

public class RandomNo {

	public static void main(String[] args) {

		System.out.println("Main method started");

		Scanner sc = new Scanner(System.in);
		Random rs = new Random();

		int rn = rs.nextInt(10) + 1;

		int guess;

		for (int chances = 1; chances <= 3; chances++) {

			System.out.println("Enter the number between 1 and 10");

			guess = sc.nextInt();

			if (guess == rn) {

				System.out.println("Congratulations! You guessed the correct number");
				break;

			} else if (chances == 3) {

				System.out.println("Game Over! The correct number is " + rn);

			} else if (guess < rn) {

				System.out.println("Too low! Try again");

			} else if (guess > rn) {

				System.out.println("Too high! Try again");

			}
		}

		sc.close();
	}

}
