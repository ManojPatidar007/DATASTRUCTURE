package com.mp;

public class Test {

	public static void main(String[] args) {
		LinkImpl link=new LinkImpl();
		link.itemInsertFirst(20);
		link.itemInsertFirst(23);
		link.add(4);
		link.add(6);
		link.add(2);
		link.add(8);
		link.printList();
		link.delete(2);
		link.reverse();
		System.out.println("After reverse");
		link.printList();
		
		// TODO Auto-generated method stub

	}

}
