package com.greatlearning.corejava.polymorphism;

public class CodingChallenge17_Method {

	public static void main(String[] args) {
		Method obj = new Method();
		System.out.println("Left shift of the Number " + obj.num + " is: " + obj.performleftShift());
		obj.performRightShift(45, 2);

	}

}
