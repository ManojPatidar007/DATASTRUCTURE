import java.util.*;
public class HashSetEmp{
	public static void main(String ar[]){
		Employee e1=new Employee(10,"jit");
		Employee e2=new Employee(10,"jit");
		Employee e3=new Employee(10,"jit");
		
		Set<Employee> s=new HashSet<Employee>();
		s.add(e1);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		System.out.println(s);
		LinkedList<Integer> l=new LinkedList<Integer>();
		Set s1=new HashSet(l);
		
	}
}