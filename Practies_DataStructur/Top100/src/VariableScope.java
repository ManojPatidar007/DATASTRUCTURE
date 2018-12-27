
public class VariableScope {
	int i=10;
	public void show(int j){
		System.out.println("inside shoe="+j++);
	}
	
	
	public static void main(String[] args) {
		VariableScope v=new VariableScope();
		v.scope();
		
		System.out.println();
	}
	public void scope(){
		VariableScope v=new VariableScope();
		VariableScope v1=v;
		v1.i=20;
		System.out.println(v1.i);
		v1.show(i);
		System.out.println(this.i);
		
		try{
			int i=1/1;
			System.exit(0);
		}
		finally{
			System.out.println("inside finel");
		}
	}

}
