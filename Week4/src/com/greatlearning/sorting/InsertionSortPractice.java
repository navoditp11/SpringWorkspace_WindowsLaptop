package com.greatlearning.sorting;

import java.util.Scanner;

public class InsertionSortPractice {

	public static void main(String[] args) {
		InsertionSortPractice is = new InsertionSortPractice();
		is.insertionSortImplementation();

	}
	
	public int NUM_ELEMENTS, i, min, temp, startPoint= 0;
	public int array[];
	public boolean status;
	Scanner sc = new Scanner(System.in);
	private int sortedvalue;

	private void insertionSortImplementation() {
		System.out.println("Enter the number of elements you want to sort:");
		NUM_ELEMENTS = sc.nextInt();
		array = new int[NUM_ELEMENTS];
		System.out.println("Enter the elements now.");
		
		// Insert values
		insertValues();
		sortValues();
		printValues();
		
	}

	private void insertValues() {
		for(int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.println("Enter element at position " + i + ": ");
			array[i] = sc.nextInt();
		}		
	}
	
	private void sortValues() {
		for(int j = 1; j < NUM_ELEMENTS; j++) {
			int key = array[j];
			int i = j - 1;
			while((i > -1) && (array[i] > key)) {
				array[i+1] = array[i];
				i--;
			}
			array[i+1]=key;
		}
		
	}
	
	private void printValues() {
		System.out.println("After Insertion Sort: ");
		for(int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.println("Value at position " + i + ": " + array[i]);			
		}		
	}

}
