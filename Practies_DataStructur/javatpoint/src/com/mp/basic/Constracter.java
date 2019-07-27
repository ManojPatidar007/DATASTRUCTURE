//

class Constracter extends Parent{
	
	public  void Parent(int a){
		System.out.println("hello paryent");
	}
	public static void main(String ar[]){
	Constracter c=new Constracter();
	Parent p=new Constracter();
		c.Parent(10);//call child class
		p.Parent(10);//call child class
		c.Parent();//call parent class
		p.Parent();//call parent class
		c.show();//call child class 
		p.show();//call child class 
		
	}
	public void show(){
		System.out.println("show inside cons");
		//Parent.show1();
	}
	
	
}
  abstract  class Parent{
	public Parent(){};
	public  void Parent(){
		System.out.println("hello inside paryent");
	}
	public abstract void Parent(int i);
	public  void show(){
		System.out.println("show inside paryent");
	}
	public static  void show1(){
		System.out.println("show1 inside paryent");
	}
	
}