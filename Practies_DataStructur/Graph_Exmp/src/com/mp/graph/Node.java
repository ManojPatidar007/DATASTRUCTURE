package graph;

import java.util.LinkedList;

public class Node<E> {
	Node root;
	Node left;
	Node right;
	E data;

	public Node() {

	}

	public Node(E data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}

	public void add(E i) {
		if (root == null) {
			root = new Node(i);
		}
		
	}

}
