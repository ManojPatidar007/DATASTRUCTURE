package com.mp;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImmutableEmp t=new ImmutableEmp(5);
		ImmutableEmp d=new ImmutableEmp(5);
		System.out.println(t.hashCode());
		System.out.println(d.hashCode());
	}
	

}
