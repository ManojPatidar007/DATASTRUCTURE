package com.mp;

 public class Employee {//outer class is either public or default
	 //if default then can not access from other package
	private int id;
	protected String name;
	String dep;
	public int code;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void showid(){
		System.out.println("id="+this.id);
	}
	private void showName(){
		System.out.println("name="+this.name);
	}

}
