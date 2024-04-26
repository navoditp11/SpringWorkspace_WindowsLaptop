package com.greatlearning.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		
		List<String> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(10);
		System.out.println(list1);
		
		list2.add("Navo");
		list2.add(0, null);
		System.out.println(list2);

	}

}
