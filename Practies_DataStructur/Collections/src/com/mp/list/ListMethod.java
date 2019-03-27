package com.mp.list;

import java.util.*;

public class ListMethod {

	public static void main(String[] args) {		
		List<Integer> a2=null;
		a2.add(3);
		List<Integer> al=new LinkedList<Integer>();
		al.add(3);
		al.add(13);
		al.add(33);
		al.add(53);
		al.add(23);
		al.add(73);
		al.add(43);
		for(int i:al){
			System.out.print(i+" ");
		}
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println(al);
	List<Character> cr=new ArrayList<Character>();
	cr.add('w');
	cr.add('e');
	cr.add('d');
	cr.add('d');
	cr.add('h');
	cr.set(2,'o');
	cr.add(null);
	cr.add(null);
	cr.add(null);
	for(int i=0;i<cr.size();i++){
		System.out.println(cr.get(i));
	}
	System.out.println(cr);
	Object c[]=cr.toArray();
	Collection c1=Arrays.asList();
	List c2=Arrays.asList();//list can convert direct
	Set s1= new HashSet(c1);//set can not convert direct

	}

}
