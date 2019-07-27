package com.mp.basic.inheritence;

public  class TestConstructer extends Abc {
	public TestConstructer(int data) {
		super("hello");
		System.out.println("test cllled");
	}
	//public TestConstructer(){}//this one also required constrtructer
	public static void main(String ar[]){
		Abc a=new TestConstructer(10);
	}

}
abstract class  Abc{
	int _a=10;
	//public Abc(){}
	Abc(String s){
		System.out.println("Abc cllled");
		String a="Hello";
	}
};
