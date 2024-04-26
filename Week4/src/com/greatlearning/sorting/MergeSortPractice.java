package com.greatlearning.sorting;

import java.util.Scanner;

public class MergeSortPractice {

	public static void main(String[] args) {
		MergeSortPractice msp = new MergeSortPractice();
		msp.MergeSortImplementation();

	}
	
	public int NUM_ELEMENTS;
	public int array[];
	Scanner sc = new Scanner(System.in);

	private void MergeSortImplementation() {
		System.out.println("Enter the number of elements you want to sort: ");
		NUM_ELEMENTS = sc.nextInt();
		array = new int[NUM_ELEMENTS];
		System.out.println("Enter " + NUM_ELEMENTS + " Elements now...");
		
		insertValues();
		sortValues(array, 0, array.length - 1);
		printValues();
		
	}

	private void printValues() {
		System.out.println("Array after Merge Sort");
		for(int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

	private void insertValues() {
		for(int i = 0; i < NUM_ELEMENTS; i++) {
			array[i] = sc.nextInt();
		}	
	}
	
	private void sortValues(int[] array, int left, int right) {
		if(left < right) {
			int mid = (left+right)/2;
			
			sortValues(array, left, mid);
			sortValues(array, mid + 1, right);
			
			merge(array, left, mid, right);
		}
		
	}

	private void merge(int[] array, int left, int mid, int right) {
		
		int len1 = mid - left + 1;
		int len2 = right - mid;
		
		int leftArray[] = new int[len1];
		int rightArray[] = new int[len2];
		
		for(int i = 0; i < len1; i++) {
			leftArray[i] = array[left + i];
		}
		
		for(int j = 0; j < len2; j++) {
			rightArray[j] = array[mid + 1 + j];
		}
		
		int i, j, k;
		i = 0;
		j = 0;
		k = left;
		
		while((i < len1) && (j < len2)) {
			if(leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			}
			else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i < len1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j < len2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
		
	}
	
	

}
