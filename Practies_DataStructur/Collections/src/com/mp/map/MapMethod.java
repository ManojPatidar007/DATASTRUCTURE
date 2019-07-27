
	
import java.util.*;

 class MapMethod {
	public static void main(String ar[]){
		Map<Integer,String> map=new HashMap();
		map.put(10,"hello");
		
		
		for(Map.Entry<Integer,String> e:map.entrySet()){
			System.out.println(e.getKey());
		}
		
	}

}
