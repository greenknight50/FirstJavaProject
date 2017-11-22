package com.maqpro.collections;

import java.util.ArrayList;

public class CollectionImplMain {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("size of list collection is: " + list.size() + ", is list empty?: " + list.isEmpty());
		list.add(1);
		list.add(50);
		list.add(293);
		//list.add('A");
		System.out.println("size of list collection after adding values is: " + list.size() + ", is list empty?: " + list.isEmpty());
		System.out.println("Element at index 2 is: " + list.get(2));
		for (int i : list) {
			System.out.println("Object retrieved is: " + i);
		}
		list.clear();
		System.out.println("size of list collection after c values is: " + list.size() + ", is list empty?: " + list.isEmpty());
	}
}
