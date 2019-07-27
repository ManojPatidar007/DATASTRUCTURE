package com.mp;

public class EmploeeData {

	public void showData(Employee e){
		System.out.println(e);
	}
	public char showRank(Employee e){
		int i=e.getMarks();
		char c;
		if(i<33){
			c='d';
		}
		else if(i<70&&i>=33){
			c='b';
		}
		else
			c='a';
		return c;
	}

}
