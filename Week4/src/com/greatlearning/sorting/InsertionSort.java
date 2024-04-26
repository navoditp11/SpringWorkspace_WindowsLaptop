package com.greatlearning.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {4, 2, 12, 11, 16, 20, 1, 4};
		
		System.out.println("Array before Soring: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		insertionSort(arr);
		
		System.out.println("Array after Soring: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void insertionSort(int[] arr) {
		int size = arr.length;
		
		for(int j = 1; j < size; j++) { // {2, 4, 12, 11, 16, 20} 
			int key = arr[j]; // 2 // 12 //11
			int i = j - 1; // 0 // 1 // 2
			while((i > -1) && (arr[i] > key)) { // 0 > -1 && 4 > 2 // 1 > -1 && 4 > 12 // 2 > -1 && 12 > 11
				arr[i+1] = arr[i]; // 2 -> 4 // 11 -> 12
				i--; //-1 // 1				
			}
			arr[i+1] = key; //4 //12 //  
		}
		
	}

}
