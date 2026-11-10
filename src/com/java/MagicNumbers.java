package com.java;

import java.util.Scanner;

public class MagicNumbers {

	public static void main(String[] args) {
		System.out.println("Main Method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		while (n < 9) {
			int sum = 0;

			while (n > 0) {
				int r = n % 10;
				sum = sum + r;
				n = n / 10;
			}
			n = sum;

		}
		if (n == 1) {
			System.out.println("Magic");

		} else {
			System.out.println("not magic");
		}

	}

}
