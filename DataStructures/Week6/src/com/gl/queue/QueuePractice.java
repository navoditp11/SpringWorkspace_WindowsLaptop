package com.gl.queue;

public class QueuePractice {
	private int maxSize;
	int front;
	int rear;
	int arr[];

	public QueuePractice(int sizeOfQueue) {
		this.maxSize = sizeOfQueue;
		front = -1;
		rear = -1;
		arr = new int[maxSize];
	}
	
	public boolean isFull() {
		if(rear == maxSize-1) {
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
	
    public void enqueue(int data) {
    	if(!isFull()) {
    		rear++;
    		arr[rear] = data;
    		if(front == -1)
    			front = 0;
    	}
    	else {
    		System.out.println("Queue overflow");
    	}
	}
    
    public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue underflow");
		}
		else {
			System.out.println(arr[front] + "deleted");
		}
		if(front == rear) {
			front = -1;
			rear = -1;
		}
		else
			front++;
	}

	public static void main(String[] args) {
		QueuePractice queue = new QueuePractice(2);
		
		queue.enqueue(43);
		queue.enqueue(32);
		queue.dequeue();
		queue.dequeue();

	}
}
