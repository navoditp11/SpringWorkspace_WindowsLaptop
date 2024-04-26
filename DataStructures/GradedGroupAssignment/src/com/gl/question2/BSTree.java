package com.gl.question2;
//**Solution write-up**:
//To convert a given Binary Search Tree into a right-skewed tree 
//(a tree with no left child nodes), we can perform an in-order traversal 
//of the BST and reconstruct the tree as we traverse. 

//**Coding logic**:
//Input is hard coded with the given tree in the question.
//As output display the node values in ascending order.
//This code first constructs a Binary Search Tree (BST) and 
//then transforms it into a right-skewed tree, where each node has 
//at most one child node which is the right child. It then prints 
//the nodes of the right-skewed tree in the order they appear.

public class BSTree {

	// Node class represents each node in the binary tree
	class Node {
		int data; // The value contained in the node
		Node left, right; // Pointers to left and right children

		// Constructor to create a new node with the given data
		public Node(int data) {
			this.data = data;
			left = right = null; // Initially, left and right children are null
		}
	}

	Node node; // Root of the original BST
	Node prevNode = null; // Previous node in the right-skewed tree
	Node newRoot = null; // Root of the new right-skewed tree

	// This function flattens the given BST to a right-skewed tree
	private void flattenBSTtoRightSkewed(Node root) {
		// Base case: If the node is null, simply return
		if (root == null) {
			return;
		}

		// First, traverse the left subtree
		flattenBSTtoRightSkewed(root.left);

		// If newRoot is not set, set it as the current node
		if (newRoot == null) {
			newRoot = new Node(root.data); // This becomes the root of the right-skewed tree
			prevNode = newRoot; // Set the previous node as the new root
		} else {
			// If newRoot is already set, add the current node to the right of the previous
			// node
			prevNode.right = new Node(root.data);
			prevNode = prevNode.right; // Move the previous node pointer to the current node
		}

		// Then, traverse the right subtree
		flattenBSTtoRightSkewed(root.right);
	}

	// This function prints the right-skewed tree starting from the given node
	public void printRightSkewed(Node node) {
		// Traverse the right-skewed tree and print the data
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.right; // Move to the right node
		}
		System.out.println(); // Print a newline at the end
	}

	// Main function to execute the code
	public static void main(String[] args) {
		// Create an instance of BSTree
		BSTree tree = new BSTree();

		// Construct and initialize binary tree with hard coded values
		tree.node = tree.new Node(50);
		tree.node.left = tree.new Node(30);
		tree.node.right = tree.new Node(60);
		tree.node.left.left = tree.new Node(10);
		tree.node.right.left = tree.new Node(55);

		// Flatten the BST to a right-skewed tree
		tree.flattenBSTtoRightSkewed(tree.node);

		// Welcome Message
		System.out.println("Welcome to FSD.G2.B3 Conglumerates!"); // Print Welcome Message
		System.out.println(""); // Print a newline
		System.out.println("Below is the modified BST with right nodes in ascending order."); // Print Output Information
		System.out.println(""); // Print a newline

		// Print the right-skewed tree
		tree.printRightSkewed(tree.newRoot);
		System.out.println(""); // Print a newline
		System.out.println("Thank you!");
	}
}