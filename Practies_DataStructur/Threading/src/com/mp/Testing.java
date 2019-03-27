package com.mp;

public class Testing {

	public static void main(String[] args) {
		Thread1 ta=new Thread1();
		ta.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ta is running");

	}

}
