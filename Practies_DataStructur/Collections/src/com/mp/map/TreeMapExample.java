import java.util.*;
class TreeMapExample{
	public static void main(String a[])
	{
		TreeMap<Employee,Integer> tm=new TreeMap();
		Employee e=new Employee(101,"jti");
		Employee e1=new Employee(100,"jti");
		Employee e2=new Employee(98,"jti");
		Employee e3=new Employee(102,"jti");
		tm.put(e,10);
		tm.put(e1,103);
		tm.put(e3,102);
		tm.put(e2,104);
		Iterator<Map.Entry<Employee,Integer>> ir=tm.entrySet().iterator();
		while(ir.hasNext()){
			Map.Entry<Employee,Integer> m=ir.next();
			System.out.println(m.getKey());
		}
	}	
}
class Employee implements Comparable<Employee>{
	private int id;
private String name;
public Employee(int id,String name){
	this.id=id;
	this.name=name;
	
}
public int getId(){
	return this.id;
}	
public String getName(){
	return this.name;
}
public String toString(){
	return "id= "+ this.id+" name= "+this.name;
}
public int compareTo(Employee s){
	if(this.id>s.id){
		return 1;
	}
	else if (this.id<s.id){
		return -1;
	}
	else return 0;
}

	
}