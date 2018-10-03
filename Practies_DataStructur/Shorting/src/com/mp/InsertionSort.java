package com.mp;
class InsertionSort{
	public void sort(int arr[]){
		sorting(arr);
	}
	private void sorting(int arr[]){
		for(int i=1;i<arr.length;i++){
			int j=i-1;
			int key=arr[i];
			while(j>=0&&arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
			
		}
		
	}
	
}