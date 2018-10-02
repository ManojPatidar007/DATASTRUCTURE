package com.mp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Test {
	public static void main(int ar[]){
		
	}
	
	public  static void main(String ar[]){
		
Queue l=new LinkedList();
		QueImplArray imp=new QueImplArray();
		//Stack<Integer> stack = new Stack<Integer>();
		imp.deQueue();
		imp.enquque(1);
		imp.enquque(2);
		imp.enquque(3);
		imp.enquque(4);
		imp.enquque(5);
		imp.enquque(3);
		imp.deQueue();
		imp.deQueue();
		imp.enquque(3);
		imp.enquque(3);
		imp.show();
		int num=50;
		int count=0;
		//recursivefun(1);

		/*for(int i=2;i<=num;i++){

			count=0;

			for(int j=2;j<=i/2;j++){

				if(i%j==0){
					count++;
					break;
				}

			}

			if(count==0){

				System.out.println(i);

			}

		}*/
		
	}
	public static void recursivefun(int n) 
	{ 
	 
	  if(n <= 10) {
		  recursivefun(n+1);
	       System.out.println(n); 
	            }
	}
	int calc(){ // Error:This method must return a result of type int
        
		try {
		 if(true)
		return 1;
		 System.out.println("End of the method");
		} catch (Exception e) {
			return 0;
		}
		        
		 System.out.println("End of the method");
		 return 0;
		}
		    
	
		    //    TryCatchReturn obj = new TryCatchReturn();
		       
		 
		public void a(){
			synchronized(this){QueImpl imp=new QueImpl();}
		}
}


 