package com.mp;

public class SyncronizationStatic {
	public static synchronized void show() {
		for (int i = 0; i < 5; i++) {
			System.out.println("thread is running"
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
		}
	}

}
