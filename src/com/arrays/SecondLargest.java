package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {

        int arr[] = {7, 5, 8, 26, 26, 13};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > highest) {

                secondHighest = highest;
                highest = arr[i];

            } else if (arr[i] > secondHighest && arr[i] != highest) {

                secondHighest = arr[i];
            }
        }

        System.out.println("Second Highest Number: " + secondHighest);
    }
}
	


