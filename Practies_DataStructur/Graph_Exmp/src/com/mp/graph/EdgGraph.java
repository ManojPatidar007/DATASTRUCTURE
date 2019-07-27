package graph;
import java.util.*;
public class EdgGraph{
	int v;
	LinkedList<Integer> list[];
	public EdgGraph(int j){
		this.v=j;
		list=new LinkedList[v];
		for(int i=0;i<v;i++){
			list[i]=new LinkedList();
		}
	}
	public void addAdge(int st,int ds){
		this.list[st].add(ds);
		this.list[ds].add(st);
		
	}
	 public void printGraph() 
    {        
        for(int i = 0; i< this.v; i++) 
        { 
            System.out.println("Adjacency list of vertex "+ i); 
            System.out.print("head"); 
            for(Integer pCrawl: this.list[i]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n"); 
        } 
    } 
     
	
}
