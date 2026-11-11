package com.arrays;

public class EvenOddNumbers {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int numbers[]= {1,2,3,4,5,6,7,8,9};
		int even = 0;
		int odd =0;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				even++;
			}else {
				odd++;
				
			}
			
		}
		System.out.println("Even Numbers : "+even);
		System.out.println("Odd Numbers : "+odd);
	}

}
