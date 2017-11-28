package com.maqpro.collections;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class CollectionImplMain {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(53);
		ts.add(1);
		ts.add(10);
		ts.add(101);
		System.out.println("Treeset element: " + ts);
		Iterator tsIterator = ts.iterator();
		try {
			while (tsIterator.hasNext()) {
				int element = (int) tsIterator.next();
				if (element == 53) {
					System.out.println("removing value: " + element);
					ts.remove(element);
					// tsIterator.remove();
				}
				System.out.println("element: " + element);
			}
		} catch (ConcurrentModificationException e) {
			System.out.println("Inside catch block");
			//e.printStackTrace();
		}
		System.out.println("Treeset element after removing: " + ts);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(10);
		list.add(30);
		list.add(20);
		System.out.println("current list: " + list);
		ListIterator listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			int value = (int) listIterator.next();
			if (value == 10) {
				listIterator.set(55);
			}
			System.out.println("value: " + value);
		}
		System.out.println("list after adding: " + list);
	}
}
