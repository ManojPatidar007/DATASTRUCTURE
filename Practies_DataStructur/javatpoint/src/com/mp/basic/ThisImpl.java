/* 1 this can be used to refer current class instance variable.
2 this can be used to invoke current class method (implicitly)
3 this() can be used to invoke current class constructor.
4 this can be passed as an argument in the method call.
5 this can be passed as argument in the constructor call.
6 this can be used to return the current class instance from the method.*/

//one constructor can call other by new keyword also. means you can call paramaterized constructor from default and vise versa
//even you can call normal or static method
//paramaterized cons will not call default cons return by programmer implicitly.
class ThisImpl{
	int id;
	public static void show(){
		System.out.println("insight static");
	}
	public void sum(ThisImpl as){
		System.out.println("insight sum");
	}
	public void dum(){
		System.out.println("insight dum");
		this.sum(this);//this can be used to invoke current class method (implicitly)
		
	}
	ThisImpl() throws Exception{
		
		try{
			int i=10/0;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{}
		System.out.println("hello");
		ThisImpl a=new ThisImpl(10);//this will work fine and will 
		//ThisImpl b=new ThisImpl();//this will work fine but will in infinight loop because it is like recaursion
		this.dum();
		show();
		System.out.println("insight without argu cons "+this.id);
		this.id=id;//this can be used to refer current class instance variable
	}
	ThisImpl(int i)throws Exception{
	
		//this();//this() can be used to invoke current class constructor. will work. if we not call explectely then our will not call
			//ThisImpl a=new ThisImpl();//will work  will call our default cons
		System.out.println("insight without  1 argu cons");
		 	
	}
	
	public static void main(String ar[]) throws Exception{
		ThisImpl t=new ThisImpl();//if we are not calling default constracter then our constracter will not call
		t.gum();
		
	}
	public void gum(){
		
		System.out.println("insight gum");
	}
	
	
}