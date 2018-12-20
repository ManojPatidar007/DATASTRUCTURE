package com.mp.emp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author mapa0716
 *
 */
public class TestPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService ex=Executors.newFixedThreadPool(5);//creating a pool of five thread
		ThreadPool t2=new ThreadPool();
		ThreadPool t=new ThreadPool();
		//t.start();
		//ex.execute(t2);
		try {
		//	t.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ex.execute(t);
		ex.execute(t);
		ex.execute(t);
		ex.execute(t);
		ex.execute(t);
		ex.execute(t);
		ex.execute(t);
		ex.execute(t);
		ex.execute(t);
	}

}
