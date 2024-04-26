package com.greatlearning.exceptionhandling;

import java.util.Scanner;

public class ExceptionHanldlingDemo4CustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Quanltity");
		int qty = sc.nextInt();
		
		try {
			if(qty>=100)
				System.out.println("Order Accepted");
			else
				throw new LowQuantityException("Please enter valid quantity > 100");
		}
		
		catch(LowQuantityException e1) {
			System.out.println(e1.getMessage());
		}
		
		finally {
			System.out.println("Thank you! Visit again...");
		}

	}

}
