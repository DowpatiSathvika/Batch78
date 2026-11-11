package com.arrays;


public class PositiveNegativeNumbers {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		int numbers[]= {1,2,-3,4,5,6,-7,8,-9,0};
		int positive = 0;
		int negative =0;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>=0) {
				positive++;
			}else {
				negative++;
				
			}
			
		}
		System.out.println("Positive Numbers : "+positive);
		System.out.println("Negative Numbers : "+negative);
	}



		
		
	}

	


