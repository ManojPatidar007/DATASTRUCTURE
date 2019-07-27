package com.test;

import cm.mp.Test1;

public class SubClass extends Test1{
	public void show(){
	Test1 t=new Test1();
	t.getId();
	int i=t.code;
	//String s=t.dep;
	//String name=t.name;
	SubClass s=new SubClass();
	t.showid();
	s.showName();
	//s.show1();
	
	//int id=t.id; private not visible

}
}