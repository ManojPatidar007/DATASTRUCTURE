package com.mp;

public class CommonElm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[]={2,4,6,7,9,12,14};
		int ars[]={1,2,6,8,9,11,14};
		System.out.println("Common element are:");
		CommonElm c=new CommonElm();
		c.findComm(arr,ars);

	}

	private void findComm(int[] arr, int[] ars) {
		int i=0;int j=0;
		while (i<arr.length&&j<ars.length){

			if(arr[i]==ars[j]){
				System.out.println(arr[i]);
				i++;j++;
			}
			else if(arr[i]<arr[j]){
				i++;
			}
			else
				j++;
		}

	}

}
