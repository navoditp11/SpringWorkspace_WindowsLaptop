package com.greatlearning.sorting;

import java.util.Scanner;

public class BubbleSortPractice {
	int NUM_ELEMENTS, temp;
	int array[];
	boolean status = true;
	
	Scanner sc = new Scanner(System.in);
	
	public void implmentationOfBubbleSort() {
		System.out.println("Enter the number of Elements you want to have in the Array : ");
		NUM_ELEMENTS = sc.nextInt();
		
		array = new int[NUM_ELEMENTS];
		
		System.out.println("Enter the Elements in the Array : ");

		insertValues();
		//printValues();
		
		do {
			sortValues();
			status = checkForStatus();
		} while(status == false);
		
	}


	private void insertValues() {
		for(int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.println("Enter the Element at Position " + i + " : ");
			array[i] = sc.nextInt();
		}	
	}
	
	
	public boolean checkForStatus() {
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] > array[i+1])
				return false;
		}
		return true;
	}
	
	private void sortValues() {
		int len = array.length;
		for(int i = 0; i < len; i++) {
			for(int j = 1; j < len-i; j++) {
				if(array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
					printValues();
				}
			}
		}
	}
	
	public void printValues() {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Value at position " + i + " is : " + array[i]);
		}
		System.out.println();

	}
	


	public static void main(String[] args) {
		BubbleSortPractice bs = new BubbleSortPractice();
		bs.implmentationOfBubbleSort();

	}

}
