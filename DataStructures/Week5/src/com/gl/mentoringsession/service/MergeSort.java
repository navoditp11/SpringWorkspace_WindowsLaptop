package com.gl.mentoringsession.service;

public class MergeSort {

	public void sort(int[] array, int left, int right) {
		
		if(left < right) {
			//find the mid element
			int mid = (left + right)/2;
			
			sort(array, left, mid);
			sort(array, mid + 1, right);
			merge(array, left, mid, right);
		}	
	}

	private void merge(int[] array, int left, int mid, int right) {
		
		//find size of two sub arrays to be merged
	
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		//create temp arrays
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		//copy the data into temp arrays
		
		for(int i = 0; i < n1; i++) {
			leftArray[i] = array[left + i];
		}
		
		for(int j = 0; j < n2; j++) {
			rightArray[j] = array[mid + 1 + j];
		}
		
		//merge the temp arrays
		int i = 0;
		int j = 0;
		int k = left;
		
		while((i < n1) && (j < n2)) {
			if(leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			}
			else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		//copy remaining elements of left array if any
		while(i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		
		//copy remaining elements of right array if any
		while(j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}

}
