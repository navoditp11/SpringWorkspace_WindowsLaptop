package com.gl.transaction.main;

import java.util.Scanner;

import com.gl.transaction.service.TransactionService;

public class TransactionDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array: ");
		int transactionSize = sc.nextInt();
		
		System.out.println("Enter the values of array: ");
		int transactions[] = new int[transactionSize];
		for(int i = 0; i < transactionSize; i++) {
			transactions[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved: ");
		int targetsToBeAchieved = sc.nextInt();
		
		TransactionService ts = new TransactionService();
		ts.transactionServiceImplementation(transactions, targetsToBeAchieved);
		
		sc.close();

	}

}
