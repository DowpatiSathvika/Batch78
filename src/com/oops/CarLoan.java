package com.oops;

import java.util.Scanner;

public class CarLoan extends LoanImpl {

static Scanner sc = new Scanner(System.in);
	
	void CarLoanDocInfo() {
		System.out.println("All documents are verified!!");
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Welcome to Vcube car Loan");
		
		CarLoan cl = new CarLoan();
		boolean aadhar = cl.isAadharValid();
		boolean pan = cl.isPanValid();
		boolean phone = cl.isPhoneValid();
		double salary = cl.getCustomerSalary();
		int age = cl.getAge();
		int cibil = cl.getCibilScore();
		
		if (salary >= 100000.00 && age >= 23 && cibil >= 300 && cibil <= 900) {
			System.out.println("Congratulations!! You are eligible for loan");
			System.out.println("Your Rate Of Interest is:" + cl.getROI());

		} else {
			System.out.println("Focus on your career!!");
			System.out.println("Sorry for the inconvenience!! Your loan got rejected!!");
		}
		System.out.println("Main method ended");
	}



	}


