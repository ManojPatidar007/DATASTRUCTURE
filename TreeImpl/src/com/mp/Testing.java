package com.mp;

import com.mp.tree.TreeImpl;

public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeImpl t=new TreeImpl();
		t.add(44);
		t.add(14);
		t.add(24);
		t.add(46);
		t.show();
		System.out.println(t.total());
		System.out.println(t.search(4));
		

	}

}
