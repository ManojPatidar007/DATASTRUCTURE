package com.mp;

public class Test{
	 int arr[]={4,2,6,4,8,3,9};
	 int ars[]={4,2,6,4,8,3,9};
	  int ari[]={4,2,6,4,8,3,9};
	public  static void main(String ar[]){
		Test t=new Test();
		MergeShort s=new MergeShort();
	    s.mShort(t.arr);
		System.out.println("mergeshort=");
		for(int i=0;i<t.arr.length;i++){
		System.out.println(t.arr[i]);
	}
	QuickSort q=new QuickSort();
	q.sort(t.ars);
	System.out.println("quicksort==");
	for(int i=0;i<t.ars.length;i++){
		System.out.println(t.ars[i]);
	}
	InsertionSort m=new InsertionSort();
	m.sort(t.ari);
	System.out.println("quicksort==");
	for(int i=0;i<t.ari.length;i++){
		System.out.println(t.ari[i]);
	}
	}
	
	}