package com.gl.currencydenomination.main;

import java.util.Scanner;

import com.gl.currencydenomination.services.CurrencyCountImplementation;
import com.gl.currencydenomination.services.CurrencyDenominationService;

public class CurrencyDenominationDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CurrencyDenominationService cds = new CurrencyDenominationService();
		CurrencyCountImplementation cci = new CurrencyCountImplementation();
		
		System.out.println("Enter the size of the Currency Denominations : ");
		int size = sc.nextInt();
		
		int denominations[] = new int[size];
		System.out.println("Enter the Currency Denomination values : ");
		for(int i = 0; i < size; i++) {
			denominations[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Amount you want to pay : ");
		int amount = sc.nextInt();
		cds.mergeSort(denominations, 0, denominations.length-1);
		cci.currencyCountImplementation(denominations, amount);
		
		sc.close();

	}

}
