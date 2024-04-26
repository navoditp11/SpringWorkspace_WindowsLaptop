package com.gl.week1.codingchallenge4;

public class ConstructorDemo {
	
	ConstructorDemo(){
		System.out.println("My Name is Navodit");
	}
	
	ConstructorDemo(String name, int age, String location){
		System.out.println("My name is " + name + " and I am " + age + " years old and I am from " + location);
	}

	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo("Navodit Pan", 27, "Jamshedpur");
	}
}
