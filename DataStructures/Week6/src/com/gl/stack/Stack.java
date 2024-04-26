package com.gl.stack;

public class Stack {

	public static void main(String[] args) {
		StackImplementation s = new StackImplementation();
		s.push(2);
		s.push(45);
		s.push(65);
		s.push(21);
		System.out.println(s.pop() + " Popped from stack");
		System.out.println("Element present in stack: ");
		s.printStack();

	}

}
