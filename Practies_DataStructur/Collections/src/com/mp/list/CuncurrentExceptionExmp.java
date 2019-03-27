import java.util.*;
class CuncurrentExceptionExmp{
	
	public static void main(String ar[]) throws Exception{
		
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(10);
		ls.add(13);
		ls.add(12);
		ls.add(15);
		ls.add(14);
		ls.add(18);
		Iterator ir=ls.iterator();
		while(ir.hasNext()){
			int a=(int)ir.next();
			if(a==12){
				//ls.remove(2);
				ir.remove();
			}
			
		}
		System.out.println(ls);
		Integer ba[]=new Integer[ls.size()];
		Integer na[]=new Integer[ls.size()];
		ba=ls.toArray(new Integer[ls.size()]);
	//	int z[]=ls.toArray(new int[ls.size()]);//type must be object, not premitive type
		Object ob[]=new Object[ls.size()];
		ob=ls.toArray();
		for(int i=0;i<ls.size();i++){
			System.out.println(ba[i]);
		}  
		int i=0;
		int ca[]=new int[ls.size()];
		for(Integer a:ba)
		 ca[i++]=a;
		int[] array = ls.stream().mapToInt(j->j*j).toArray();
		List v=Arrays.asList(2,4,3,1,'d');
		System.out.println(v);
		
		
	}
}