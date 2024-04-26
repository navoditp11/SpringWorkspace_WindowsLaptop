package com.gl.week1.operationsonarray;

public class ArrayOperationsDemoRevise2 {
	int[] arr;
	int size;
	int capacity;
	
	public ArrayOperationsDemoRevise2(int capacity) {
		this.capacity = capacity;
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
			arr[i+1] = arr[i];
		}
		
		arr[index] = element;
		size++;
		
	}
	
	
	public int deleteInEnd() {
		int deletedElement = arr[size-1];
		arr[size-1] = 0;
		size--;
		return deletedElement;	
		
	}
	
	private int deleteAtIndex(int index) {
		if(index >= size)
			return -1;
		int deletedElement = arr[index];
		for(int i = index; i<size; i++)
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
		ArrayOperationsDemoRevise2 ob = new ArrayOperationsDemoRevise2(10);
		ob.insertInEnd(20);
		ob.insertInEnd(1);
		ob.insertInEnd(3);
		ob.insertInEnd(14);
		ob.insertInEnd(32);
		ob.insertInEnd(67);
		
		ob.insertAtIndex(15,1);
		ob.traversal();
		ob.deleteInEnd();
		System.out.println("deleted value is: " + ob.deleteAtIndex(2));
		ob.traversal();
	}

	

}
