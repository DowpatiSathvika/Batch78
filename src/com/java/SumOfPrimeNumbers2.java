package com.java;

public class SumOfPrimeNumbers2 {
    public static void main(String[] args) {

        int sum = 0;

        for(int n = 1; n <= 50; n++) {

            int count = 0;

            for(int i = 1; i <= n; i++) {
                if(n % i == 0) {
                    count++;
                }
            }

            if(count == 2) {
                sum = sum + n;
            }
        }

        System.out.println("Sum = " + sum);
    }
}










