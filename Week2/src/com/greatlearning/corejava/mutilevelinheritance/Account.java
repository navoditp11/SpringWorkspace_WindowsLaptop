package com.greatlearning.corejava.mutilevelinheritance;

public class Account {
	String customerName;
	int accountNo;
	
	Account(String a, int b){
		this.customerName = a;
		this.accountNo = b;
		
	}
	
	void display() {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Account No. : " + accountNo);
	}

}
