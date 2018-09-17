package com.mp;

 class Trest {
	 private transient int trans_var; 
	 private void shoe(){
		  int trans_var; 
	 }
	public static void main(String args[]){
		Singleton s=Singleton.getInstance();
		System.out.println(s.s);
		
	}

}
