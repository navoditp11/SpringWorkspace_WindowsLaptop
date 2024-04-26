package com.greatlearning.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {17, 101, 45, 77, 21, 4, 51, 1, 1000, 201};
		
		System.out.println("Array before Selection Sort: ");
		for(int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		
		selectionSort(arr);
		
		System.out.println("\nArray after Selection Sort: ");
		for(int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallestNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallestNumber;
		}
		
	}

}
