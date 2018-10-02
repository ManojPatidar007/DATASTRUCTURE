package com.mp;
public class DuplicateChar{
public static void main(String ae[]){
	String ar="avbnsxacnsas";
	DuplicateChar c=new DuplicateChar();
	String s=c.rempveDup(ar);
	
	System.out.println(s);
}
private String rempveDup(String ar){
	int len=ar.length();
	String a="";
	int arr[]=new int[200];
	
	for (int i=0;i<len;i++){
		int c=ar.charAt(i);
		
		if(arr[c]==0){
			arr[c]=1;
			a=a+ar.charAt(i);
			
		}
	} 
	return a;
	
	
}
}