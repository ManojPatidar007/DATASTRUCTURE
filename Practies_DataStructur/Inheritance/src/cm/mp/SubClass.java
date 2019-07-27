package cm.mp;
//note if inside other package if class is child class then you can access proterted and public data
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
	s.show1();
	
	//int id=t.id; private not visible

}
}