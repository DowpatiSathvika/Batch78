package com.arrays;

public class OrderOfElements2 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int arr[] = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 0 };
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int a = arr[i];
				arr[i] = arr[j];
				arr[j] = a;
				j++;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
	}
}
