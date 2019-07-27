package com.mp;

public class ExceptionThrow {
	public static void main(String ar[]){
		try {
			show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void show() throws Exception {
		throw new Exception();
		
	}

}
