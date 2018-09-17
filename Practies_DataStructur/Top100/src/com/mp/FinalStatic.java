package com.mp;

public class FinalStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Final f= new Final();

	}

}
class Final{
	private static  int a;
	static{a=10;}
	private  static void show(){
		 a=20;
	}
	Final(){
		//show();
	System.out.println(Math.random());
	}
	
}