package com.greatlearning.searching;

import java.util.Scanner;

public class BinarySearchPractice2 { //Time Complexity = O(log n)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter " + size + " elements in the Array: ");
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the key element needs to be searched: ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr,key,0,size-1);
		
		if(index == -1)
			System.out.println("Key element not found in the Array");
		else
			System.out.println("Key element " + key + " found at the index: " + index);

	}

	private static int binarySearch(int[] arr, int key, int low, int high) {
		int mid;
		mid = (low + high)/2;
		
		if(arr[mid] == key) {
			return mid;
		}
		if(low == high) {
			return -1;
		}
		if(arr[mid] > key) {
			return binarySearch(arr, key, low, mid-1);
		}
		if(arr[mid] < key) {
			return binarySearch(arr, key, mid+1, high);
		}
		return -1;
	}

}
