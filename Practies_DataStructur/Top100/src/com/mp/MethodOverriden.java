package com.mp;

public class MethodOverriden {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	B b=new B();
	b.main(args);

	}

}
class A{
	Test t=new Test(){
		
	};
	A sum(int i){
		System.out.println("inside a");
		return null;
	}
}
class B extends A{

public static void main(String ar[]){
	System.out.println("inside MAIN");
}
	
	A sum(int i){
		System.out.println("inside b");
		return null;
	}
	
}
