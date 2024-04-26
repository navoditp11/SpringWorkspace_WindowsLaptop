package question2;

import java.util.HashSet;
import java.util.Set;

class Node {
	int key;
	Node left, right;

	public Node(int key) {
		this.key = key;
		left = right = null;
	}
}

public class FindPairSum {
	Node root;

	public static void main(String[] args) {
		FindPairSum tree = new FindPairSum();
		tree.root = tree.insert(tree.root, 40);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 60);
		tree.insert(tree.root, 10);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 50);
		tree.insert(tree.root, 70);
		System.out.println("InOrder Traverse");
		tree.inOrderTraverse(tree.root);
		System.out.println();
		
		int sum = 130;
		tree.findPairwithGivenSum(tree.root, sum);
		tree.findPairwithGivenSum(tree.root, 37);		

	}

	private void findPairwithGivenSum(Node root, int sum) {
		Set<Integer> set = new HashSet<>();
		if(!findPairUtil(root, sum, set))
			System.out.println("Pairs doesn't exists" + "\n");
	}

	private boolean findPairUtil(Node node, int sum, Set<Integer> set) {
		if(node == null) {
			return false;
		}
		if(findPairUtil(node.left, sum, set))
			return true;
		int diff = sum - node.key;
		if(set.contains(diff)) {
			System.out.println("Given Pair (" + node.key + ", " + diff + ")");
			return true;
		}
		else {
			set.add(node.key);
		}
		return findPairUtil(node.right, sum, set);
	}
	
	private void inOrderTraverse(Node node) {
		if (node == null)
			return;
		inOrderTraverse(node.left);
		System.out.print(node.key + " ");
		inOrderTraverse(node.right);
	}
	
	// A utility function to insert
	// a new node with given key in BST
	private Node insert(Node node, int key) {
	// If the tree is empty, return a new node
		if (node == null) {
			node = new Node(key);
			return node;
		}
		// Otherwise, recur down the tree
		if (key < node.key) {
			node.left = insert(node.left, key);
		} 
		else if (key > node.key) {
			node.right = insert(node.right, key);
		}
		return node;
	}

}
