package com.greatlearning.corejava.mutilevelinheritance;

public class AccountDetails extends CurrentAccount {
	int depositAmount, withdrawalAmount;
	
	AccountDetails(String a, int b, int c, int d, int e) {
		super(a, b, c);
		this.depositAmount = d;
		this.withdrawalAmount = e;
	}
	
	void display2() {
		super.display1();
		System.out.println("Deposit Amount: " + depositAmount);
		System.out.println("Withdrawal Amount: " + withdrawalAmount);
	}


}
