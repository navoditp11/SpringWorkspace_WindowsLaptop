package com.greatlearning.corejava.polymorphism;

public class MethodImpl {
	public String s = null;
	public void method1() {
		System.out.println("I am from method1 without return type");
	}
	
    public void method1(String s) {
    	this.s = s;
		System.out.println(s);
	}
    
    
    public String method2() {
		s = "I am from method2 with return type";
		return s;
	}
	
    public String method2(String s) {
    	this.s = s;
		return s;
	}


}
