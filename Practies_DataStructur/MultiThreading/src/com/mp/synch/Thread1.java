package com.mp.synch;

/**
 * @author mapa0716
 *
 */
public class Thread1 extends Thread{
	public void run(){
		System.out.println("Thread 2 is running");
		PrintTable p=new PrintTable();
		//p.ptintTable(5);
		p.printSquare(30);
		
	}

}
