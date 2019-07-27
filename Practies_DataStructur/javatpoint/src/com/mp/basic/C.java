package com.mp.basic;

public class C extends B {
	public static void main(String ar[]) throws Exception{
		A a=new C();
		B b2=(B)a;
		a.showA();
		try{
		a.showM();}
		catch(Exception e){}
		((C) a).showB();// A class don't know about B & C method
		((C) a).showC();//so we required casting
		A a1=new B();
		System.out.println("a1=========================");
		a1.showA();
		((B) a1).showB();
		//((C) a1).showB();casting can be done through object type .
		//not on the basis of reference(variable) type
		//child class object can be cast to any of it's parent
		//but vice versa not true
		//((C) a1).showC();
		B b=new B();//through this you can call b class method and 
		C c=new C();
		try{
		C c1=(C)b;//parent can't case to child//it will through classcastexception
		System.out.println("indside truy catch");
		c1.showe();
		System.out.println("indside truy catch");
		}catch(Exception e){
			e.printStackTrace();
		}
		B b1=c;//but from child to parent no casting required//this will call only which can visibale to class B
		
		b1.showA();
		
		System.out.println("c=========================");
		c.showA();
		c.showB();
		 c.showC();
		c.showM();
		 B b3=new C();
		 //b3.showd();
	}
	
	public void showA() {
		System.out.println("Show A called inside c");
		
	}
	@Override
   public void showB()throws ArrayIndexOutOfBoundsException{
	   System.out.println("Show b called inside c");
	  // return 1;
   }
   public void showC(){
	   System.out.println("Show c called inside c");
   }
   
  
   
    public void showd(){
	   System.out.println("Show b called inside b");
  }
    public void showe(){
 	   System.out.println("Show b called inside b");
   }
}
