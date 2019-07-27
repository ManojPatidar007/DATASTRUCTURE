package cm.mp.test;

import cm.mp.Test1;

public class SubClass extends Test1{
	public void show(){
	Test1 t=new Test1();
	t.getId();
	int i=t.code;
	//String s=t.dep;
	//String name=t.name;
	t.showid();
	SubClass s=new SubClass();
	s.showName();
	s.showid();
	//t.show1();
	
	//int id=t.id; private not visible

}
}