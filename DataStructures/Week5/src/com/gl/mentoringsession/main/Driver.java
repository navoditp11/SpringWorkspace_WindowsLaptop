package com.gl.mentoringsession.main;

import java.util.Scanner;

import com.gl.mentoringsession.service.ArrayRotation;
import com.gl.mentoringsession.service.MergeSort;
import com.gl.mentoringsession.service.ModifiedBinarySearch;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the Array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		System.out.println("Enter the " + size + " elements: ");
		
		int array[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Array before sorting is: ");
		for(int i = 0; i < size; i++) {
			System.out.print(" " + array[i]);
		}
		
		MergeSort mergesort = new MergeSort();
		mergesort.sort(array, 0, array.length-1);
		
		System.out.println("\n----------------------\n");
		System.out.println("Array after sorting is: ");
		for(int i = 0; i < size; i++) {
			System.out.print(" " + array[i]);
		}
		
		ArrayRotation arrayRotation = new ArrayRotation();
		arrayRotation.leftRotate(array, array.length/2, array.length);
		
		System.out.println("\n----------------------\n");
		System.out.println("Array after rotation is: ");
		for(int i = 0; i < size; i++) {
			System.out.print(" " + array[i]);
		}
		
		System.out.println("\n----------------------\n");
		System.out.println("Enter the Key: ");
		int key = sc.nextInt();
		
		ModifiedBinarySearch modifiedBinarySearch = new ModifiedBinarySearch();
		int index = modifiedBinarySearch.search(array, size, key);
		
		if(index == -1)
			System.out.println("Element is not found");
		else
			System.out.println("Key " + key + " is found at the Index: " + index );
		
		sc.close();
	}

}
