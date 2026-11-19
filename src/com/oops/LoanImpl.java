package com.oops;

import java.util.Scanner;

public class LoanImpl {

	static Scanner sc = new Scanner(System.in);

	boolean isAadharValid() {
		boolean isValid = false;
		System.out.println("Enter the Aadhar number:");
		String aadhar = sc.next();
		isValid = aadhar.matches("[2-9]{1}[0-9]{11}");
		return isValid;
	}

	boolean isPhoneValid() {
		boolean isValid = false;
		System.out.println("Enter your phone number: ");
		String phone = sc.next();
		isValid = phone.matches("[6-9]{1}[0-9]{9}");
		return isValid;
	}

	boolean isPanValid() {
		boolean isValid = false;
		System.out.println("Enter the Pan Card details: ");
		String pan = sc.next();
		isValid = pan.matches("[A-Z/a-z]{5}[0-9]{4}[A-Z/a-z]{1}");
		return isValid;
	}

	double getROI() {
		double roi = 20.0;
		int cibil = getCibilScore();
		if (cibil > 900 || cibil < 300) {
			System.out.println("cibil data is invalid!!");
		} else if (cibil >= 800 && cibil <= 900) {
			System.out.println("Strong credit profile,best loan terms-Excellent");
			roi = roi - 11.0;
		} else if (cibil >= 770 && cibil < 800) {
			System.out.println("highmapproval chances,competitive rates-Very good");
			roi = roi - 9.0;
		} else if (cibil > 700 && cibil < 770) {
			System.out.println("Eligible for most loans with decent terms- Good");
			roi = roi - 8.0;
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("May get loans but at higher interest-Average");
			roi = roi - 7.0;
		} else {
			System.out.println("High risk.Loan application often rejected-Poor");
		}
		return roi;
	}

	int getCibilScore() {
		System.out.println("Enter the cibil score:");
		int cibil = sc.nextInt();
		return cibil;
	}

	int getAge() {
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		return age;
	}

	double getCustomerSalary() {
		System.out.println("Enter your salary:");
		double salary = sc.nextDouble();
		return salary;
	}

}
