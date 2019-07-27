package com.mp.basic;

import java.io.Serializable;

public class TransientKeyword{

	public static void main(String[] args) {
		

	}

}
class Employee  implements Serializable{
	
	int id;
	String name;
	transient String cls;//now it will not serialized
	 public Employee(int id, String name,String cls) {  
  this.id = id;  
  this.name = name;  
  this.cls=cls;  
 }  
}