package com.mp;

public class Singleton {
	private static  Singleton si=null;
	String s;
	private Singleton(){
		s="hello ";
	}
	public static  Singleton getInstance(){
		if(si==null){
			si=new Singleton();
		}
		return si;
	}

}
