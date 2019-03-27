package com.mp.tree;

import java.util.ArrayList;

public class Node {
	Node root;
	int data;
	Node left;
	Node right;

	public Node() {

	}

	public Node(int data) {
		this.root = null;
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public Node(Node root, int data, Node left, Node right) {
		super();
		this.root = root;
		this.data = data;
		this.left = left;
		this.right = right;
	}

}
