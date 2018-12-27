package com.mp.graph;


public class GraphImpl {
	Graph graph;

	public GraphImpl(int i) {
		graph = new Graph(i);
	}

	public void addEdge(int src, int dest) { // undirected graph
		graph.list[src].add(dest);
		graph.list[dest].add(src);
	}

	public void show() {
	      
        for(int v = 0; v < graph.v; v++) 
        { 
            System.out.println("Adjacency list of vertex "+ v); 
            System.out.print("head"); 
            for(Integer pCrawl: graph.list[v]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n"); 
        } 
		
	}
}
