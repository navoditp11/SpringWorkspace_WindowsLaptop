package com.gl.queue;

public class Queue {
	
	private int maxSize;
	int front;
	int rear;
	int arr[];

	public Queue(int sizeOfQueue) {
		this.maxSize = sizeOfQueue;
		front = -1;
		rear = -1;
		arr = new int[maxSize];
	}
	
	public boolean isFull() {
		if(rear == maxSize - 1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(front == -1) {
			return true;
		}
		return false;
	}
	
    private void enqueue(int data) {
		if(!isFull()) {
			rear++;
			arr[rear] = data;
			System.out.println(arr[rear] + " Inserted");
			if(front == -1)
				front = 0;
		}
		else {
			System.out.println("Queue overflow");
		}
		
	}
	private void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
		}
		else {
			System.out.println(arr[front] + " deleted");
		}
		if(front == rear) {
			front = -1;
			rear = -1;
		}
		else
			front++;
		
	}
	

	public static void main(String[] args) {
		
		Queue queue = new Queue(3);
		
		queue.enqueue(43);
		queue.enqueue(32);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(32);
		queue.enqueue(23);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(43);
		queue.enqueue(32);
		queue.enqueue(43);
		queue.enqueue(32);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

	}

}
