package com.gl.linkedlist;

class Node{
	public int nodeData;
	public Node nextNode;
}

public class SinglyLinkedList {
	
	private Node head;
	
	public void displayLinkedList() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.nodeData + " -> ");
			currentNode = currentNode.nextNode;
		}
		System.out.println("NULL");
	}
	
	public void insertAtFront(int data) {
		Node newNode = new Node();
		newNode.nodeData = data;
		newNode.nextNode = head;
		head = newNode;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.displayLinkedList();
		linkedList.insertAtFront(14);
		linkedList.insertAtFront(20);
		linkedList.displayLinkedList();

	}

}
