package com.mp.emp;

public class Employee {
	private int id;
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public String toString(){
		return "id="+id+" name="+name;
	}

}
