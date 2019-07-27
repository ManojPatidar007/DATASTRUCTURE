package com.mp.basic.inheritence;

public class Bmw implements Car {
	int id=10;

	@Override
	public String name() {
		System.out.println("bmw car");
		return null;
	}
	public static void main(String ar[]){
		
		Car c=new Bmw();
		c.name();
		Car c1=new Car(){

			@Override
			public String name() {
				System.out.println("bmw car inside"+this.ID);
				return null;
			}
			};
			c1.name();
		int id=	c1.ID;
			
			AbstractImpl am=new AbstractImpl(){

				@Override
				public String name() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				void getName() {
					// TODO Auto-generated method stub
					
				}
				};
	}

}
