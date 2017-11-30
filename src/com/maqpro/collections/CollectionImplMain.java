package com.maqpro.collections;

import java.util.HashMap;

public class CollectionImplMain {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		System.out.println("Map size: " + map.size());
		map.put("banana", "Yellow");
		map.put("grapes", "Green");
		map.put("orange", "orange");
		System.out.println("map size: " + map.size());
		System.out.println("map: " + map);
		System.out.println(map.get("grapes"));
		String str1 = "Aa";
		String str2 = "BB";
		System.out.println("hash of str1: " + str1.hashCode() + ", hash of str2: " + str2.hashCode());
		
	}
	
}
