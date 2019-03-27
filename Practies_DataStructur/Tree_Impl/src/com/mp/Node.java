package com.mp;

public class Node<T> {
	protected T value;
	protected Node rlink;
	protected Node llink;

	Node(T value){
		this.llink=null;
		this.rlink=null;
		this.value=value;
	}

}
