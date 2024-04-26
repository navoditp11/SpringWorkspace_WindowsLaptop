package com.greatlearning.sorting;

import java.util.Scanner;

public class SelectionSortPractice2 { //Time Complexity = O(n^2)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter " + size + " values in the Array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		selectionSort(arr);
		
		System.out.println("Array after Selection sort: ");
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			int minIndex = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
