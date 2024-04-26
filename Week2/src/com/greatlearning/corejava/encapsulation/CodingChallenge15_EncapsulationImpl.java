package com.greatlearning.corejava.encapsulation;

public class CodingChallenge15_EncapsulationImpl {

	public static void main(String[] args) {
		EncapsulationImpl obj1 = new EncapsulationImpl();
		EncapsulationImpl obj2 = new EncapsulationImpl();
		
		obj1.setAge(70);
		
		if(obj1.getAge()<=60) {
			obj1.setDecision(true);
		}
		else {
			obj1.setDecision(false);
		}
		
		System.out.println("The age of the candidate: " + obj1.getAge());
		System.out.println("Driving license can be issued to the candidate.: " + obj1.isDecision());
		
	}

}
