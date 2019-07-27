import java.util.*;
public class HashTableEmp{
	public static void main(String ar[]){
		Hashtable<Integer,Character> ht=new Hashtable();
		ht.put(101,'d');
		ht.put(102,'d');
		ht.put(101,'d');
		Set s=ht.entrySet();
		for(Map.Entry m:ht.entrySet()){
			System.out.println(m.getKey());
		}
		Iterator<Map.Entry<Integer,Character>> ir=ht.entrySet().iterator();
		while(ir.hasNext()){
			Map.Entry<Integer,Character> t=ir.next();
			System.out.println(t.getValue());
		}
	}
}