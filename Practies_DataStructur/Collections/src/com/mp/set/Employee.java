class Employee{
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

public Employee(int id,String name){
	this.id=id;this.name=name;
}
public String toString(){
	return "id= "+this.id+ "name="+ this.name;
}
@Override//ot required
public int hashCode(){
	System.out.println("hash call");
	return this.id;
}
/*//this is comparable example
public int equals(Employee e){
	if(this.id==e.id)
		return 0;
	else if(this.id>e.id){
	return 1;}
		else return -1;
	
	
}*/
@Override
public boolean equals(Object e){
	System.out.println("equals call");
	if(this==e)
		return true;
	Employee e1=(Employee)e;
	return this.id==e1.id;
}
}