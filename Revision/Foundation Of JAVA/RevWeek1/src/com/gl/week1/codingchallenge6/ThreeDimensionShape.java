package com.gl.week1.codingchallenge6;

public class ThreeDimensionShape {
	double width, height, depth;
	
	ThreeDimensionShape(){
		width = height = depth = 0;
	}
	
	ThreeDimensionShape(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	ThreeDimensionShape(double l){
		width = height = depth = l;
	}
	
	double volume() {
		return width * height * depth;
	}

}
