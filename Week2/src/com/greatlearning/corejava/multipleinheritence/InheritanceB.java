package com.greatlearning.corejava.multipleinheritence;

public class InheritanceB extends InheritanceA {
	public void rectangleArea(float length, float breadth) {
		float area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}
}
