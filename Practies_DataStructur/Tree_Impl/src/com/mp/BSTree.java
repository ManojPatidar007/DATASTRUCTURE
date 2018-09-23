package com.mp;

public class BSTree {
	Node root;
	public void insert(int data){
		Node node=new Node(data);
		if(root==null){

			root=node;
			return;
		}
		else{
			insert(this.root,data);
		}
	}
	private void insert(Node root, int data) {
		if(root==null){
			Node node=new Node(data);
			root=node;
			return;
		}
		if(root.value<data){
			System.out.println("left call"+data);
			insert(root.rlink,data);
			
		}
		else{
			System.out.println("right call"+data);
			insert(root.llink,data);
		}

	}
	
	public void inShow(){
		inorderShow(root);
	}
	private void inorderShow(Node root) {
		if(root!=null){
		inorderShow(root.llink);
		System.out.println(root.value);
		inorderShow(root.rlink);
		}
	}
}
