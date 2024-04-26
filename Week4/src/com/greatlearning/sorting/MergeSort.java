package com.greatlearning.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {24, 1, 25, 57, 4, 7, 2, 55, 3, 100, 6, 5};
		
		System.out.println("Original Array: ");
		display(arr);
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("Array after Merge Sort: ");
		display(arr);

	}

	private static void display(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	private static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right)/2; // (0 + 7)/2 = 3
			
			mergeSort(arr, left, mid); // (arr, 0, 3)
			mergeSort(arr, mid+1, right); //(arr, 4, 7)
			
			merge(arr, left, mid, right); //(arr, 0, 3, 7)
		}		
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int len1 = mid - left + 1; // 3 - 0 + 1 = 4
		int len2 = right - mid; // 7 - 3 = 4
		
		int arrLeft[] = new int[len1]; 
		int arrRight[] = new int[len2];
		
		for(int i = 0; i < len1; i++) {
			arrLeft[i] = arr[left + i]; // 24, 1, 25, 57
		}
		
		for(int j = 0; j < len2; j++) {
			arrRight[j] = arr[mid + 1 + j];
		}
		
		int i, j, k;
		i = 0;
		j = 0;
		k = left;
		
		while((i < len1) && (j < len2)) {
			if(arrLeft[i] <= arrRight[j]) {
				arr[k] = arrLeft[i];
				i++;
			}
			else {
				arr[k] = arrRight[j];
				j++;
			}
			k++;
		}
		
		while(i < len1) {
			arr[k] = arrLeft[i];
			i++;
			k++;
		}
		
		while(j < len2) {
			arr[k] = arrRight[j];
			j++;
			k++;
		}
				
	}

}
