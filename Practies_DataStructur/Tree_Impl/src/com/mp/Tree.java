package com.mp;

public class Tree {
	Node head;

	public void insert(int data){
		insert(head,data);
	}
	private void insert(Node head2, int data) {
		if(head==null){
			Node n=new Node(data);
			head=n;
		}

	}
	public void show(){
		System.out.println(head.value);
	}

}
