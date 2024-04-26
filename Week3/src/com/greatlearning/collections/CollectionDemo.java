package com.greatlearning.collections;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> maha = new ArrayList<>();
		
		maha.add("Pune");
		maha.add("Mumbai");
		maha.add("Nasik");
		maha.add("Pune");
		maha.add(null);
		
		System.out.println(maha);
		
		ArrayList<Integer> pincode = new ArrayList<>();
		
		pincode.add(888999);
		pincode.add(null);
		pincode.add(464744);
		
		System.out.println(pincode);
		
		ArrayList country = new ArrayList();
		country.addAll(pincode);
		country.addAll(maha);
		System.out.println(country);

	}

}
