package com.greatlearning.corejava.encapsulation;

public class CodingChallenge14_Encapsulation {

	public static void main(String[] args) {
		Encapsulation obj1 = new Encapsulation();
		
		obj1.setCountry("India");
		obj1.setNationalAnthem("Jana Gana Mana");
		obj1.setTouristSpot("Red Fort");
		
		System.out.println("Country Name: " + obj1.getCountry());
		System.out.println("National Anthem: " + obj1.getNationalAnthem());
		System.out.println("Tourist Spot: " + obj1.getTouristSpot());

	}

}
