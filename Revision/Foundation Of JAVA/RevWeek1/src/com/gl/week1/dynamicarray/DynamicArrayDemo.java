package com.gl.week1.dynamicarray;

public class DynamicArrayDemo {
	
	int[] arr; 
	int size;
	int capacity;
	
	DynamicArrayDemo(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		size = 0;
	}
	
	void insert(int element) {
		if(size ==  capacity) {
			growAway();
		}
		arr[size++] = element;
	}
	
	void growAway() {
		int[] tempArr = new int[2*size];
		for(int i = 0; i < size; i++)
			tempArr[i] = arr[i];
		
		arr = tempArr;
		capacity = 2 * size;
	}
	
	int delete(int index) {
		if(index >= size)
			return -1;
		
		int deletedElement = arr[index];
		
		for(int i = index+1; i < size; i++)
			arr[i-1] = arr[i];
		
		size--;
		return deletedElement;
	}
	
	void display() {
		System.out.println("\nArray with size: ");
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println("\nArray with capacity: ");
		for(int i = 0; i < capacity; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}

	public static void main(String[] args) {
		DynamicArrayDemo ob = new DynamicArrayDemo(3);
		
		ob.insert(12);
		ob.insert(13);
		ob.insert(15);
		ob.insert(18);
		ob.display();
		
		System.out.println("\nDeleted Element: " + ob.delete(2));
		ob.display();

	}

}
