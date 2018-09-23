package com.mp;

public class BSTree {
	Node root=null;
	int l,r;
	public void insert(int data){

		root=insert(this.root,data);

	}
	private Node insert(Node root, int data) {
		if(root==null){
			Node node=new Node(data);
			return node;
		}
		if(root.value<data){
			root.rlink=	insert(root.rlink,data);
		}
		else{
			root.llink=insert(root.llink,data);
		}
		return root;
	}

	public void inShow(){

		inorderShow(root);
	}
	private void inorderShow(Node root) {

		if(root==null){return;}
		inorderShow(root.llink);
		System.out.println(root.value);
		inorderShow(root.rlink);

	}
	public void heigth(){
		int i= height(root);
		System.out.println("height of tree="+i);
	}
	private int height(Node root) {
		if(root==null){
			return 0;
		}
		if(root.llink==null&&root.rlink==null){
			return 0;
		}
		l=height(root.llink);
		r=height(root.rlink);
		return 1+(l>r?l:r);
		
	}
	public int count(){
		return totalNode(root);
	}
	private int totalNode(Node root) {
		if(root==null){
			return 1;
		}
		l=totalNode(root.llink);
		r=totalNode(root.rlink);
		return 1+l+r;
		
	}
	public void delete(int i){
	Node n=	findElement(root,i);
	System.out.println("found element="+n.value);
		//delete(root,i,n);
	}
	private Node findElement(Node root, int i) {
		if(root.value==i){
			return root;
		}
		else {
			if (root.value>i){
				findElement(root.llink, i);
			}
			else if(root.value<i) {
				findElement(root.rlink, i);
				
			}
		}
		
		return null;
	}
	private void delete(Node root, int i, Node n) {
		
		
	}
	
}
