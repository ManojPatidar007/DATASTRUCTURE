package com.mp.emp;

public class ThreadTwo implements Runnable {
	public void run(){
		ThreadOne t=new ThreadOne();
		try {
			t.start();
			t.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Thread two is running");
		for(int i=0;i<5;i++){
			System.out.println("i="+i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}

	
}
