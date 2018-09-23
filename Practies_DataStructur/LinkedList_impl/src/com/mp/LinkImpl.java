package com.mp;

public class LinkImpl {
	private Node head;
	public LinkImpl(){
		
	}
	public boolean itemInsertFirst(int item){
		Node node=new Node(item);
		head=node;
		return true;
	}

	public void printList(){
		Node z=head;
		while(z!=null){
			System.out.println(z.value);
			z=z.link;
		}
	}
	public void deleteAt(int ind){
		delete(ind,head);
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
}

