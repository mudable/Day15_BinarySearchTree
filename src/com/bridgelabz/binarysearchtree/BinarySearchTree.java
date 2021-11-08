package com.bridgelabz.binarysearchtree;

public class BinarySearchTree<K extends Comparable<K>> {
	private Node<K> root;

	public void add(K key) {
		this.root = this.insertData(root, key);
	}

	public Node<K> insertData(Node<K> current, K key) {
		if (current == null)
			return new Node<K>(key);
		int compareResult = key.compareTo(current.key);

		if (compareResult == 0)
			return current;

		if (compareResult < 0) {
			current.left = insertData(current.left, key);
		} else {
			current.right = insertData(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeBinary(root);
	}

	public int getSizeBinary(Node<K> current) {
		return current == null ? 0 : 1 + this.getSizeBinary(current.left) + this.getSizeBinary(current.right);
	}

	@Override
	public String toString() {
		return "MyBinary [root=" + root + "]";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to BinarySearchTree program");
		BinarySearchTree<Integer> binaryTree = new BinarySearchTree<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		binaryTree.add(65);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(63);
		binaryTree.add(67);
		int size = binaryTree.getSize();
		System.out.println(binaryTree);
		System.out.println("size of binary tree:" + size);
	}
}