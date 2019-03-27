package com.mp.set;

import java.util.LinkedHashSet;
import com.mp.employee.Employee;

/**
 * @author mapa0716
 * 
 */
public class LinkedHashSets {
	public static void main(String ar[]) {

		LinkedHashSet<LinkedHashSet> al = new LinkedHashSet();
		// /System.out.println("length="+al.size()+"  capacity="+al.getCapacoty());
		LinkedHashSet<Employee> list = new LinkedHashSet<Employee>();
		Employee e = new Employee(101, "hello");
		Employee e2 = new Employee(102, "hello1");
		Employee e3 = new Employee(103, "hello2");
		Employee e4 = new Employee(104, "hello3");
		Employee e5 = null;
		list.add(e);
		list.add(e2);
		list.add(e3);// maintain insertion order
		list.add(e5);// null allowed once
		// list.add(e5);//duplicate not allowed
		// list.add(e4);
		list.add(e4);
		al.add(list);

		for (Employee s : list) {
			System.out.println(s);
		}
	}

}
