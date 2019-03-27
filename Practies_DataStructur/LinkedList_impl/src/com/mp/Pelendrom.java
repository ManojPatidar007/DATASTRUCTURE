package com.mp;

import java.util.*;

public class Pelendrom {

	public static void main(String ar[]){
		
		LinkedList<Character> cr=new LinkedList();
		cr.add('m');
		cr.add('a');
		cr.add('d');
		cr.add('a');
		cr.add('m');
		boolean b=check(cr);
		System.out.println(b);
		}

		public static boolean check(List<Character> ir){

		ListIterator<Character> lr=ir.listIterator();
		ListIterator<Character> br=ir.listIterator();
		while(lr.hasNext()){
		lr.next();
		}
		while (br.hasNext()){
		if(br.next()!=lr.previous()){
		return false;
		}
		
		}
		return true;


		}

		}
