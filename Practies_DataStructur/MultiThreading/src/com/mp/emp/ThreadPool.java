package com.mp.emp;

public class ThreadPool implements Runnable{
	

	public void run() {
		System.out.println("courent thread="+Thread.currentThread().getName());
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
		
	}
	private static void show(){
		int data=10;
		System.out.println("data="+data++);
	}

}
