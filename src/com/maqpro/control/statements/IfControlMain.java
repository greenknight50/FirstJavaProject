package com.maqpro.control.statements;

import java.util.Scanner;

public class IfControlMain {

	public static void main(String[] args) {
		int x;
		String userName;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of x: ");
		x = scanner.nextInt();
		System.out.println("Enter your userName: ");
		userName = scanner.next();
		IfControlMain object = new IfControlMain();
		if (object.isUserAuthenticated(userName)) {
			System.out.println("Thats great user is authenticated, we are now executing if block");
		} else if (x == 5) {
			System.out.println("User enter x as 5, which is fine so we are executing this if");
		} else {
			System.out.println("Send user to registration page");
		}
		System.out.println("End of main method");
	}
	
	public boolean isUserAuthenticated(String userName) {
		System.out.println("inside isUserAuthenticated method");
		return "Ashraf".equalsIgnoreCase(userName);
	}

}
