package com.mp;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private int no;
	private String col;
	@Autowired	
	private Engine eng;
	private AltoAutowire altoAutowire;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCol() {
		return col;
	}

	public void setCol(String col) {
		this.col = col;
	}

	public String toString() {
		return "No= " + no + " col= " + col+" model="+eng.getModel()+" name="+getAltoAutowire().getName();
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	public AltoAutowire getAltoAutowire() {
		return altoAutowire;
	}

	public void setAltoAutowire(AltoAutowire altoAutowire) {
		this.altoAutowire = altoAutowire;
	}



	

}
