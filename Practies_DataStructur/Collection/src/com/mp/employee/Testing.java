package com.mp.employee;

public class Testing {
	int i=2;String s="ji";
	
	public static void main(String ar[]){
		
		Testing t=new Testing();
		
		t.show();
	}
	public void show(){
		Testing t=new Testing();
		//int i=6;String s="hello";
		t.show(i,s);
		System.out.println(i+this.s);
	}
	public void show(int i,String s){
		
		i=i++;
		this.s="good";
	}
}
