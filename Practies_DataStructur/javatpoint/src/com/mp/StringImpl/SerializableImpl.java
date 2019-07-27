//Serialization is a mechanism of converting the state of an object into a byte stream. 
//Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
import java.io.*;
class SerializableImpl implements Serializable {
	int id;
	String name;
	SerializableImpl(){}
	SerializableImpl(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String ar[]){
		SerializableImpl im=new SerializableImpl();
		try{
			im.storeData();
			im.showImpl();
			im.storeByte();
			im.showByte();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public void showImpl() throws IOException{
		
			File f=new File("abc.txt");
			BufferedReader br=new BufferedReader(new FileReader(f));
			String ar=br.readLine();
			System.out.println(ar);
			br.close();
			
	}
	public void storeData()throws IOException{
		File f=new File("abc.txt");
		BufferedWriter br=new BufferedWriter(new FileWriter(f));
		br.append("welcome to java");
		br.close();
	}
	public void storeByte()throws IOException{
		File f=new File("cde.txt");
		SerializableImpl sr=new SerializableImpl(101,"hello");
		FileOutputStream fr=new FileOutputStream(f);
		ObjectOutputStream om=new ObjectOutputStream(fr);

		om.writeObject(sr);
		fr.close();
		om.close();
	}
	public void showByte()throws Exception{
		File f=new File("cde.txt");
		FileInputStream fm=new FileInputStream(f);
		ObjectInputStream om=new ObjectInputStream(fm);
		SerializableImpl s=(SerializableImpl)om.readObject();
		om.close();
		fm.close();
		System.out.println(s.id);
		System.out.println(s.name);
	}
	
}
