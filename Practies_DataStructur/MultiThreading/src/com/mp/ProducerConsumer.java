package com.mp;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumer {
	private List queue = new LinkedList();
	private final int limit = 10;

	public synchronized void enqueue(Object i) throws InterruptedException{
		if(this.queue.size()==this.limit){
			this.wait();
		}
		if(this.queue.size()==0){
			notifyAll();
		}
		this.queue.add(i);

	}
	public synchronized void dequeue() throws InterruptedException{
		if(this.queue.size()==0){
			notifyAll();
			wait();
		}
		//if()
		
	}
}
