package com.greatlearning.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {3, 8, 12, 17, 19, 55, 101};
		int key = 101;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);

	}

	private static void binarySearch(int[] arr, int first, int last, int key) {
		int mid = (first+last)/2;
		
		while(first<=last) {
			if(arr[mid]<key) {
				first = mid + 1;
			}
			else if(arr[mid] == key) {
				System.out.println("Element " + key + " found at the Index : " + mid);
				break;
			}
			else {
				last = mid - 1;
			}
			mid = (first + last)/2;		
		}
		if(first > last) {
			System.out.println("Element " + key + " not found in the Array");
		}
		
	}

}
