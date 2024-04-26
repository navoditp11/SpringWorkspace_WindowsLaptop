package com.gl.currencydenomination.services;

public class CurrencyCountImplementation {

	public void currencyCountImplementation(int[] denominations, int amount) {
		int[] noteCounter = new int[denominations.length];
		
		try {
			for(int i = 0; i < denominations.length; i++) {
				if(amount >= denominations[i]) {
					noteCounter[i] = amount / denominations[i];
					amount = amount - noteCounter[i] * denominations[i];
					
					if(amount == 0)
						break;
				}
			}
			if(amount > 0) {
				System.out.println("Exact amount cannot be given with the highest denomination");
			}
			else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(int i = 0; i < denominations.length; i++) {
					if(noteCounter[i] != 0) {
						System.out.println(denominations[i] + " : " + noteCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e+ " notes of denomination 0 is invalid");
		}
	}
	
}
