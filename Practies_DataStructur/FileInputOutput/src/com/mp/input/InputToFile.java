package com.mp.input;

import java.io.*;

public class InputToFile {

	public static void main(String[] args) throws IOException {
		File f=new File("./src/abc.txt");
		FileInputStream fm=new FileInputStream(f);
		BufferedInputStream vf=new BufferedInputStream(fm);
		byte a[]=new byte[2];
		int n=vf.read(a);
		int s=vf.read();//it will reAD first character and writes its ascill value
		System.out.println(s+" "+a.length);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		//BufferedWriter br=new BufferedWriter(fm);
		
	}

}
