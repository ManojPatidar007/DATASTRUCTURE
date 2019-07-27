package com.mp.basic;
import com.mp.basic.inheritence.*;

public class AsciiValue {
public static void main(String ar[]){
	
	char a='a';
	char z='z';
	char A='A';
	char Z='Z';
	int b=a;
	int c=z;
	int d=A;
	int e=Z;
	
	System.out.println(b+" "+c+" "+d+" "+e);//97=a, 122=z, A=65, Z=90
	System.out.println((int)a);
	int i=50;//48=0 and 57=9
	System.out.println((char)i);//print ascii value "2"
	
}
}
