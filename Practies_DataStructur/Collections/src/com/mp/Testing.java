package com.mp;

import java.util.*;

public class Testing {
	static Testing t = new Testing();

	public static void main(String arr[]) {
		ArrayListExp ar = new ArrayListExp();
		ar.add(5);
		ar.add(15);
		ar.add(25);
		ar.add(35);
		// ar.show();
		ar.remove();
		System.out.println("after remove");
		// ar.show();

		t.all();
	}

	public void all() {
		LinkedList<String> ll = new LinkedList<>();
		List<Integer> lr = new LinkedList<>();
		ArrayList<Integer> al = new ArrayList();
		ArrayList<Integer> bl = new ArrayList();
		al.add(5);
		al.add(15);
		al.add(25);
		al.add(35);
		bl.add(54);
		bl.add(415);
		bl.add(275);
		bl.add(305);
		List<Float> fl = new ArrayList();
		ArrayList<ArrayList<Integer>> sl = new ArrayList<>();
		fl.add((float) 2.2);
		sl.add(al);
		sl.add(bl);
		t.showInr(sl);
		try {
			t.exxception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void showInr(ArrayList al) {
		Iterator ir = al.iterator();
		while (ir.hasNext()) {
			ArrayList ar = (ArrayList) ir.next();
			Iterator sa = ar.iterator();
			while (sa.hasNext()) {
				int i = (int) sa.next();
				System.out.println("i=" + i);
			}
		}
	}

	@SuppressWarnings("finally")
	private void exxception() throws Exception {
		try {
            int i=1/0;
		} 
		catch (Exception e) {
			try {
			} 
			catch (Exception e1) {
			} 
			finally{
				System.out.println("inner finally");
				return;
			}

		} 
		finally {
			try {
			} 
			catch (Exception e) {
			} finally {
				System.out.println("outer finally");
				return;
			}
		}
	}
}
