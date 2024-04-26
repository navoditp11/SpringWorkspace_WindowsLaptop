package com.greatlearning.sorting;

import java.util.Scanner;

public class SelectionSortPractice {
	int NUM_ELEMENTS, smallestNumber;
	int array[];
	boolean status = true;
	
	Scanner sc = new Scanner(System.in);
	
	public void implmentationOfSelectionSort() {
		System.out.println("Enter the number of Elements you want to have in the Array : ");
		NUM_ELEMENTS = sc.nextInt();
		
		array = new int[NUM_ELEMENTS];
		
		System.out.println("Enter the elements in the Array: ");

		
		insertValues();
		do {
			sortValues();
			status = checkForStatus();
		}while(status == false);
	}


	private void insertValues() {
		for(int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.print("Enter element at position " + i + " : " );
			array[i] = sc.nextInt();
		}		
	}
	
	/*private void printValues() {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Value at Position " + i + " is : " + array[i]);
		}
		System.out.println();
	}*/
	
	private void sortValues() {
		for(int i = 0; i < array.length - 1; i++) {
			int index = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] < array[index]) {
					index = j;
				}
			}
			smallestNumber = array[i];
			array[i] = array[index];
			array[index] = smallestNumber;
			
		}
		//printValues();
		System.out.println("Array after Sorting: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	private boolean checkForStatus() {
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] > array[i+1]) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		SelectionSortPractice ssp = new SelectionSortPractice();
		ssp.implmentationOfSelectionSort();
		

	}

}
