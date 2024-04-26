package com.greatlearning.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("Ben");
		lhs.add("Charles");
		lhs.add("Alice");
		
		System.out.println(lhs);
		
        TreeSet<String> ts = new TreeSet<>();
		
		ts.add("Ben");
		ts.add("Charles");
		ts.add("Alice");
		
		System.out.println(ts);
		
        TreeSet<Integer> ts1 = new TreeSet<>();
		
		ts1.add(5);
		ts1.add(1);
		ts1.add(8);
		
		System.out.println(ts1);
		
        Set<Integer> ts2 = new LinkedHashSet<>();
		
		ts2.add(5);
		ts2.add(1);
		ts2.add(8);
		
		System.out.println(ts2);

	}

}
