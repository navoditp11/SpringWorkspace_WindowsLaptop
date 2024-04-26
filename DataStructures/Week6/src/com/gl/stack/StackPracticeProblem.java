package com.gl.stack;

import java.util.Scanner;

public class StackPracticeProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of values: ");
		int size = sc.nextInt();
		
		System.out.println("Enter number of operations: ");
		int queries = sc.nextInt();
		
		int i = 0;
		
		StackPracticeImplementation spi = new StackPracticeImplementation(size); 
		
		while(i++ < queries) {
			System.out.println("Type push or pop or min");
			switch(sc.next()) {
			case "push":
				System.out.println("Enter any value other than 0");
				spi.push(sc.nextInt());
				break;
			case "pop":
				System.out.println("Popped value is " + spi.pop());
				break;
			case "min":
				System.out.println(spi.min);
			}
		System.out.println("Min is "+spi.min);	
		}

	}

}
