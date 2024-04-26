package com.gl.stack;
import java.util.Stack;

import java.util.Scanner;

public class InfixToPostfixConvertor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Infix expression: ");
		String infix = sc.nextLine();
		String postfix = infixToPostfix(infix);
		System.out.println("Postfix Output expression: \n"+postfix);

	}
	
	static int precedence(char op) {
		switch(op) {
		case '/':
			return 1;
		case '*':
			return 3;
		case '+':
			return 4;
		case '-':
			return 2;
		}
		return -1;
	}

	static String infixToPostfix(String infix) {
		String postfix = "";
		Stack<Character> opStack = new Stack<>();
		
		for(int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				postfix += ch;
			}
			else if(ch == '(') {
				opStack.push(ch);
			}
			else if(ch == ')') {
				while(!opStack.isEmpty() && opStack.peek() != '(') {
					postfix += opStack.pop();
				}
				opStack.pop();
			}
			else {
				while(!opStack.isEmpty() && (precedence(ch) < precedence(opStack.peek()))) {
					postfix += opStack.pop();
				}
				opStack.push(ch);
			}
		}
		while(!opStack.isEmpty()) {
			postfix += opStack.pop();
		}
	return postfix;
	}	

}
