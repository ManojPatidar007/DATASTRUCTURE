package com.mp;

public class InstanceOfTest extends Animal{
	 int data=50;  
	  
	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 } 

	public void go(){
		System.out.println("hello11");
	}
	static void method(Animal a) {
		if(a instanceof Animal ){
			Animal d=a;//downcasting
			d.go();
			System.out.println("ok downcasting performed");
		}
	}

	public static void main (String [] args) {
		InstanceOfTest a=new InstanceOfTest();
		a.go();
		InstanceOfTest.method(a);
		char[] ch={'j','a','v','a','t','p','o','i','n','t'}; 
		int d[]={2,4,5};
		String s=new String(ch);  
		System.out.println(ch);
		System.out.println(d);
		System.out.println(s);
		 System.out.println("before change "+a.data);  
		   a.change(500);  
		   System.out.println("after change "+a.data);  
		  
		 }  
	}
	


class Animal {
	public void go(){
		System.out.println("hello");}
}

