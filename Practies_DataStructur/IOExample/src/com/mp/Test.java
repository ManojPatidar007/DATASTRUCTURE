package com.mp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author mapa0716
 * 
 */
public class Test {
	static int data;

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws Exception {
		data = 10;
		FileOutputStream fm = new FileOutputStream("src\\resource\\abc.txt");
		fm.write(67);
		String s = " welcome to I/O example";
		byte d[] = s.getBytes();
		fm.write(d);
		fm.close();
		FileInputStream fin = new FileInputStream(
				"C:\\Users\\mapa0716\\Desktop\\abc.txt");
		int i = 0;
		int j = 0;
		String a = "";
		while ((i = fin.read()) != -1) {
			System.out.print((char) i);
			a = a + (char) i;
			j++;
		}
		fin.close();
		System.out.println("succedss" + j + a);

	}

}
