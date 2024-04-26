package com.greatlearning.searching;

import java.util.Scanner;

public class LinearSearchPractice {
	int NUM_ELEMENTS, SEARCH_ELEMENT;
	int array[];
	boolean status = false;

	Scanner sc = new Scanner(System.in);

	public void implementationOfLinearSearch() {
		System.out.println("Enter the number of Elements you want to have in the Array : ");
		NUM_ELEMENTS = sc.nextInt();

		array = new int[NUM_ELEMENTS];

		System.out.println("Enter the Elements now : ");

		insertValues();

		printValues();

		System.out.println("Enter an Element to Search : ");
		SEARCH_ELEMENT = sc.nextInt();
		searchValue(SEARCH_ELEMENT);

	}

	public void insertValues() {

		for(int i=0; i<NUM_ELEMENTS; i++) {
			System.out.println("Enter element at Psition " + i + " : ");
			array[i] = sc.nextInt();
		}	

	}



	public void printValues() {
		for(int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.println("Value at Index " + i + " : " + array[i]);
		}
		System.out.println();
	}



	public void searchValue(int value) {
		for(int i = 0; i < NUM_ELEMENTS; i++) {
			if(array[i] == value) {
				System.out.println("Search Value " + value + " found at the Index " + i);
			    status = true;
			}
		}
		if(status == false)
			System.out.println("Value not found ! ");
	}

	public static void main(String[] args) {
		LinearSearchPractice l1 = new LinearSearchPractice();
		l1.implementationOfLinearSearch();

	}

}
