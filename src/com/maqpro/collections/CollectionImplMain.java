package com.maqpro.collections;

import java.util.Collections;
import java.util.TreeSet;

public class CollectionImplMain {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(53);
		ts.add(1);
		ts.add(10);
		ts.add(101);
		System.out.println("Treeset element: " + ts);
		TreeSet<Integer> ts1 = new TreeSet<Integer>(Collections.reverseOrder());
		ts1.add(83);
		ts1.add(4);
		ts1.add(10);
		ts1.add(3);
		ts1.containsAll(ts);
		System.out.println("TreeSet in desc: " + ts1);
		System.out.println("Ts contains: " + ts1.contains(53));
	}
}
