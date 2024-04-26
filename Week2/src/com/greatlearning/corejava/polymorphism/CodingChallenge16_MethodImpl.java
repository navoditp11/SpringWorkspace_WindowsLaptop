package com.greatlearning.corejava.polymorphism;

public class CodingChallenge16_MethodImpl {

	public static void main(String[] args) {
		MethodImpl obj = new MethodImpl();
		obj.method1();
		obj.method1("I am from method1 without return type and an input argument");
		System.out.println(obj.method2());
		System.out.println(obj.method2("I am from method2 with return type and an input argument. "));

	}

}
