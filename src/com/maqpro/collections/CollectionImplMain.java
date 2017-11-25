package com.maqpro.collections;

import java.util.Vector;

public class CollectionImplMain {

	public static void main(String[] args) {

		Vector<Integer> vector1 = new Vector<Integer>();
		Vector<Integer> vector2 = new Vector<Integer>(20);
		Vector<Integer> vector3 = new Vector<Integer>(20, 5);
		
		System.out.println("vector1 size: " + vector1.size() + ", vector1 capacity: " + vector1.capacity());
		for (int i = 0; i < 10; i++) {
			vector1.addElement(i);
		}
		vector1.add(10);
		System.out.println(
				"vector1 size after initial add: " + vector1.size() + ", vector1 capacity: " + vector1.capacity());
		int size = vector1.size();
		int capacity = vector1.capacity();
		for (int i = size; i <= capacity; i++) {
			//System.out.println("adding element");
			vector1.addElement(i);
		}
		System.out.println("vector1 size after capacity inc 20: " + vector1.size() + ", vector1 capacity: " + vector1.capacity());
		size = vector1.size();
		capacity = vector1.capacity();
		for (int i = size; i <= capacity; i++) {
			//System.out.println("adding element");
			vector1.addElement(i);
		}
		System.out.println("vector1 size after capacity inc 40: " + vector1.size() + ", vector1 capacity: " + vector1.capacity());
		vector1.trimToSize();
		System.out.println(
				"vector1 size after trimToSize: " + vector1.size() + ", vector1 capacity: " + vector1.capacity());
		
		System.out.println("*************** vector3 with 2 argument****************\n\n");
		for (int i = 0; i<=20; i++) {
			//System.out.println();
			vector3.add(i);
		}
		System.out.println("vector3 size is: " + vector3.size() + ", vector3 capacity: " + vector3.capacity());
		size = vector1.size();
		capacity = vector1.capacity();
		for (int i = size; i <= capacity; i++) {
			//System.out.println("adding element");
			vector3.addElement(i);
		}
		System.out.println("vector3 size after c is: " + vector3.size() + ", vector3 capacity: " + vector3.capacity());
		
		Vector<Integer> vector4 = new Vector(vector1);
		System.out.println("vector4 size: " + vector4.size() + ", capacty: " + vector4.capacity());
		vector4.add(42);
		System.out.println("vector4 size: " + vector4.size() + ", capacty: " + vector4.capacity());
	}
}
