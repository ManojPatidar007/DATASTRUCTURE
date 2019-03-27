package com.mp.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.mp.employee.Employee;

/**
 * @author mapa0716
 *
 */
public class HashSets {
	public static void main(String ar[]){
		  List<String> syncList = Collections.synchronizedList(new ArrayList<String>());//all collection are not synchronized but we can make them as synchronized

		HashSet<HashSet> al = new HashSet();
		List<Set> li=new LinkedList();
		///System.out.println("length="+al.size()+"  capacity="+al.getCapacoty());
		HashSet<Employee> list = new HashSet<Employee>();
		Employee e=new Employee(101,"hello");
		Employee e2=new Employee(102,"hello1");
		Employee e3=new Employee(103,"hello2");
		Employee e4=new Employee(104,"hello3");
		Employee e5=null;
		list.add(e);
		list.add(e2);
		list.add(e3);//not maintain insertion order
		list.add(e5);//null allowed once
	//	list.add(e5);//duplicate not allowed
		//list.add(e4);
		list.add(e4);
		al.add(list);
		li.add(list);
		
		for(Employee s:list){
			System.out.println(s);
		}
		for(Set s:li){
			System.out.println("After inside");
			for(Object a:s){
				Employee a1=(Employee)a;
				System.out.println(a1);
			}
		}
	}

}
