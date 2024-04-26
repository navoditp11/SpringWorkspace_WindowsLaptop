package com.gl.week1.dynamicarray;

public class DynamicArrayDemoRevise {
	int[] arr;
	int size;
	int capacity;
	
	DynamicArrayDemoRevise(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		size = 0;
	}
	
	void insert(int element) {
		if(size == capacity) {
			growArray();
		}
		arr[size++] = element;
	}
	
	void growArray() {
		int[] tmpArr = new int[2*size];
		
		for(int i = 0; i<size; i++)
			tmpArr[i] = arr[i];
		
		arr = tmpArr;
		capacity = 2 * size;
	}
	
	int delete(int index) {
		if(index >= size)
			return -1;
		
		int deletedelement = arr[index];
		
		for(int i = index + 1; i<size; i++)
			arr[i-1] = arr[i];
		
		size--;
		return deletedelement;
	}
	
	void display() {
		System.out.println("\nArray with size");
		for(int i = 0; i<size;i++)
			System.out.print(arr[i] + " ");
		
		System.out.println("\nArray with capacity");
		for(int i = 0; i<capacity;i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}

	public static void main(String[] args) {
		DynamicArrayDemoRevise ob = new DynamicArrayDemoRevise(3);
		ob.insert(12);
		ob.insert(13);
		ob.insert(15);
		ob.insert(18);
		ob.display();
		System.out.println("Deleted Element: " + ob.delete(2));
		ob.display();

	}

}
