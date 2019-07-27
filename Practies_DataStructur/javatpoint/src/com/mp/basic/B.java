package com.mp.basic;

import java.io.IOException;

public class B implements A {

	@Override
	public void showA() {
		System.out.println("Show A called");
		
	}
	@Override
	public void showM() {
		System.out.println("Show m called inside b");
		throw new ArrayIndexOutOfBoundsException();
		
	}
  public void showB() throws Exception{
	   System.out.println("Show b called inside b");
   }
  private void showd(){
	   System.out.println("Show b called inside b");
  }
}
