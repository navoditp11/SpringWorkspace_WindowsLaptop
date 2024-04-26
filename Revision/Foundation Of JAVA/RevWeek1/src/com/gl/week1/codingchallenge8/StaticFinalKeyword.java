package com.gl.week1.codingchallenge8;

public class StaticFinalKeyword {
	
	int var1 = 10;
	static int var2 = 10;
	
	public void method1() {
		var1++;
		System.out.println(var1);
	}
	
	public void method2() {
		var2++; 
		System.out.println(var2);
	}

	public static void main(String[] args) {
		StaticFinalKeyword obj1 = new StaticFinalKeyword();
		StaticFinalKeyword obj2 = new StaticFinalKeyword();
		StaticFinalKeyword obj3 = new StaticFinalKeyword();
		
		System.out.println("Using Non-Static variable/n");
		obj1.method1(); //11
		obj2.method1(); //11
		obj3.method1(); //11
		
		System.out.println("Using Static variable/n");
		obj1.method2(); //11
		obj2.method2(); //12
		obj3.method2(); //13

	}

}
