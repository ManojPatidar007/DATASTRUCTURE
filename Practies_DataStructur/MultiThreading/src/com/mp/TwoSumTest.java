package com.mp;

/**
 * @author mapa0716
 * 
 */
public class TwoSumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoSumTest T = new TwoSumTest();

		T.show();

	}

	private void show() {

		 TwoSum sum = new TwoSum();
		/*Runnable r = new Runnable() {
			int total = 0;

			public void run() {
				for (int i = 0; i < 1000; i++)
					total = sum.add(i);
				System.out.println("total=" + total);
			}
		};*/
		Thread t1=new Thread(sum);
		Thread t2=new Thread(sum);
		t1.start();
		try {
			//t1.sleep(100);
			//t1.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();

	}

}
