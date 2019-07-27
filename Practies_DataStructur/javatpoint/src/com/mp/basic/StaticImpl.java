class StaticImpl{
	static int i=10;
	
	static {
		System.out.println("insight static block");
	}
	public static void main(){
		System.out.println("inside static method i="+i++);
	}
	public static void main(String ar[]){
		StaticImpl a=new StaticImpl();
		StaticImpl b=new StaticImpl();
		a.main();
		main();
		b.main();
		a.nosStatic();
	}
	public void nosStatic(){
		System.out.println("insight  not-static block");
		nosStatic1();
		StaticImpl s=new StaticImpl();
		StaticImpl.main();
					String ar[]=new String[4];
		if(i<16)

		s.main(ar);
	}
	public void nosStatic1(){
		System.out.println("insight  not-static1 block");
	}
}