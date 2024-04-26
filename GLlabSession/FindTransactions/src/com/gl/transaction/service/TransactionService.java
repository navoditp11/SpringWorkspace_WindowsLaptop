package com.gl.transaction.service;

import java.util.Scanner;

public class TransactionService {

	public void transactionServiceImplementation(int[] transactions, int targetsToBeAchieved) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		int sumOfTransactions = 0;
		for (int i = 0; i < targetsToBeAchieved; i++) {
			System.out.println("Enter the value of target: ");
			int targetValue = sc.nextInt();

			for (int j = 0; j < transactions.length; j++) {
				sumOfTransactions = sumOfTransactions + transactions[i];

				if (sumOfTransactions >= targetValue) {
					System.out.println("Target achieved after " + (j + 1) + " transactions");
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}

	}

}
