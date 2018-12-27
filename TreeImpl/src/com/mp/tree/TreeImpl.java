package com.mp.tree;

public class TreeImpl {
	Node root;

	public TreeImpl() {
		
	}

	TreeImpl(int data) {
		if (root == null) {
			root = new Node(data);
		}
	}

	public void add(int data) {
		root = addNode(data, this.root);
	}

	private Node addNode(int data, Node root) {
		if (root == null) {
			root = new Node(data);
		}
		if (root.data > data) {
			root.left = addNode(data, root.left);
		} else if (root.data < data) {
			root.right = addNode(data, root.right);
		}
		return root;
	}

	private void show(Node root) {
		if (root == null)
			return;
		System.out.println(root.data);
		show(root.left);
		show(root.right);
	}

	public void show() {
		// System.out.println(this.root);
		this.show(this.root);
	}
	public int total(){
		return total(root);
	}

	private int total(Node root2) {
		if(root2==null)
			return 0;
		int l=1;
		l+=total(root2.left);
		l+=total(root2.right);
		return l;
	}
	public boolean search(int data){
return search(data,root);}

	private boolean search(int data, Node root) {
		
		if(root.data==data){
			return true;
		}
		 if(root.left!=null){
			 if(search(data,root.left))
			return true;
		}
		 if(root.right!=null){
			 if(search(data,root.right))
			 return true ;
		 }
		return false;
	}
}
