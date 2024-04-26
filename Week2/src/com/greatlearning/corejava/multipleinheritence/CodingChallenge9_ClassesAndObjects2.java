package com.greatlearning.corejava.multipleinheritence;
class Class2 {
	void copyMe() {
		System.out.println("Inside copy me method");
	}
}

public class CodingChallenge9_ClassesAndObjects2 {

	public static void main(String[] args) {
	    Class2 obj = new Class2();
		obj.copyMe();

	}

}
