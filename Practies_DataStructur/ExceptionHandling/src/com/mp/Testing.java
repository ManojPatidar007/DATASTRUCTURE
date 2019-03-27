package com.mp;

public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmpException e=new EmpException(null);
		int ar[]={4,5,5,6,9,4,7,6};
		Testing t=new Testing();
		t.solve(ar);

	}
	public void solve(int ar[]){
		int a=2;
		try{
		 a=ar[1];
		 System.out.println(a/2);
		 {System.out.println("uoo1");}}
		catch(Exception e){
			
			e.printStackTrace();
			try{
			System.out.println(a/0);}
			catch(Exception d){
				d.printStackTrace();
			}
			finally{
			System.out.println("uoo");}
		}
		finally{
			System.out.println("uoo4");}
		System.out.println(a/2);
		try{
			 System.out.println(a/0);
		}finally{
			System.out.println("uoo6");}
		
	System.out.println("uoo7");
	}

}
