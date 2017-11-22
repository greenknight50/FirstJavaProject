package com.maqpro.exceptions;

import java.util.Scanner;

public class TryCatchExceptionMain {

	public static void main(String[] args) {
		System.out.println("Start of main method");
		int returnValue = 0;
		try {
			returnValue = getSomeDetails();
		} catch (MyOwnException ex) {
			System.out.println("Inside catch block of main: " + ex.getMessage());
			ex.printStackTrace();
		}
		//System.out.println("End of main method, returnValue: " + returnValue);
	}

	public static int getSomeDetails() throws MyOwnException {
		System.out.println("inside getSomeDetails()");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x value: ");
		int z = 0;
		int x = scanner.nextInt();
		System.out.println("Enter y value: ");
		int y = scanner.nextInt();
		try {
			return getCalculatedValue(x, y);
		} catch(UserDefinedException ex) {
			System.out.println("Inside catch block of getDetai...");
			System.out.println("Message recieved: " + ex.getMessage());
			throw new MyOwnException("This is an appended message", ex);
		}
		//System.out.println("end of getSomeDetails()");
	}
	
	public static int getCalculatedValue(int x, int y) throws UserDefinedException{
		System.out.println("inside getCalc...");
		int z = 0;
		if (y == 0) {
			System.out.println("About to throw an exception");
			throw new UserDefinedException("Please do not enter 0 as Y value, it causes arithmetic exp");
		} else { 
			z = x / y;
		}
		return z;
	}

}

class MyOwnException extends Exception {
	
	public MyOwnException() {
		super();
	}
	
	public MyOwnException(String message) {
		super(message);
	}
	
	public MyOwnException(String message, Throwable obj) {
		super(message, obj);
	}
	
}

class UserDefinedException extends Exception {
	
	public UserDefinedException(String message) {
		super(message);
	}
	
	public UserDefinedException(String message, Throwable obj) {
		super(message, obj);
	}
}
