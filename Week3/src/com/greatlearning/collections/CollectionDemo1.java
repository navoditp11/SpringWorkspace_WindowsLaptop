package com.greatlearning.collections;

import java.util.Vector;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector(10);
		
		v1.add("Navo");
		v1.add("Rutu");
		
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		
        Vector v2 = new Vector(2,98); //initial capacity / Increment
		
		v2.add("Navo");
		v2.add("Rutu");
		v2.add("Shree");
		//v2.add("Sneha");
		//v2.add("Nitin");
		
		System.out.println(v2.capacity());
		System.out.println(v2.size());

	}

}
