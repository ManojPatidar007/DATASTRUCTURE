//package com.mp;

import graph.*;

public class Testing {
public static void main(String ar[]){
	
	Node node=new Node();
	node.add("10");
	node.add(10);
	Node chr=new Node('c');
	EdgGraph a=new EdgGraph(5);
	a.addAdge(2,4);
	a.addAdge(2,3);
	a.addAdge(2,1);
	a.addAdge(1,3);
	a.addAdge(1,4);
	a.printGraph();
	
}
}
