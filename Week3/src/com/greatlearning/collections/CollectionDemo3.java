package com.greatlearning.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionDemo3 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(102, "Navo");
		hm.put(101, "Shree");
		hm.put(103, "Rutu");
		
		System.out.println(hm);
		
        Map<Integer, String> hm1 = new LinkedHashMap<>();
		
		hm1.put(102, "Navo");
		hm1.put(101, "Shree");
		hm1.put(103, "Rutu");
		
		System.out.println(hm1);
		
        Map<Integer, String> hm2 = new TreeMap<>();
		
		hm2.put(102, "Navo");
		hm2.put(101, "Shree");
		hm2.put(103, "Rutu");
		hm2.put(99, "Nitin");
		
		System.out.println(hm2);

	}

}
