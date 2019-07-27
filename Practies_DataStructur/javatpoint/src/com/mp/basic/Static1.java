//non static thing will not accept static method.
//because static belongs to class and it is on the top of all.
//non static things belongs to instance of a class.
//only static method can call with class name.
//through class-name you can call class level things like static variable, static method.
 
class Static1{
	static void show(int i){
		Static1 s=new Static1();
		s.nonStatic3();//will work
	//	Static1.nonStatic3();//will not work
	//nonStatic3();will not work
		
		System.out.println("inside stativ method i= "+i);
	} 
public static void main(String ar[]){
	show(1);//will call show mwthod
	Static1 s=new Static1();
	show(2);//will call show method
	Static1.show(3);//will call show method
	//means  you can call static method by object, directly, or by class name inside static or inside normal method
	//you can call normal method directly inside other normal method only
	s.nonStatic();
}
public void nonStatic(){
	System.out.println("inside non-stativ method");
	this.show(10);//will work it behave like normal instance but this can be used inside normal method because this is a non static reference
	Static1 s=new Static1();
	s.nonStatic2();//will work
	this.nonStatic2();//will work // 
	
	nonStatic2();//will work
	//Static1.nonStatic2();//will not work
	//Static1.nonStatic2();// not work
}
public void nonStatic2(){
	System.out.println("inside non-static1 method");
	show(4);//will call show mwthod
	Static1 s=new Static1();
	s.show(5);//will call show method
	Static1.show(6);//will call show method
	//Static1.nonStatic3();//will not work
	
}
public void nonStatic3(){
	System.out.println("inside non-static1 method333333");
}
}