package com.gl.stack;

public class StackPracticeImplementation {
	int[] arr;
	int top;
	int min;

	StackPracticeImplementation(int size) {
		arr = new int[size];
		top = -1;
		min = 0;
	}

	void push(int ele) {
		if(top == arr.length-1) {
			System.out.println("Overflow");
			return;
		}
		top++;
		arr[top] = ele;
		setMin();
	}
	
	int pop() {
		if(top == -1) {
			System.out.println("Underflow");
			min = 0;
			return -1;
		}
		if(top == 0) {
			min = 0;
			return arr[top];
		}
		int temp = arr[top];
		top--;
		
		if(min == temp) {
			setMin();
		}
		return temp;			
	}
	
	int setMin() {
		if(top == 0) {
			min = arr[0];
			return min;
		}
		for(int i = 0; i<top; i++) {
			if(arr[i] < arr[i+1] && min > arr[i]) {
				min = arr[i];
			}	
		}
		return min;
	}
	

}
