package com.mp;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class Test {

	public static void main(String[] args) {
/*		LinkImpl link=new LinkImpl();
		link.itemInsertFirst(20);
		link.itemInsertFirst(23);
		link.add(4);
		link.add(6);
		link.add(2);
		link.add(8);
		//link.printList();
		link.delete(2);
		link.reverse();
		System.out.println("After reverse");*/
		//link.printList();
		
		// TODO Auto-generated method stub
		LinkedList<Integer> ir=new LinkedList();
		ir.add(20);
		ir.add(220);
		ir.add(210);
		ListIterator<Integer> in=ir.listIterator();
		//while(in.hasNext()){
			in.next();
		
		while(in.hasPrevious()){
			System.out.println(in.previous());
			
		}
	}

}
