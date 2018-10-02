package top_question;
public class Power{
	int temp=1;
	public static void main(String ae[]){
		Power p=new Power();
	int i=p.pow(2,10);
	System.out.println("power of x through return type="+i);
	p.power(2,10);
	System.out.println("power of x without return type="+p.temp);
	}
	private int pow(int x,int n ){
		int temp;
		if(n==0){
			return 1;
		}
		temp=pow(x,(n/2));
		if(n%2==0){
			return temp*temp;
		}
		else {
			return temp*temp*x;
		}
	
		
	} 
	private void power(int x,int y){
		if (y==0){
			return;
			
		}
		power(x,(y/2));
		if(y%2==0){
			temp=temp*temp;
		}
		else {
			temp= temp*temp*x;
		}
		
	}
	
	
}