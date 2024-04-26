package com.gl.indianbank.services.impl;

import java.util.Scanner;

import com.gl.indianbank.services.BankingService;
import com.gl.indianbank.services.OTPservice;

public class BankServiceImpl implements BankingService {
	private int amount;
	private int otp;
	private int otpGenerated;
	private int bankAccountNo;
	private int bankBalance = 5000;
	Scanner sc = new Scanner(System.in);
	

	@Override
	public void deposit() {
		// 1. Ask the amount that customer wants to deposit
		System.out.println("Enter the amount you want to deposit: ");
		amount = sc.nextInt();
		
		// 2. validate the amount that customer wants to deposit and proceed
		if(amount > 0) {
			System.out.println("Amount " + amount + " deposited successfully.");
			bankBalance = bankBalance + amount;
			System.out.println("Updated Bank Balance is " + bankBalance + "\n");
		}
		else {
			System.out.println("Enter a valid amount greater than 0");
		}

	}

	@Override
	public boolean withdrawal() {
		// 1. Ask the amount that customer wants to withdraw
		System.out.println("enter the amount you want to withdrawl: ");
		amount = sc.nextInt();
		
		if((bankBalance - amount) > 0) {
			System.out.println("Amount " + amount + " withdrawl successfully");
			bankBalance = bankBalance - amount;
			System.out.println("Remaining Bank balance is " + bankBalance);
			return true;
		}
		else {
			System.out.println("insufficient funds");
			System.out.println("Remaining Bank balance is " + bankBalance);
			return false;
		}
		
	}

	@Override
	public int checkBalance() {
		if(bankBalance <= 5000) {
			System.out.println("You are have to maintain a minimum of Rs 5000/- ");
		}
		return bankBalance;
	}

	@Override
	public boolean transfer() {
		// 1. Generate OTP
		OTPservice otpservice = new OTPServiceImpl();
		otpGenerated = otpservice.generateOTP();
		System.out.println("Generated OTP: " + otpGenerated);
		
		System.out.println("Enter the OTP: ");
		otp = sc.nextInt();
		
		// 2. Validate OTP and Process...
		if(otpGenerated == otp) {
			// 3. Ask the amount that customer wants to transfer
			System.out.println("Enter the amount you want to transfer");
			amount = sc.nextInt();
			
			System.out.println("Enter the BankAccount no to which you want to transfer");
			bankAccountNo = sc.nextInt();
			
			// 4. check for sufficient balance and proceed
			if((bankBalance - amount) >= 0) {
				System.out.println("amount " + amount + " transferred successful to bankAccount " + bankAccountNo);
				bankBalance = bankBalance - amount;
				System.out.println("Remaining Bank balance is " + bankBalance);
				return true;
			}
			else {
				System.out.println("insufficient funds");
				System.out.println("Remaining Bank balance is " + bankBalance);
				return false;
			}
			
		}
		else {
			System.out.println("invalid otp please try again");
			return false;
		}
		
	}

}
