package com.maqpro.control.statements;

public class ControlStatementsMain {

	public static void main(String[] args) {
		int[] array = {11, 2, 321, 54, 50};
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		System.out.println("Array iteration using for-each loop");
		for (int i : array) {
			System.out.println("array[" + i + "] = " + i);
		}
		System.out.println("End of for loop and main as well: ");
	}

}
