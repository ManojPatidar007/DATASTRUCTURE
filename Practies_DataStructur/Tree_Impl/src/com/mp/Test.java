package com.mp;

public class Test {

	public static void main(String[] args) {
	Tree t=new Tree();
	t.insert(5);
	//t.show();
	BSTree b=new BSTree();
	b.insert(23);
	b.insert(4);
	b.insert(30);
	b.insert(13);
	
	b.insert(33);
	b.insert(12);
	b.insert(10);
	b.insert(11);
	b.inShow();
	b.heigth();
//	System.out.println("total="+b.count());
	//b.findElement(30);
	b.delete(23);
	b.inShow();

	}

}
