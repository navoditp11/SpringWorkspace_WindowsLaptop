package com.greatlearning.searching;

import java.util.Scanner;

public class BinarySearchPractice {
	int NUM_ELEMENTS, SEARCH_ELEMENT;
	int array[];
	boolean status = false;

	Scanner sc = new Scanner(System.in);
	
	public void implementationOfBinarySearch() {
		System.out.println("Enter the number of Elements you want to have in the Array : ");
		NUM_ELEMENTS = sc.nextInt();
		
		array = new int[NUM_ELEMENTS];

		System.out.println("Enter the Elements in a Sorted Order : ");

		insertValues();

		printValues();

		System.out.println("Enter an Element to Search : ");
		SEARCH_ELEMENT = sc.nextInt();
		searchValue(SEARCH_ELEMENT);

	}


	private void insertValues() {
		for(int i=0; i<NUM_ELEMENTS; i++) {
			System.out.println("Enter element at Position " + i + " : ");
			array[i] = sc.nextInt();
		}		
	}
	
	private void printValues() {
		for(int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.println("Value at Index " + i + " : " + array[i]);
		}
		System.out.println();	
	}
	
	private void searchValue(int value) {
		int first = 0;
		int last = array.length - 1;
		int mid = (first + last)/2;
		
		while(first<=last) {
			if(array[mid]<value) {
				first = mid + 1;
			}
			else if(array[mid] == value) {
				System.out.println("Elemet " + value + " found at the Index : " + mid);
				break;
			}
			else {
				last = mid - 1;
			}
			mid = (first + last)/2;
		}
		if(first>last) {
			System.out.println("Element " + value + " not found in the Array");
		}		
		
	}

	public static void main(String[] args) {
		BinarySearchPractice bs = new BinarySearchPractice();
		bs.implementationOfBinarySearch();
	}
}
