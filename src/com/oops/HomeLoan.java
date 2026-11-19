package com.oops;

import java.util.Scanner;

public class HomeLoan extends LoanImpl{
	static Scanner sc = new Scanner(System.in);
	
	void homeLoanDocInfo() {
		System.out.println("All documents are verified!!");
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Welcome to Vcube Home Loan");
		
		HomeLoan hl = new HomeLoan();
		boolean aadhar = hl.isAadharValid();
		boolean pan = hl.isPanValid();
		boolean phone = hl.isPhoneValid();
		double salary = hl.getCustomerSalary();
		int age = hl.getAge();
		int cibil = hl.getCibilScore();
		
		if (salary >= 100000.00 && age >= 23 && cibil >= 300 && cibil <= 900) {
			System.out.println("Congratulations!! You are eligible for loan");
			System.out.println("Your Rate Of Interest is:" + hl.getROI());

		} else {
			System.out.println("Focus on your career!!");
			System.out.println("Sorry for the inconvenience!! Your loan got rejected!!");
		}
		System.out.println("Main method ended");
	}



	}


