package com.mp;
//if you have paramaterized cons and dont have default then if you try to create object using no arg then it will 
//give error, but if you create with arg then it will not give error
public class DaeaultCons {

	public static void main(String[] args) {
		Abc a=new Abc(5);
	}

}
class Abc{
	public Abc(int i){
		//this(); even you can not call default expleceteluy
		System.out.println("hello");
	}

	
}
