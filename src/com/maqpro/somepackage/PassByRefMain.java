package com.maqpro.somepackage;

public class PassByRefMain {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java");
		PassByRefMain obj = new PassByRefMain();
		System.out.println("str value before call: " + str);
		obj.changeValue(str);
		System.out.println("str value after call: " + str);

	}
	
	public void changeValue(StringBuffer str) {
		System.out.println("str: " + str);
		str.append(" Training");
		System.out.println("str: " + str);
	}

}
