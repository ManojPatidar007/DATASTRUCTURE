package com.mp;

public class LinkImpl {
	private Node head;
	public LinkImpl(){
		
	}
	public boolean itemInsertFirst(int item){
		Node node=new Node(item);
		if(head==null){
			head=node;
			return true;
		}
		Node temp=head;
		head=node;
		node.link=temp;
		return true;
	}
	public void add(int item){
		addATLast(this.head,item);
	}
	private void addATLast(Node head,int item){
		Node node=new Node(item);
		if(head==null){
			head=node;
			return;
		}
		Node temp=this.head;
		while(temp.link!=null){
			temp=temp.link;
		}
		temp.link=node;
		}


	private void printListIte(){
		Node z=head;
		while(z!=null){
			System.out.println(z.value);
			z=z.link;
		}
	}
	public void printList(){
		
		printListIte();
		//System.out.println("recursion");
		//printListRec(head);
		
	}
	private void printListRec(Node head){
		if(head==null){
			return;
		}
		System.out.println(head.value);
		printListRec(head.link);
	}
	public void delete(int item){
		delete(item,head);
	}
	private void delete(int ind, Node head) {

		if(this.head.value==ind){
			this.head=this.head.link;
		}
		Node pri=head;
		Node next=head.link;
		while(next!=null){
			if(next.value==ind){
				pri.link=next.link;
				System.out.println("Data avaliable="+ind);
				return;
			}
			else{
				pri=next;
				next=next.link;
			}
		}
		System.out.println("Data not avaliable");


	}
	public void reverse(){
		head=reverse(head);
	}
	private Node reverse(Node head){
		Node pri=null,cur=head,next=head.link;
		while(next!=null){
			cur.link=pri;
			pri=cur;
			cur=next;
			next=next.link;
		}
		cur.link=pri;
		head=cur;
		return head;
	}
}

