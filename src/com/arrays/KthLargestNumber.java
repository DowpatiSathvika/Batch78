package com.arrays;

import java.util.Scanner;

public class KthLargestNumber {

	public static void main(String[] args) {

		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a[] = { 4, 5, 7, 1, 3 };

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			count = 0;

			for (int j = 0; j < a.length; j++) {

				if (a[i] < a[j]) {
					count++;
				}

			}

			if (count == k - 1) {
				System.out.println(k + "th largest element is: " + a[i]);
				break;
			}

		}

	}
}
