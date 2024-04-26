package com.gl.week1.codingchallenge5;

public class ConstructorDemo {
	
	ConstructorDemo(){
		System.out.println("I am default constructor.");
	}
	
	ConstructorDemo(int length, float breadth, String shapeType, char ch){
		System.out.println("I am parameterized constructor. I take various arguments as Inputs.");
		System.out.println("Area: " + (length * breadth));
		System.out.println("Shape Name: " + shapeType);
		System.out.println("Starts with Character: " + ch);
	}
	
	public void observation() {
		System.out.println("Inside observations method.");
	}

	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo(2, 3.0f, "Rectangle", 'R');
		obj1.observation();

	}

}
