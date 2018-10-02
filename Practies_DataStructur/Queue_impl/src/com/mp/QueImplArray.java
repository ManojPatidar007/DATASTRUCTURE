package com.mp;

class QueImplArray {
	private int total;
	private int size;
	private int arrq[];
	private int rare;
	private int front;
	public QueImplArray(){
		total=0;
		size=5;
		rare=0;
		front=0;
		arrq=new int[size];
	}
	public QueImplArray(int size){
		total=0;
		this.size=size;
		rare=0;
		front=0;
		arrq=new int[this.size];
	}
	
	public boolean enquque(int item){
		if(isFull()){
			System.out.println("Queue is full");
			return false;
		}else{
			//System.out.println("total="+total);
			total++;
			arrq[rare]=item;
			rare=(rare+1)%size;
			return true;
			
		}
		
	}
	public int deQueue(){
		if(isEmpty()){
			System.out.println("queue is empty");
			return 0;
		}
		total--;
		int item=arrq[front];
		front++;
		return item;
	}
	private boolean isEmpty(){
			return total==0;
		}
	private boolean isFull(){
		return total==size;
	}
	public void show(){
		int f=front;
		for (int i=0;i<total;i++)
		{
			System.out.println(arrq[f]);
			f=(f+1)%size;
		}
		
	}
}
