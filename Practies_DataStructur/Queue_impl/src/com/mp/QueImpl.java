package com.mp;

public class QueImpl {
	private int total;
	private int size;
	private int arrq[];
	private int rare;
	private int front;
	public QueImpl(){
		total=0;
		size=100;
		rare=0;
		front=0;
		arrq=new int[size];
	}
	public QueImpl(int size){
		total=0;
		this.size=100;
		rare=0;
		front=0;
		arrq=new int[this.size];
	}
	
	public boolean enquque(int item){
		if(isFull()){
			return false;
		}else{
			total++;
			arrq[rare]=item;
			rare=(rare+1)%size;
			return true;
			
		}
		
	}
	public int deQueue(){
		total--;
		int item=arrq[front];
		front++;
		return item;
	}
	private boolean isFull(){
		return total==size;
	}
	public void show(){
		int f=front;
		for (int i=0;i<total;i++)
		{
			System.out.println(arrq[f++]);
			//f++;
		}
		
	}
}
