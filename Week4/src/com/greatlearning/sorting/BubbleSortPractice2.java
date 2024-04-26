package com.greatlearning.sorting;

import java.util.Scanner;

public class BubbleSortPractice2 { //Time Complexity = O(n^2)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the elements in the Array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();					
		}
		
		bubbleSort(arr);
		
		System.out.println("Array after Bubble Sorting: ");
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");					
		}

	}

	private static void bubbleSort(int[] arr) {
		int size = arr.length;
		int temp;
		for(int i = 0; i < size-1; i++) {
			for(int j = 0; j < size-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

}
