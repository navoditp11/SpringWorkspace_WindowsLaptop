package com.greatlearning.corejava.polymorphism;

public class Polymorphism {
	int length, breadth, height;
	void findArea(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
		System.out.println("Area of Rectangle: " + length * breadth);
	}
	
	void findArea(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		System.out.println("Area of Rectangular Cuboid: " + length * breadth * height);
		
	}

}
