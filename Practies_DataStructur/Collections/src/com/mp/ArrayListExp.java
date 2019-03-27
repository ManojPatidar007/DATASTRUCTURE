package com.mp;

public class ArrayListExp {
	private int arr[] = new int[100];
	int max = 0;

	public void add(int data) {
		if(max==99){
			System.out.println("array is full");
			return;
		}
		arr[max++] = data;
	}

	public void remove() {
		arr[max--] = 0;
	}
	public void show(){
		for(int i=0;i<max;i++){
			System.out.println(""+arr[i]);
		}
	}
}
