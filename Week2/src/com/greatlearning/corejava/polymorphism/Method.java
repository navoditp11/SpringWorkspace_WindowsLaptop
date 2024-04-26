package com.greatlearning.corejava.polymorphism;

public class Method {
	public int num = 10, output;
	public int performleftShift() {
		output = num << 1;
		return output;
	}
	
	public void performRightShift(int val, int digitstoshift) {
		num = val;
		output = num >> digitstoshift;
		System.out.println("Right shift of the Number " + num + " is: " + output);	
	}
}
