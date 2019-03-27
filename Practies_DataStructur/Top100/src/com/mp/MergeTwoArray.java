package com.mp;

public class MergeTwoArray {

	public static void main(String ar[]){

		int arr[]={2,2,6};
		int brr[]=new int[7];
		brr[0]=3;
		brr[1]=5;
		brr[2]=8;
		brr[3]=9;
		merge(arr,brr);
	}

	public static void merge(int arr[],int brr[]){
		int j=arr.length-1,k=brr.length-j-2;
		System.out.println(k+"v"+j);
		for(int i=brr.length-1;i>=0;i--){
			if(j>=0&&k>=0){
				if(arr[j]>brr[k]){
					brr[i]=arr[j];
					j--;
				}
				else if(arr[j]<brr[k]){
					brr[i]=brr[k];
					k--;
				}

			}
		}
		System.out.println("j="+j+" k="+k);
		if(!(j<0)){
			for(int i=0;i<=j;i++){
				brr[i]=arr[i];
			}
		}

		for(int m=0;m<brr.length;m++){
			System.out.println(brr[m]);
		}

	}


}
