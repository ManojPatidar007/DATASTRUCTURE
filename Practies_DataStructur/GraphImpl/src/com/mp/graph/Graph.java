package com.mp.graph;

import java.util.LinkedList;
import java.util.List;

public class Graph {
	int  v;
	List<Integer> list[];
	Graph(int v){
		this.v=v;
		list=new LinkedList[v];
		for(int i=0;i<v;i++){
			list[i]=new LinkedList();
		}
	}

}
