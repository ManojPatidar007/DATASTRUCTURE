package com.mp.basic.casting;

public class TestAnimal extends Hource{
	
	public static void main(String ar[]){
		Animal am=new Hource();
		am.printColor();//hource color is red inside hource
		if(am instanceof 	Animal)//child object is instance of parent
		System.out.println("am is instance of Animal=");
		((Hource)am).printName();//without cast you can not call
		//because am don't know hource class method.
		//so through casting it will call all hource method
		
		Animal pm=new TestAnimal();
		if(pm instanceof Hource){
			System.out.println("pm is instance of hource=");
		}
		//pm.printColor();//will work
		((Hource)pm).printName();//if pm is instance then casting is possible
		TestAnimal tm=new TestAnimal();
		if(tm instanceof Hource&& tm instanceof Animal){
			System.out.println("pm is instance of hource and animal");
		}
		tm.printColor();
		tm.printName();
		Hource hm=tm;//upcast done implecetely
		hm.printColor();
		((Hource)tm).printColor();//will  work
		//casting can be done with reference type of classes come in-between object and reference
		Hource h=new Hource();
		//TestAnimal mm=(TestAnimal)h;//compile but give run time calsscastexception
		Animal ha=new TestAnimal();
		Hource na=(Hource) ha;//downcast
		TestAnimal oo=(TestAnimal) ha;//downcast done explecetely
		
	}
	public void printColor(){
		System.out.println("color is black in testing class");
	}

}
