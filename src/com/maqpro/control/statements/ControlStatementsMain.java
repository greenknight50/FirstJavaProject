package com.maqpro.control.statements;

import java.util.Scanner;

public class ControlStatementsMain {

	public static void main(String[] args) {
		int x;
		char y;
		String userName;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of x: ");
		x = scanner.nextInt();
		System.out.println("Enter value of y char: ");
		y = scanner.next().charAt(0);
		/*
		 * System.out.println("Enter your userName: "); userName = scanner.next();
		 */
		ControlStatementsMain object = new ControlStatementsMain();

		for (int i = 0; i < 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println("i: " + i);
		}

		if (x == 1) {
			System.out.println("update phone nuber: " + (x + 4));
		} else if (x == 7) {
			System.out.println("from if  value is: " + (x + 3));
		} else if (x == 9) {
			System.out.println("from if  value is: " + (x + 5));
		} else if (x == 150) {
			System.out.println("150 is here");
		} else {
			System.out.println("you have entered a number which I was not expecting");
		}

		switch (x) {
		case 1:
			System.out.println("update phone number: " + (x + 4));
		case 10:
			System.out.println("update password: " + (x + 3));
			break;
		default:
			System.out.println("you have entered a number which I was not expecting");
			break;
		}

		System.out.println("End of main method");
	}

	public boolean isUserAuthenticated(String userName) {
		System.out.println("inside isUserAuthenticated method");
		return "Ashraf".equalsIgnoreCase(userName);
	}

}
