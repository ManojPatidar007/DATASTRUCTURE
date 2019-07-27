package com.mp.basic;

public class OperatorImpl {
	public static void main(String ar[]){
		//unaryOperator();//++,--,!, ~
		//shift();//<<, >> ,>>>
		//relational();//<>, <=, >=, ==, !=
		//bitwise();//&,^,|
		//logical();//&&,||
		//ternary();//  ? :
		assignment();//=, +=, -+, *=, /=, %=, &=, ^=,|=, <<=, >>=, >>>=
	
	}

	private static void assignment() {
		int n=5;
		n+=5;
		System.out.println(n);
		short s=10;
		short d=20;
		s=(short) (s+d);//s+d=int so casting required
		s+=d;//no casting required
		System.out.println(s);
		int t=9;
		t=t^3;
		System.out.println(t);
		  int a = 5, b = 9; // a = 5(00000101), 
		  					 //b = 9(00001001) 
		  //System.out.println("a = %d, b = %d\n"+ a, b); 
		  System.out.println("a&b = %d\n"+(5&9)); // The result is 00000001 
		  System.out.println("a|b = %d\n"+(a|b));  // The result is 00001101 
		  System.out.println("a^b = %d\n"+(a^b)); // The result is 00001100 
		  System.out.println("b<<6="+( b<<6));  // The result is 0001001000000  
		  System.out.println("Math.pow(2, 6)*9="+ Math.pow(2, 6)*9);  // The result is 00000100  
		  System.out.println("b>>1 = %d\n"+ (b>>1));  // The result is 00000100  
		   
		
	}

	private static void ternary() {
		int a=10;  
		int b=5;  
		int min=(a<b)?a:b;  
		System.out.println(min); 
		// TODO Auto-generated method stub
		
	}

	private static void bitwise() {
		// TODO Auto-generated method stub
		
	}

	private static void logical() {
		//The logical && operator doesn't check second condition if first condition is false. It checks second condition only if first one is true.
		//The bitwise & operator always checks both conditions whether first condition is true or false.
		// The logical || operator doesn't check second condition if first condition is true. It checks second condition only if first one is false.
		//The bitwise | operator always checks both conditions whether first condition is true or false.
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b&&a<c);//false && true = false  
		System.out.println(a<b&a<c);//false & true = false  
		System.out.println(a<a&a<a);//false & false= false
		System.out.println(a==a&a==a);//true & true=true
		System.out.println(a>b&a>c);//false
		System.out.println(a<b&&a++<c);//false && true = false  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a<b&a++<c);//false && true = false  
		System.out.println(a);//11 because second condition is checked  
		
	}

	private static void relational() {
		// TODO Auto-generated method stub
		
	}

	private static void shift() {
		//left shift(*)
		System.out.println("10<<2=10*2^2=10*4=40 "+(10<<2));//10*2^2=10*4=40  
		System.out.println(12<<4);//12*2^4=12*16=96;
		//2^4= 2*2*2*2 means 2pow4
		// rigth shift(/)
		System.out.println(20>>3);//20/2^3=20/8=2  
		//
		  //For positive number, >> and >>> works same  
	    System.out.println(20>>2);  //5
	    System.out.println(20>>>2);  //5
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  //-5
	    System.out.println(-20>>>2);  //1073741819
		
	}

	private static void unaryOperator() {
		int a=4,b=6;
		//unary operator(++,--,!,~)
		System.out.println(a++ +"  "+ ++b);//a++ will print and then increment
		//++b will first increment and then print
		boolean v=true;
		System.out.println(!v);//will print false
		System.out.println(1000121212);
		//	int 1a=10; variable/class name can not start with int
		int q=5;  
		int w=-22;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~q);//-6 (minus of total positive value which starts from 0)  
		System.out.println(~w);//21 (positive of total minus, positive starts from 0) 
		
	}

}
