package com.mp.basic.inheritence;

public class ArrayImpl2D {
public static void main(String aer[]){
	ArrayImpl2D ar=new ArrayImpl2D();
	ar.show();
}

private void show() {
	int[][] ar=new int[2][];
	ar[0]=new int[8];
	int[] ar0={3,4};
	int[] ar1={1,2,7};
	ar[0]=ar0;
	ar[1]=ar1;
	for(int i=0;i<ar.length;i++){
		int a[]=ar[i];
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+", ");
		}
		System.out.println();
	}
	int i=10;
	boolean ba=false;
	//for(;i=10;){}
	for(;ba=true;){}//this will work with if and for loop
	//means you can assign boolean only
	
}
}
