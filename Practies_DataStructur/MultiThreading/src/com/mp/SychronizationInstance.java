package com.mp;

public class SychronizationInstance {
	double j=0;
	public synchronized void show() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("thread is running from instence"
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
		}
	}

	  public synchronized void outer(){
	    inner();
	  }

	  public synchronized void inner(){
	    //do something
	  }

}
