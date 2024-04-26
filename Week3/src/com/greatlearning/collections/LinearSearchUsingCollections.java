package com.greatlearning.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		if(list.contains(1)) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
		
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Navodit","Jayshree","Rutika"));
		if(list2.contains("Jayshree")) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
		
	}

}
