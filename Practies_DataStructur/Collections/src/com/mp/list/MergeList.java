import java.util.*;
public class MergeList{
	public static void main(String ar[]){
		List<Integer> a1=new LinkedList<Integer>();
		List<Integer> a2=new LinkedList<Integer>();
		a1.add(2);
		a1.add(3);
		a1.add(6);
		a1.add(9);
		a2.add(1);
		a2.add(4);
		a2.add(5);
		a2.add(6);
		a2.add(7);
		a2.add(8);
		merge(a1,a2);
		
	}
	public static void merge(List<Integer> a1,List<Integer> a2){
		/*Iterator b1=a1.iterator();
		Iterator b2=a2.iterator();
		while(b1.hasNext()&&b2.hasNext()){
			int i=(int)b1.next();
			int j=(int)b2.next();
			if(i==3){
				a1.add(9);
			}
			
		not possible because traversing and appending with other object will give conncurentmodification exception	
		}*/
		
		for(int a:a1){
			if(a==3)
				a1.remove(1);
		}
		//System.out.print(a1);
		
	};
	
}