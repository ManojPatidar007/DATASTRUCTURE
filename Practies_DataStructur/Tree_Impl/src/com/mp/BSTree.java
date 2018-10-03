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
		root=delete(root,i);
	}
	public void findElement(int key){
		Node n= findElement(root,key);
		if(n!=null){
			System.out.println("found element="+n.value);
		}
	}
	private Node findElement(Node root, int i) {
		if(root.value==i){
			return root;
		}
		else {
			if (root.value>i){
			return root.llink=findElement(root.llink, i);
			
			}
			else if(root.value<i) {
			return root.rlink=findElement(root.rlink, i);
				
			}
		}
		
		return root;
	}
	private Node delete(Node root, int i) {
		if(root==null){
			System.out.println("tree is empty");
			return root;
		}
		if(i<root.value){
			root.llink=delete(root.llink,i);
		}
		else if(i>root.value){
			root.rlink=delete(root.rlink,i);
		}
		else
		{
		 if (root.llink == null) 
                return root.rlink; 
            else if (root.rlink == null) 
                return root.llink; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.value = minValue(root.rlink); 
  
            // Delete the inorder successor 
	     root.rlink = delete(root.rlink, root.value); 
	   }
		return root;
	}
	 private int minValue(Node root) 
    { 
        int minv = root.value; 
        while (root.llink != null) 
        { 
            minv = root.llink.value; 
            root = root.llink; 
        } 
        return minv; 
    } 
	
}
