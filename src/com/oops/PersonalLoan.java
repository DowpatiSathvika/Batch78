package com.oops;

import java.util.Scanner;

public class PersonalLoan extends LoanImpl {
	static Scanner sc = new Scanner(System.in);

	void personalLoanDocInfo() {
		System.out.println("All documents are verified!!");

	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Welcome to Vcube Banking Loan");

		PersonalLoan pl = new PersonalLoan();
		double salary = pl.getCustomerSalary();
		int age = pl.getAge();
		int cibil = pl.getCibilScore();

		if (salary >= 100000.00 && age >= 23 && cibil >= 300 && cibil <= 900) {
			System.out.println("Congratulations!! You are eligible for loan");
			System.out.println("Your Rate Of Interest is:" + pl.getROI());

		} else {
			System.out.println("Focus on your career!!");
			System.out.println("Sorry for the inconvenience!! Your loan got rejected!!");
		}
		System.out.println("Main method ended");
	}

}
