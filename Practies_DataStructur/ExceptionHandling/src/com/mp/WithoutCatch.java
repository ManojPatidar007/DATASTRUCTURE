package com.mp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

public class WithoutCatch extends Exception  {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		 try{
	            URL url = new URL("http://www.google.com");
	            System.out.println(url);
	        } 
		 catch(Exception e){
			 try{}catch(Exception e1){}
			 
		 }
		 finally{
	            System.out.println("In finally block");
	        }
		 try{
			 File f1=new File("D:/games/abc.txt");
			 
			 FileInputStream fr=new FileInputStream(f1);
			 fr.read();//.toString();
		 }catch(Exception e){}
		 
		 finally{
			 
		 }
		System.out.println("hello");
	}

}
