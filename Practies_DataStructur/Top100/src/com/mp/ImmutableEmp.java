package com.mp;

final class ImmutableEmp  {
	private final int id;
	public ImmutableEmp(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public String toString(){
		return "id="+id;
	}
	public int compareTo(ImmutableEmp o){
		if (this.id==o.id){
			return 0;
		}
		else if (this.id>o.id){
			return -1;
		}
		else return 1;
		}
	
}
