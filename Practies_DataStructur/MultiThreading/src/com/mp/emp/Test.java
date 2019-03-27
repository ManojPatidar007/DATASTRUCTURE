package com.mp.emp;

/**
 * @author mapa0716
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		//t2.setPriority(Thread.MAX_PRIORITY);//becaues threadtwo class implements runnable
		System.out.println("t1 priority" + t1.getPriority());
		//System.out.println("t2 priority" + t2.getPriority());
		t1.start();
		//t2.start();
		try {
			t1.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread a1=new Thread(t2);
		a1.start();
		
		//t2.run();//will behave like normal method, Not create new thread

	}

}
