package com.gl.week1.codingchallenge1;

public class Customer {
	
	public String fullName;
	public int age;

	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		c1.fullName = "Navodit Pan";
		c1.age = 27;
		
		System.out.println(c1.fullName);
		System.out.println(c1.age);

	}

}
