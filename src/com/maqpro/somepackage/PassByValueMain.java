package com.maqpro.somepackage;

public class PassByValueMain {
	private int var = 30;

	public static void main(String[] args) {
		int x = 10;
		PassByValueMain obj = new PassByValueMain();
		System.out.println("x value before changeValue call: " + obj.var);
		//obj.changeValue(x);
		obj.changeValue(obj.var);
		System.out.println("x value after changeValue call: " + obj.var);
	}
	
	public void changeValue(int y) {
		System.out.println("Y: " + y);
		y = y + 10;
		System.out.println("Y: " + y);
	}

}
