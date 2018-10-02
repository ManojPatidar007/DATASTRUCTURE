package com.mp;
class QuickSort{
	public void sort(int arr[]){
		quickSort(arr,0,arr.length-1);
	}
	private void quickSort(int arr[],int low,int high){
		if(low<high){
			int p=partion(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
	}
	private int partion(int arr[],int low,int high){
		int pivot=arr[high];
		int j=low;
		for(int i=low;i<high;i++){
			if(arr[i]<=pivot){
				
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}
		}
		int temp=arr[j];
		arr[j]=arr[high];
		arr[high]=temp;
		return j;
		
	}
	
	
}