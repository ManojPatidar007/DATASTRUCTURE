package com.mp;
public class RotateArray{
	
	public static void main(String ar[]){
		RotateArray r=new RotateArray();
		int arr[]={1,2,3,4,5,6,7,8};
		r.rotate(arr,2);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	private void rotate(int arr[],int j){
		rotate(arr,0,j-1);
		rotate(arr,j,arr.length-1);
		rotate(arr,0,arr.length-1);
	}
	private void rotate(int arr[],int i,int j){
		while(i<j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
} 