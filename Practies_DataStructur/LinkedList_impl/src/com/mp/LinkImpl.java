package com.mp;

public class LinkImpl {
	private Node head;
	public LinkImpl(int item){
		head=new Node();
		head.value=item;
		head.link=null;
	}
	public boolean itemInsertFirst(int item){
		Node node=new Node();
		node.value=item;
		node.link=head;
		head=node;
		//LinkImpl(item);
		return true;
	}
	class Node{
		private int value;
		private Node link;
	}
	public void printList(){
		Node z=head;
		while(z!=null){
			System.out.println(z.value);
			z=z.link;
		}


	}
}
