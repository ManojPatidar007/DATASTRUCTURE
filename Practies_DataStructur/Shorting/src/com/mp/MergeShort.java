package com.mp;

 class MergeShort {
	public void  mShort(int arr[]){
		int i=arr.length;
		margeShort(arr,0,i-1);
	};
	private void  margeShort(int arr[],int l,int r){
		if(l<r){
			int m=(l+r)/2;
			margeShort(arr,l,m);
            margeShort(arr,m+1,r);
			mShort(arr,l,m,r);
			}
		
	}
	private void mShort(int arr[],int l,int m,int r){
		int i=m-l+1;
		int j=r-m;
		int le[]=new int[i];
		int ri[]=new int[j];
        for(int k=0;k<i;k++){
		le[k]=arr[l+k];
		
		}
		for(int k=0;k<j;k++){
			ri[k]=arr[m+1+k];
		}
		int a=0,b=0;
		int k=l;
		while(a<i&&b<j){
		if(le[a]<=ri[b]){
			arr[k]=le[a] ;
			a++;
			}
			else{
				arr[k]=ri[b];
				b++;
			}
			k++;
		}
		if(a<i){
			arr[k]=le[a++];
			k++;
		}
		if(b<j){
			arr[k]=ri[b++];
			k++;
		}
		}
		 
		
}
