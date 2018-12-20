package com.mp;

/**
 * @author manoj
 * 
 */
public class Testing {
	public static void main(String ar[]) {
		Testing t = new Testing();
		t.producerConsumer();
		t.deadLock();
	}

	private void deadLock() {
		Thread2 t2 = new Thread2();
		Thread1 tr = new Thread1();
		
		Thread t1 = new Thread(tr);
		t1.start();
		t2.start();
		Runnable run1=new  Runnable() {//Anonymous implementation 
			public void run() {
				System.out.println("Thread1 is running as runnableooooooooooooo");
			}
		};
		Thread tm = new Thread(run1);
		tm.start();
		//Runnable run2=() -> {System.out.println("Thread1 is running as runnableooooooooooooo");};//lambda expression 
		
		// t2.setName("hello");
		System.out.println("t1=" + t1.getName());
		System.out.println("tr=" + tm.getName());
		System.out.println("t2=" + t2.getName());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.stop();

	}

	private void producerConsumer() {

	}
}
