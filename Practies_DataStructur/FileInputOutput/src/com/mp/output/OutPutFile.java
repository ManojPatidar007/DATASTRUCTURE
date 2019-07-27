package com.mp.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stubFile f=new File("./abc.txt");
		try{
		File f=new File("C:/Users/Manoj/Desktop/abc.txt");
		File f1=new File("./src/abc.txt");//(../abc.txt)double dot willcreate file with project directory
		//single will make inside project root
		
		FileOutputStream fm=new FileOutputStream(f1);
		fm.write(49);
		String ar="hello";
		byte b[]=ar.getBytes();
		fm.write(b);
		fm.flush();
		fm.close();
		for(int i=0;i<b.length;i++)
		System.out.print(b[i]+" ");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("data saved into file successfully");

	}

}
