package com.greatlearning.exceptionhandling;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		try {
			divide(10,0);	
		}
		catch(ArithmeticException e1) {
			System.out.println("Enter a Valid Denominator");
		}
	}
		
	static double divide(int n, int d) throws ArithmeticException {
		return (n/d);
	}



}
