package com.java;
import java.util.Scanner;

public class BugTracker {
	
	int getBugid = 101;
	String getApplicationName = "sathvika";
	String getBugTitle = "Inconsistency";
	String getseverity = "Moderate";
	String  getPriority = "First";
	String getstatus = "Completed";
	String getAssignedDeveloper = "uma";
	

	
		
	public static void main(String[] args) {
		System.out.println("Main Method started");
		
		
		BugTracker bt = new BugTracker();
		bt.getbugid();
		bt.getApplicationName();
		bt.getBugTitle();
		bt.getseverity() ;
		bt.getPriority();
		bt.getstatus();
		bt.getAssignedDeveloper();
		
		
		System.out.println("Main Method ended");
	}	
		void getbugid() {
			System.out.println("Enter the bugid:"+getBugid);
			
		}
		  void getApplicationName() {
			System.out.println("Enter the applicationname:"+getApplicationName); 
			
		}
			
		void getBugTitle() {
			System.out.println("Enter the BugTitle:"+getBugTitle);   
			
		}
		void getseverity() {
			System.out.println("Enter the Bugseverity:"+getseverity); 
		}
		void getPriority() {
			System.out.println("Enter the Bugpriority:"+getPriority); 
		
			
		}
		void getstatus() {
			System.out.println("Enter the Status:"+getstatus);
		}
		void getAssignedDeveloper() {
			System.out.println("Enter the AssignedDeveloper:"+getAssignedDeveloper);
		}
		
}
		
		
		
		
		