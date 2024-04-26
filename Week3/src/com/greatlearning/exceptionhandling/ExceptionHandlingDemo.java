package com.greatlearning.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the Numerator : ");
			int n = sc.nextInt();
			System.out.println("Enter the Denominator : ");
			int d = sc.nextInt();
			
			double ans = n/d;
			System.out.println(ans);
			
			String s1 = null;
			System.out.println(s1.length());
		}
		
		catch (InputMismatchException e2) {
			System.out.println("Enter the correct input");
		}
		
		catch (ArithmeticException e1){
			System.out.println("Enter a Valid Denominator");
			System.out.println(e1);
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
		
		catch (Exception e3) { //default exception handling
			System.out.println("Some error occured while execution! ");
		}
		
		finally { // gauranteed to run the block instead of having any exception
			System.out.println("Hi");
		}
		
	}

}
