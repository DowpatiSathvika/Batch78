package com.oops;

import java.util.Scanner;

public class GoldLoan extends LoanImpl  {

	static Scanner sc = new Scanner(System.in);

	void GoldLoanDocInfo() {
		System.out.println("All documents are verified!!");
	}

		public static void main(String[] args) {
			System.out.println("Main method started");
			System.out.println("Welcome to Vcube car Loan");

			GoldLoan gl = new GoldLoan();
			boolean aadhar = gl.isAadharValid();
			boolean pan = gl.isPanValid();
			boolean phone = gl.isPhoneValid();
			double salary = gl.getCustomerSalary();
			int age = gl.getAge();
			int cibil = gl.getCibilScore();

			if (salary >= 100000.00 && age >= 23 && cibil >= 300 && cibil <= 900) {
				System.out.println("Congratulations!! You are eligible for loan");
				System.out.println("Your Rate Of Interest is:" + gl.getROI());

			} else {
				System.out.println("Focus on your career!!");
				System.out.println("Sorry for the inconvenience!! Your loan got rejected!!");
			}
			System.out.println("Main method ended");
		}
	}

