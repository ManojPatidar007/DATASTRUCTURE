package com.mp;

public class Employee {

	public int id;
	public String name;
	public String group;
	public int marks;
	public Employee(int id, String name, String group, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", group=" + group + "]";
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
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
}
