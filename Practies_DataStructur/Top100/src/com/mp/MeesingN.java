package com.mp;

public class MeesingN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9,10,2};
		findMeesing(a);

	}

	private static void findMeesing(int[] a) {
		int sum=0,diff=0;
		int n=a.length;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		diff=(n*(n+1))/2;
		System.out.println("repeat no="+(n-(diff-sum)));
	}

}
