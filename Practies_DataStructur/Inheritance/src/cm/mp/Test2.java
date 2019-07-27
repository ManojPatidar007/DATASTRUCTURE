package cm.mp;

public class Test2 extends Test1{
	public void show(){
		Test1 t=new Test1();
		t.getId();
		int i=t.code;
		String s=t.dep;
		String name=t.name;
		t.show1();
		t.showName();
		t.showid();
		Test2 t2=new Test2();
		t.getId();
		int i2=t2.code;
		String s2=t2.dep;
		String name2=t2.name;
		t2.show1();
		t2.showName();
		t2.showid();
		
		//int id=t.id; private not visible
	}

}
