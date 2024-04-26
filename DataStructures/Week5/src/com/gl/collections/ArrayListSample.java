package com.gl.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		
		myList.add("Navodit Pan");
		myList.add("Jamshedpur");
		myList.add(10000);
		myList.add(145.44);
		myList.add(true);
		
		for(Object o : myList) {
			System.out.println("The Object is " + o);
		}
		
		System.out.println("\n-----------------\n");
		for(int i = 0; i < myList.size(); i++) {
			Object o = myList.get(i);
			System.out.println("The Object is " + o);
		}
		
		System.out.println("\n-----------------\n");
		Iterator myIter = myList.iterator();
		while(myIter.hasNext()) {
			Object o = myIter.next();
			System.out.println("The Object is " + o);
		}
		

	}

}
