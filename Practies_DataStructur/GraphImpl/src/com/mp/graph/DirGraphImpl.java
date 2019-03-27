package com.mp.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DirGraphImpl {
	Graph gr;
	int v;
	public DirGraphImpl(int data){
		this.v=data;
		gr=new Graph(data);
	}
	public void addEdge(int str,int end){
		//directed graph
		gr.list[str].add(end);
	}
	public void BFS(int i){
		boolean visited[]=new boolean[v];
		
		visited[i]=true;
		LinkedList<Integer> queue=new LinkedList();
		queue.add(i);
		while(queue.size()>0){
			i=queue.remove();
			System.out.println(i);
			Iterator<Integer> ir=gr.list[i].iterator();
			while(ir.hasNext()){
				int n= ir.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
			}
			
		}
		
	}
	public void show() {
	      
        for(int v = 0; v < gr.v; v++) 
        { 
            System.out.println("Adjacency list of vertex "+ v); 
            System.out.print("head"); 
            for(Integer pCrawl: gr.list[v]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n"); 
        } 
		
	}

}
