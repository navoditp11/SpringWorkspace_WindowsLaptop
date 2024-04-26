package com.gl.stack;

public class StackImplementationPractice {
	static final int size_of_stack = 1000;
	int current_pointer;
	int a[] = new int[size_of_stack];
	
	void StackImplementation() {
		current_pointer = -1;
	}

	boolean push(int x) {
		if(current_pointer >= (size_of_stack - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++current_pointer] = x;
			System.out.println(x + " Pushed into Stack");
			return true;
		}	
	}

	public int pop() {
		if(current_pointer < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[current_pointer--];
			return x;
		}
	}

	void printStack() {
		for(int i = current_pointer; i > -1; i-- ) {
			System.out.print(" " + a[i]);
		}
	}

}
