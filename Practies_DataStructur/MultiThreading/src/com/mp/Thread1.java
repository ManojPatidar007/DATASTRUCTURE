package com.mp;

public class Thread1 implements Runnable {
	Runnable run=new  Runnable() {
		public void run() {
			System.out.println("Thread1 is running as runnableooooooooooooo");
		}
	};
	public void run() {
		System.out.println("Thread1 is running as runnable");
	}

}
