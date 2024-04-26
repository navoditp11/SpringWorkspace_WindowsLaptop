package com.gl.week1.dynamicarray;

public class DynamicArrayDemoRevise2 {
	int[] arr;
	int size;
	int capacity;

	public DynamicArrayDemoRevise2(int capcity) {
		this.capacity = capacity;
		arr = new int[capacity];
		size = 0;
	}
	
	private void insert(int element) {
		if(size == capacity) {
			growArray();
		}
		arr[size++] = element;
	}
	
	private void growArray() {
		int[] tmpArr = new int[2*size];
		for(int i = 0; i<size; i++)
			tmpArr[i] = arr[i];
		
		arr = tmpArr;
		capacity = 2*size;
		
	}

	private void display() {
		System.out.println("\nArray with size: " + size);
		for(int i = 0; i<size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("\nArray with capacity: " + capacity);
		for(int i = 0; i<capacity; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	
	/*
	 * private String delete(int i) { // TODO Auto-generated method stub return
	 * null; }
	 */
	public static void main(String[] args) {
		DynamicArrayDemoRevise2 ob = new DynamicArrayDemoRevise2(3);
		ob.insert(12);
		ob.insert(13);
		ob.insert(15);
		ob.insert(18);
		ob.display();
		
		//System.out.println("Deleted Element: "+ob.delete(2));

	}


	
}
