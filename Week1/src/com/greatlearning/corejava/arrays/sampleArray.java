package com.greatlearning.corejava.arrays;

import java.util.Scanner;

public class sampleArray {
	Scanner sc = new Scanner(System.in);
	
	public void findSumAndAvgOfArray(int[] array) {
		int sum = 0;
		double avg = 0.0;
		for(int i=0; i<array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("The elements are ");
		for (int x : array) {
			System.out.println(x);
		}
		System.out.println("The Sum is : " + sum);
		avg = sum/(array.length);
		System.out.println("The Average is : " + avg);
	}
	
	public void manipSample1DArray() {
		int arr1[] = new int[10];
		for(int i = 0; i < 10; i++) {
			arr1[i] = (i+1)*10;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}
	
	public void manipSample2DArray() {
		int arr2[][] = new int[3][4];
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				arr2[i][j] = (i+j)*10;
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void manipStringArray() {
		String names[] = new String[5];
		for(int i=0; i<5; i++) {
			System.out.println("Enter " + (i+1) + " Name: ");
			names[i] = sc.next();
		}
		System.out.println("Accepted 5 Names....");
		for(int j=0; j<5; j++) {
			System.out.println(names[j]);
		}
		System.out.println("Using For each loop");
		for(String studentName : names) {
			System.out.println(studentName);
		}
	}
	
	public void manipIntArray() {
		int scores[] = new int[] {97, 95, 66, 88, 99};
		for (int x : scores) {
			System.out.println("The score " + x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleArray sar = new sampleArray();
		sar.manipSample1DArray();
		sar.manipSample2DArray();
		sar.manipStringArray();
		sar.manipIntArray();
		int arr4[] = new int[] {1,2,3,4,5};
		sar.findSumAndAvgOfArray(arr4);
		int arr5[] = new int[] {10,20,30,40,50};
		sar.findSumAndAvgOfArray(arr5);

	}

}
