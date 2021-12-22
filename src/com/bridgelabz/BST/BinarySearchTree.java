package com.bridgelabz.BST;

/*
 * Binary Search Tree
 */
//Outer class for all methods
class BST {
	
	//Insert node
	public Node insert(Node node, int val) {

		if (node == null) {
			return createNewNode(val);
		}

		if (val < node.data) { // value is less than node is insert on left
			node.left = insert(node.left, val);
		} else if ((val > node.data)) { // value is greater than node is insert on right
			node.right = insert(node.right, val);
		}

		return node;
	}

	//Create new node
	public Node createNewNode(int k) {
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}

	//print data
	public void printNodes(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.data + " ");
		printNodes(node.left);
		printNodes(node.right);
	}
}

//Main method
public class BinarySearchTree {

	public static void main(String[] args) {
		
		BST bst = new BST();
		Node node = null;
		
		node = bst.insert(node, 56);
		node = bst.insert(node, 30);
		node = bst.insert(node, 70);
		bst.printNodes(node);
	}

}
