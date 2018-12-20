package com.mp.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mp.employee.Employee;

/**
 * @author mapa0716
 * 
 */
public class ArrayLists {
	public static void main(String ar[]) {
		ArrayList<List> al = new ArrayList();
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee e=new Employee(101,"hello");
		Employee e2=new Employee(102,"hello1");
		Employee e3=new Employee(103,"hello2");
		Employee e4=new Employee(104,"hello3");
		Employee e5=null;
		list.add(e);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e5);
		al.add(list);
		System.out.println(list.hashCode());
		//Iterator ir=list.iterator();
		for(Employee b:list){
			System.out.println(b);
		}
		System.out.println("after");
		
		for(List<ArrayList> l:al){
			Iterator ir=l.iterator();
			while(ir.hasNext()){
			Employee q=(Employee)ir.next();	
			System.out.println(q);
			}
		}
		for(List<ArrayList> l:al){
			System.out.println(l.hashCode());
			/*for(Employee c: l.){//will not work even if both return same hashCode. we required explicit casting
			System.out.println(c);
			}*/
			for(Object o : l){
				System.out.println(o instanceof Employee);
				Employee a2 = (Employee)o;
				System.out.println(a2);
			}
     	}
	}
}
