package com.mp;

import java.util.Random;

/**
 * @author Manoj
 *
 */
public class Test {

	public static void main(String[] args) throws AgeException{
		Random rm=new Random();
		int age=rm.nextInt(165);
		System.out.println("ram="+age);
		Test t=new Test();
		try{
		t.validate(age);}
		catch(Exception e){
			e.printStackTrace();
		}
		Employee emp=new Employee(10,"hello",age);
		emp.setAge(40);
		Employee em=new Employee(10, "go", age);
		System.out.println(emp+" \n"+em);
		
	}

	private void validate(int age) throws Exception {
		validate1(age);		
	}
	private void validate1(int age) throws AgeException{
		if(age>60){
			throw new AgeException("age must be less then 60");
		}		
	}
	

}
