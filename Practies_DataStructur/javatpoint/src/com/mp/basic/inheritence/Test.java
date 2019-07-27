package com.mp.basic.inheritence;

import com.mp.basic.ScopeVariable;

public class Test extends ScopeVariable{
	




protected Test() {
	
		super(10);
		// TODO Auto-generated constructor stub
	}

public static void main(String ar[]){
	NonAbstract ab=new NonAbstract();
	String name=ab.name;
	String lastname=ab.lastname;
	//ScopeVariable asb=new ScopeVariable();
	
}
}
