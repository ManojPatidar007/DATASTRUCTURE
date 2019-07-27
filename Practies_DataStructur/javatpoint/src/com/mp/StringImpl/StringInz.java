//string class implements serializable, comparable, charSequence interface 
//Serialization is a mechanism of converting the state of an object into a byte stream. 
//Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
class StringInz{
	
	public static void main(String ar[]){
		char cr[]={'a','s','d'};
		String sr=new String(cr);
		System.out.println(cr);
		System.out.println(sr);
		CharSequence obj = "hello";
String str = "hello";
System.out.println("output is : " + obj.hashCode() + "  " + str.hashCode());
str=str+" ji";
System.out.println("output is : " + obj.hashCode() + "  " + str.hashCode());
	}
}