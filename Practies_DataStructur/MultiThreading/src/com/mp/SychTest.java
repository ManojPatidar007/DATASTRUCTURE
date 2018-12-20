package com.mp;

/**
 * @author mapa0716
 *
 */
public class SychTest implements Runnable{
	public volatile int counter = 0;
	public volatile int counters = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SychTest t=new SychTest();
		t.call();

	}

	private void call() {
		SychTest t1=new SychTest();
		
		Thread s2=new Thread(t1);
		Thread s1=new Thread(t1);
		s1.start();
		s2.start();
		
		
		
	}

	public void run() {
		System.out.println("running is called");
		SychronizationInstance si=new SychronizationInstance();
		SyncronizationStatic ss=new SyncronizationStatic();
		ss.show();
		si.show();
		
	}

}
