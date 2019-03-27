package com.mp;

public class StaticTest {
	int i;
	
	public StaticTest(){
		//this(new StaticTest());
	};
	public StaticTest(StaticTest s){}
	 
public static void main(String ar[]){
	StaticTest t= new StaticTest();
	t.shows('a');
	t.show(t.i++);
}
private void shows(char c) {
	// TODO Auto-generated method stub
	
}
public static void show(int i){
	
	System.out.println("i="+ ++i);
}
public void shows(){
	System.out.println("i="+ ++i);
	show(i);
	def();
	i++;
	char a='a';
}
public void def(){
	System.out.println("i="+ ++i);
}
{i=6;}
}
