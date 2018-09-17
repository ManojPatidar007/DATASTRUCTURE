package com.mp;

public class StackImpl {
	private int intStack[];
	private int top;
	private int size;
	public StackImpl(){
		top=-1;
		size=50;
		intStack=new int[size];

	}
	public boolean push(int item){
		if(!isFull()){
			top++;
			intStack[top]=item;
			return true;}
		else{
			return false;
		}
	}
	private boolean isFull(){
		return (top==size-1);
	}
	public int pop(){

		return (intStack[top--]);
	}
	private boolean isEmpty(){
		
		return top<0;
	}

}
