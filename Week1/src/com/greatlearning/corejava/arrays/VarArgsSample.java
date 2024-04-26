package com.greatlearning.corejava.arrays;

public class VarArgsSample {
	
	public void demoVarArgs(String fName, String lName, int... myArgs) {
		String fullName = fName + " " +lName;
		System.out.println("Hello " + fullName);
		int sum = 0;
		for(int i=0; i<myArgs.length; i++) {
			sum = sum + myArgs[i];
		}
		System.out.println("Your Sum is ----------" + sum);
	}
	
	public void demoVarArgsStr(int num1, int num2, String... myArgsStr) {
		int sum = num1 + num2;
		System.out.println("The Strings are ");
		for (String x : myArgsStr) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsSample vargs = new VarArgsSample();
		vargs.demoVarArgs("Navodit", "Pan", 10,20,30,40,50);
		vargs.demoVarArgs("Jayshree", "Bhatta", 100,200,300,400,500,600);
		vargs.demoVarArgs("Rutika", "Ujade");
		vargs.demoVarArgsStr(10, 20, "India", "China", "SL", "AUS");
		vargs.demoVarArgsStr(100, 200, "JH", "MH", "TN", "OD");
		vargs.demoVarArgsStr(1000, 2000, "JSR", "MUM", "CHN", "RKL");

	}

}
