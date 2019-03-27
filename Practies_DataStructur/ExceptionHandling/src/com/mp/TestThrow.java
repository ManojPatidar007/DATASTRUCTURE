package com.mp;

import java.sql.SQLException;
import java.util.Random;

/**
 * @author Manoj
 *
 */
public class TestThrow {
	/* static void validate(int age){  
	     if(age<18)  
	      throw new ArithmeticException("not valid");  
	    
	   }  
	   public static void main(String args[]){  
	      validate(13);  
	      System.out.println("rest of the code...");  
	  }  
	*/public static void main(String ad[]){
		
		Random rm=new Random();
		int age=rm.nextInt(65);
		
		TestThrow t=new TestThrow();
		try{
		t.validate(age);}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("ram="+age);
	}
	public void validate(int age){
		validate1(age);
		System.out.println("ram="+age);
	}
	public void validate1(int age){
		if( age<40){
			
				throw new ArithmeticException("age must be low");
			
		}
	}
}
