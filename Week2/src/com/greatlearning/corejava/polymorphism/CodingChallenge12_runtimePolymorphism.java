package com.greatlearning.corejava.polymorphism;

public class CodingChallenge12_runtimePolymorphism {

	public static void main(String[] args) {
		A obj = new A();
		A obj1 = new B();
		
		obj.Car();
		obj1.Car();
	}

}
