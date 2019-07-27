import java.io.*;
class Employee  implements Serializable{
	int id;
	String name;
	static  final String clg="Oxford";
	Employee(int id,String name){
		this.name=name;
		this.id=id;
	}
	public String toString(){
	return "id="+this.id +" name="+this.name+" clg="+this.clg;}
}
public class SerializableString{
	
	public static void main(String ar[]){
		try{
			storeData();
			showData();
		}catch(Exception e){
			e.printStackTrace();
		}
		File f=new File("asd.txt");
	}
	public static void storeData() throws Exception{
		File f=new File("asd.txt");
		
		FileOutputStream fr=new FileOutputStream(f);
		ObjectOutputStream or=new ObjectOutputStream(fr);
		Employee e=new Employee(12,"wq");
		or.writeObject(e);
		
		
		
	}
	public static void showData() throws Exception{
		File f=new File("asd.txt");
		FileInputStream fm=new FileInputStream(f);
		ObjectInputStream om=new ObjectInputStream(fm);
		Employee e=(Employee)om.readObject();
		System.out.println("hello"+e);
		
		
		
	}
}