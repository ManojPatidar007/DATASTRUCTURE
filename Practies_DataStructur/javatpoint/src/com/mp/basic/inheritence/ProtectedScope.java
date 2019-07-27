package com.mp.basic.inheritence;

import com.mp.basic.ScopeVariable;

public class ProtectedScope extends ScopeVariable {
	String b="hello";

	protected ProtectedScope(int id) {
		super(10);
		// TODO Auto-generated constructor stub
	}
	 ProtectedScope(String id,int j) {
		super("hello");
		// TODO Auto-generated constructor stub
	}

public static void main(String ar[]){
	ProtectedScope p=new ProtectedScope(10);
}
	
}
