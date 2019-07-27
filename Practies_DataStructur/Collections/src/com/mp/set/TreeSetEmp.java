import java.util.*;
class TreeSetEmp{
	public static void main(String ar[]){
		Student s1=new Student(101,"mohan");
		Student s2=new Student(101,"mohan");
		Student s3=new Student(101,"mohan");
		TreeSet<Student> ts=new TreeSet();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		System.out.print(ts);
		
	}
}