package com.java;

public class Bankacc {
	int accno;
	String holdername;
	String acctype;
	double balance;
	Bankacc(){
		accno = 889790 ;
		holdername = "Sathvika";
		acctype = "savings";
		balance = 10000.00;
		
	}
		Bankacc(int accno,String holdername,String acctype,double balance){
			this.accno = accno;
			this.holdername = holdername;
			this.acctype = acctype;
			this.balance = balance;
			
		}
	public static void main(String[] args) {
		System.out.println("Main method started");
		Bankacc b = new Bankacc();
		b.Bankaccinfo();
		Bankacc b1 = new Bankacc(95738,"Yashnaaa","Bussiness",500000.00);
		b1.Bankaccinfo();
		System.out.println("Main method ended");
	}
	void Bankaccinfo() {
		System.out.println("accno:"+accno);
		System.out.println("holdername:"+holdername);
		System.out.println("acctype:"+acctype);
		System.out.println("balance:"+balance);
		
	}

}
