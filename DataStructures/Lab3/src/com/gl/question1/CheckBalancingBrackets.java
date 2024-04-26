package com.gl.question1;

import java.util.Scanner;
import java.util.Stack;

public class CheckBalancingBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Bracket Expression: "); // eg. (({[]}))
		String expression = sc.next();
		boolean result = isBracketBalanced(expression);
		
		if(result == true) {
			System.out.println("The entered string have Balanced Brackets.");
		}
		else {
			System.out.println("The entered string doesn't have Balanced Brackets.");
		}

	}

	private static boolean isBracketBalanced(String expression) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < expression.length(); i++) {
			char character = expression.charAt(i);
			if(character == '(' || character == '{' || character == '[') {
				stack.push(character);
				continue;
			}
			if(stack.isEmpty())
				return false;
			
			char c;
			switch (character) {
			case ')':
				c = stack.pop();
				if(c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if(c == '{' || c == '(')
					return false;
				break;
			case '}':
				c = stack.pop();
				if(c == '(' || c == '[')
					return false;
				break;
			default:
				break;
			}
		}
		
		return stack.isEmpty();
	}

}
