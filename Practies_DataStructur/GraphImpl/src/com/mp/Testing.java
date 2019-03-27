package com.mp;

import com.mp.graph.DirGraphImpl;
import com.mp.graph.GraphImpl;

public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GraphImpl gp = new GraphImpl(5);
		gp.addEdge(0, 4);
		gp.addEdge(2, 1);
		gp.addEdge(3, 0);
		gp.addEdge(3, 2);
		gp.addEdge(1, 3);
		// gp.show();

		DirGraphImpl dgp = new DirGraphImpl(5);
		dgp.addEdge(0, 4);
		dgp.addEdge(2, 1);
		dgp.addEdge(3, 0);
		dgp.addEdge(3, 2);
		dgp.addEdge(1, 3);
		// dgp.show();
		dgp.BFS(2);

	}

}
