package com.greatlearning.corejava.mutilevelinheritance;

public class CurrentAccount extends Account {
	int currentBalance;
	CurrentAccount(String a, int b, int c) {
		super(a, b);
		this.currentBalance = c;
	}
	
	void display1() {
		super.display();
		System.out.println("Current Balance: " + currentBalance);
	}

	
	

}
