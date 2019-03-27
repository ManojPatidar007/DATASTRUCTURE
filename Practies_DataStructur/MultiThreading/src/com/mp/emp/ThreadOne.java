package com.mp.emp;

public class ThreadOne extends Thread{
	public void run(){
		System.out.println("Thread one is running");
		for(int i=0;i<5;i++){
			System.out.println("j="+i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}

}
