package com.mp;

import java.util.Random;

public class RendomeImpl extends AbstractImpl implements Cloneable {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int i=(int)(Math.random()*50+1);
		System.out.println(i);
		Random rm=new Random();
		int k=rm.nextInt(30);
		AbstractImpl an=new RendomeImpl();
		RendomeImpl an1=new RendomeImpl();
		RendomeImpl an2=(RendomeImpl) an1.clone();
		an.hello();
		
	Object a=new Object();
	an1.heaao();
	//Object b=a.clone();
		//an.dayaa=20;
	}
	
	public native void heaao();
	

}
