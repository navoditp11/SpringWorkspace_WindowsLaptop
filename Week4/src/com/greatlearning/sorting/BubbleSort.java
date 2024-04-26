package com.greatlearning.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {51, 3, 34, 71, 101, 4, 77};
		
		System.out.println("Array before Bubble Sort: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		bubbleSort(arr);
		
		System.out.println("\nArray after Bubble Sort: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void bubbleSort(int[] arr) {
		int size = arr.length;
		int temp = 0;
		
		for(int i = 0; i < size; i++) {
			for(int j = 1; j < size-i; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}

}
