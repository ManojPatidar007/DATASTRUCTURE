package com.mp.employee;

/**
 * @author mapa0716
 *
 */
public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	public Employee(int id,String name){
		this.id=id;
		this.name=name;
	};

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
		return this.id+" "+this.name;
	}
	
	public int compareTo(Employee e) {
		if(id<e.id){
			return -1;
		}
		else if(id>e.id){
			return 1;
		}
		else return 0;
	}

}
