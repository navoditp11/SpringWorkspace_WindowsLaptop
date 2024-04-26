package com.gl.week1.codingchallenge7;

public class Area {
	
	final float pi = 3.14f;
	
	public float circleArea(float radius) {
		return pi * radius * radius;
	}

	public static void main(String[] args) {
		Area a1 = new Area();
		
		float area = a1.circleArea(2.0f);
		System.out.println("Area of Circle: " + area + " cm sq.");

	}

}
