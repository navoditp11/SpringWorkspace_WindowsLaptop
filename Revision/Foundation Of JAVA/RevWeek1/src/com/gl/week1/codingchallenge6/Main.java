package com.gl.week1.codingchallenge6;

public class Main {

	public static void main(String[] args) {
		ThreeDimensionShape shape1 = new ThreeDimensionShape();
		ThreeDimensionShape shape2 = new ThreeDimensionShape(2,3,4);
		ThreeDimensionShape shape3 = new ThreeDimensionShape(2);
		
		double volume;
		
		volume = shape1.volume();
		System.out.println("Volume of Shape1: " + volume);
		
		volume = shape2.volume();
		System.out.println("Volume of Shape2: " + volume);
		
		volume = shape3.volume();
		System.out.println("Volume of Shape3: " + volume);

	}

}
