package com.greatlearning.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int array[] = {12, 7, 15, 20, 2, 6, 1};
		int size = array.length;
		int keyElement = 1;
		int position = linearSearch(array, keyElement, size);
		if(position == -1)
			System.out.println("Element is not found in the given Array. ");
		else
			System.out.println("Element " + keyElement + " is found at the index " + position);
	}

	private static int linearSearch(int[] array, int keyElement, int size) {
		for (int i = 0; i < size; i++) {
			if(array[i] == keyElement) {
				return i;
			}
		}
		return -1;
	}

}
