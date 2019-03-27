package com.mp.group;

public class Test {
	public static void main(String ar[]){
		
		ThreadGroup t1=new ThreadGroup("first group");
		ThreadGroupCheck ts= new ThreadGroupCheck(t1);
		ts.start();
	}

}
