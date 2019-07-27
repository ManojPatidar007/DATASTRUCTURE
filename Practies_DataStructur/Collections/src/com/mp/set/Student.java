class Student implements Comparable<Student>{
	private int id;
	 private String name;
	public int getId(){
		return this.id;
	}
	public void setId(int id)
		{this.id=id;}
	public void setName(String name)
	{
	this.name=name;
	}

	public String getName(){
	return this.name;
	}	

	public Student(int id,String name){
	this.id=id;this.name=name;
	}
	public String toString(){
	return "id= "+this.id+ "name="+ this.name;
	}
	public int compareTo(Student s){
		if(this.id>s.id)
		return 1;
	else if(this.id<s.id)
		return -1;
	else return 0;
	}
}