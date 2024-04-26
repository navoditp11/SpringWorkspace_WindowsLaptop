package com.gl.stack;

public class StackPractice {

	public static void main(String[] args) {
		StackImplementationPractice sip = new StackImplementationPractice();
		sip.push(32);
		sip.push(12);
		sip.push(7);
		sip.push(45);
		System.out.println(sip.pop() + " Popped from Stack");
		System.out.println("Element present in Stack: ");
		sip.printStack();

	}
}
