package com.gl.tree.binarytree;

import java.util.Scanner;

public class BinaryTreeUsingArray {
	
	public int[] tree;
	public int size, i;
	Scanner sc = new Scanner(System.in);
	
    private void insertValue() {
		System.out.println("Enter number of values to insert in the array binary tree");
		size = sc.nextInt();
		tree = new int[size + 1];
		
		for(int i = 1; i <= size; i++) {
			System.out.println("\nEnter value " + i + ": ");
			tree[i] = sc.nextInt();
			printTree();
		}
		
	}

	private void printTree() {
		System.out.println("Binary Tree Root is: " + tree[1]);
		for(int j = 1; j <= i; j++) {
			System.out.println(tree[j] + " ");
		}		
	}

	public static void main(String[] args) {
		BinaryTreeUsingArray binaryTreeUsingArray = new BinaryTreeUsingArray();
		binaryTreeUsingArray.insertValue();
	
	}

	

}
