package com.arrays;

public class RoundingNumbers {
	public static void main(String[] args) {
		int arr[]={99,95,71,84,81,75,60};
		
		for(int i=0;i<arr.length;i++) {
			int lastdigit=arr[i]%10;
			if(lastdigit<6) {
				arr[i]=arr[i]-lastdigit;
			}else if(lastdigit>6) {
				arr[i] = arr[i] + (10 - lastdigit);
			}
		}
		for(int i = 0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}

}



