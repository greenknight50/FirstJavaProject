package com.maqpro.exceptions;

public class TryCatchExceptionMain {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 1, 6, 2 };
		try {
			System.out.println("arr at index 6: " + arr[115]);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Message from catch: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Message from catch: " + ex.getMessage());
		}
	}

}
