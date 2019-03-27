package com.mp;

public class StringExample{  
	public static void main(String args[]){  
		String s1="java";//creating string by java string literal 
		String s4="java";
		String s6=new String("java");
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);//converting char array to string  
		String s3=new String("example");//creating java string by new keyword  
		String s5=new String("example");
		System.out.println(s1.hashCode());  
		System.out.println(s6.hashCode());  
		System.out.println(s6==s1);
		System.out.println(s3.hashCode());  
		String s=40+40+"";  
		//s.append("d");
		   System.out.println(s);
		   StringBuffer sb=new StringBuffer("Hello ");  
		   System.out.println(sb.hashCode());
		   sb.append("Java");//now original string is changed  
		   System.out.println(sb.hashCode());//prints Hello Java  
	}
}