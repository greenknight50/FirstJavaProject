package com.maqpro.collections;

import java.util.HashSet;

public class CollectionImplMain {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Chicago");
		hashSet.add("Atlanta");
		hashSet.add("Hyderabad");
		hashSet.add("California");
		System.out.println("Hashset elements: " + hashSet);
		hashSet.add("Chicago");
		hashSet.add(null);
		System.out.println("Hashset elements after adding chicago: " + hashSet);
		HashSet<Integer> hashSet1 = new HashSet<Integer>(20);
		HashSet<Integer> hashSet2  = new HashSet<Integer>(20, 0.8f);
		for(int i = 0; i< 22; i++) {
			hashSet2.add(i);
		}
		System.out.println("Hashset2 : "  + hashSet2);
		HashSet<Integer> hashSet3 = new HashSet<Integer>(hashSet2);
		System.out.println("Hashset3: "  + hashSet3);
		hashSet1.add(8);
		hashSet1.add(3);
		hashSet1.add(51);
		System.out.println(hashSet1);
	}
}
