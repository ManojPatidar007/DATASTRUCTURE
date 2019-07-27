import java.util.*;
class TreeMapImpl{

public static void main(String ar[]){
	Student s=new Student(101,"jit");
	Student s1=new Student(100,"ajay");
	Student s2=new Student(102,"rah");
	Student s3=new Student(99,"moan");
	Student s4=new Student(98,"shan");
	//Student a=new Student(); this will give you error because you don't have default cons
	TreeSet<Student> t=new TreeSet<Student>();
	t.add(s);
	t.add(s1);
	t.add(s2);
	t.add(s3);
	t.add(s4);
	System.out.println(t);
	
}}
class Student implements Comparable<Student>{
private int id;
private String name;
public Student(int id,String name){
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
public int compareTo(Student s){
	if(this.id>s.id){
		return 1;
	}
	else if (this.id<s.id){
		return -1;
	}
	else return 0;
}

}