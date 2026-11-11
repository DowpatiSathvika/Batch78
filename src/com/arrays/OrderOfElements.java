package com.arrays;

public class OrderOfElements {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int arr[]= {1,0,2,0,3,0,4,0,5,0,6,0,0};
		int n = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]+"");
				n++;
			}
			
		}
		for(int i=0;i<arr.length-n;i++) {
		System.out.println("0"); 
		
	}

}
}
