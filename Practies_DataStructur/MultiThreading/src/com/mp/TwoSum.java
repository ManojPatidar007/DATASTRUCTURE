package com.mp;

public class TwoSum implements Runnable
{
	private int total=0;
	private int sum1=0;
	private int sum2=0;
	private Integer sum1Lock=new Integer(1);
	private Integer sum2Lock=new Integer(1);
	public int add(int i){
		return this.sum1+=i;
	}
	public void run() {
		for (int i = 0; i < 1000; i++)
			total = sum1+i;
		System.out.println("total=" + total);
	}
}
