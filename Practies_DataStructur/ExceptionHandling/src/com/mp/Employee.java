package com.mp;

/**
 * @author Manoj
 *
 */
public class Employee {
	private int id;
	private String name;
	private int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return "id="+id+" name="+name+" age="+age;
	} 
	public boolean equals(Object o){
		if(o instanceof Employee &&(this.id==((Employee)o).getId())){
			return true;
		}
		return false;
	}
	
	public int hashCode(){
		
		return this.getAge();
	}

}
