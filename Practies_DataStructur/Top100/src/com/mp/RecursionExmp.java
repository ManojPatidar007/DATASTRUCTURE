package com.mp;

/**
 * @author Manoj
 *
 */
public class RecursionExmp {

	public static void main(String[] args) {
		RecursionExmp r = new RecursionExmp();
		r.show(5);

	}

	private void show(int i) {
		if (i > 0) {
			System.out.println(i);
			show(--i);
			System.out.println("i="+i);
		}
	}

}
