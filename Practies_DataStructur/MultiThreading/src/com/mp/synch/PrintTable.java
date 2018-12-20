package com.mp.synch;

/**
 * @author mapa0716
 * 
 */
public class PrintTable {
	String sa = "sa";

	public void ptintTable(int n) {// static synchronized which work on class
									// level
		for (int i = 1; i <= 10; i++) {
			synchronized (sa) {
				System.out.println("" + i + "*" + n + "=" + i * n);

			}
		}
	}

	public static synchronized void printSquare(int i) {//WITHOUT static if two different thread with different ref ic call then out put in not predict
		for (int j = 0; j < 5; j++)
			System.out.println("square od i=" + i * i);
		
	}

}
