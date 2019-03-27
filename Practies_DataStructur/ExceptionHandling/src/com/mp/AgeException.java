package com.mp;

/**
 * @author Manoj
 *
 */
public class AgeException extends Exception{
	
	AgeException(String msg){
		super(msg);
		System.out.println(""+msg);
		
	}

}
