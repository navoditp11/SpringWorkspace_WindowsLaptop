package com.greatlearning.searching;

import java.util.Scanner;

public class LinearSearchPractice2 { // Time Complexity = O(n)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter " + size + " values in the Array: " );
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter a key value to be searched in the Array: ");
		int key = sc.nextInt();
		
		int index = linearSearch(arr, size, key);
		
		if(index == -1)
			System.out.println("Key Value is not found in the Array");
		else
			System.out.println("Key value " + key + " is found at the index: " + index);

	}

	private static int linearSearch(int[] arr, int size, int key) {
		for(int i = 0; i < size; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
