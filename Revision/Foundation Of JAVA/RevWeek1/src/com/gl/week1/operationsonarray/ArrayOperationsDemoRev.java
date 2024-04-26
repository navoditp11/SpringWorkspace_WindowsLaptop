package com.gl.week1.operationsonarray;

public class ArrayOperationsDemoRev {
	int[] arr;
	int capacity;
	int size;
	
	public ArrayOperationsDemoRev(int capacity) { //parameterized constructor
		this.capacity = capacity; //here this.capacity is referring to the variable declared outside the constructor
		arr = new int[capacity];
		size = 0;
	}
	
	private void insertInEnd(int element) {
		arr[size++] = element;		
	}
	
	private void insertAtIndex(int element, int index) {
		if(size == capacity)
			return;
		
		for(int i = size-1; i >= index; i--) {
			arr[i+1] = arr[i]; //shifting all the elements one step right, starting from last element
		}
		
		arr[index] = element; //inserting value at the given index
		size++; //increasing the size by 1. here size will just get increased.
	}
	
	private int deleteInEnd() {
		int deletedElement = arr[size-1]; 
		arr[size-1] = 0; //make the last value if index to 0 & reduce the size by 1
		size--;
		return deletedElement;
	}
	
	private int deleteAtIndex(int index) {
		if(index >= size)
			return -1;
		
		int deletedElement = arr[index];
		for(int i = index; i < size; i++)
			arr[i] = arr[i+1];
		
		size--;
		return deletedElement;
	}
	
	private void traversal() {
		System.out.println("\nArray: ");
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}		
		System.out.println("\n");
		
	}
	

	public static void main(String[] args) {
		ArrayOperationsDemoRev ob = new ArrayOperationsDemoRev(40);
		
		ob.insertInEnd(20);
		ob.insertInEnd(10);
		ob.insertInEnd(7);
		ob.insertInEnd(30);
		ob.insertInEnd(40);
		ob.insertInEnd(90);
		
		ob.insertAtIndex(15,1);
		ob.traversal();
		
		System.out.println("Deleted value at last index is " + ob.deleteInEnd());
		System.out.println("Deleted value at the index 3 is " + ob.deleteAtIndex(3));
		
		ob.traversal();
	

	}


}
