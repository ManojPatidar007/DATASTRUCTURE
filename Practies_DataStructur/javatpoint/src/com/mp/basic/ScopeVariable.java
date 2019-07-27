package com.mp.basic;

public class ScopeVariable {
	static int v=10;
	 int id;
	int id1=10;
	 ScopeVariable(){
		 System.out.println("hello jioooooo");
	 }
	 public ScopeVariable(int id){}
	 protected ScopeVariable(String id){}
	
	public static void main(String ar[]){
		int k=10;
		int id=20;
		 ScopeVariable s=new ScopeVariable();
		s.show(id);
	}
	private void show(int id) {
		System.out.println("inside shoe id="+this.id);
		int id1=30;
		// ScopeVariable s=new ScopeVariable();
		hello(id1);
		
	}
	private void hello(int id1) {
		System.out.println("inside hello id="+id1);
		System.out.println("inside hello id="+this.id1);
		int i=10;
		
		hello1(i);
		System.out.println("inside hello i="+i);
		
	}
	private void hello1(int i) {
		i++;
	}
}
