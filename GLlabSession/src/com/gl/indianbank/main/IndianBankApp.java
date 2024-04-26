package com.gl.indianbank.main;

import java.util.Scanner;

import com.gl.indianbank.model.Customer;
import com.gl.indianbank.services.BankingService;
import com.gl.indianbank.services.impl.BankServiceImpl;

public class IndianBankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String bankAccountNo;
		String password;
		
		// 1. Create Customer Object...
		Customer customer1 = new Customer("1","1");
		Customer customer2 = new Customer("HDFC1999000","test123");
		
		// 2. Object for BankingService
		BankingService service = new BankServiceImpl();
		
		// 3. Dashboard of Indian Bank....
		System.out.println("Indian Bank - Login Page");
		System.out.println("Welcome to Indian Bank...");
		System.out.println();
		
		// 4. Customer Authentication
		System.out.println("Enter the bank Account no ");
		bankAccountNo = sc.nextLine();
		System.out.println("Enter the password for the corresponding bank account no ");
		password = sc.nextLine();
		
		if((customer1.getBankAccountNo().equals(bankAccountNo))&&(customer1.getPassword().equals(password))) {
			System.out.println("\n\n!!!!! Welcome to Indian Bank !!!!!\n\n");
			int option = 0;
			// 5. Use do while loop to recursively execute the logic till 0 is pressed
			do {
				System.out.println("-----------------------------------------------");
				System.out.println("Enter the operation number that you want to perform");
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit");
				System.out.println("3. Withdrawl");
				System.out.println("4. Transfer");
				System.out.println("0. Logout");
				System.out.println("-----------------------------------------------");
				option = sc.nextInt();
				
				// 6. Use switch case to implement the necessary logic
				switch (option) {
				case 0: {
					option = 0;
					break;
				}

				case 1: {
					System.out.println("Current Bank Balance is: " + service.checkBalance());
					break;
				}

				case 2: {
					service.deposit();
					break;
				}

				case 3: {
					service.withdrawal();
					break;
				}

				case 4: {
					System.out.println("Transaction Status: " + (service.transfer() ? "Success" : "Failed"));
				}
				default:
					break;
				}
			}
			while(option != 0);
		}
		else {
			System.out.println("Invalid credentials");
		}

	}

}
