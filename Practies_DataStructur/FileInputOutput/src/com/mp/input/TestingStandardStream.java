package com.mp.input;

import java.io.IOException;
import java.util.Scanner;

public class TestingStandardStream {

	public static void main(String[] args) throws IOException {
		System.out.println("hello");
		System.err.println("hello");
		Scanner sc=new Scanner(System.in);
		// all above are stenderd stream which are linked to console
		int i=System.in.read();//return asscii value of first character
		System.out.println("hello="+i);

	}

}
