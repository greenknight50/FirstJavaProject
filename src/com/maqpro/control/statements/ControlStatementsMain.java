package com.maqpro.control.statements;

import java.util.Scanner;

public class ControlStatementsMain {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		String userPassword;
		Scanner scanner = new Scanner(System.in);

		while (j < 10) {
			System.out.println("From while loop, j = " + j++);
		}

		do {
			i++;
			System.out.println("Enter your password: ");
			userPassword = scanner.next();
		} while (!"password".equalsIgnoreCase(userPassword) && (i < 3));
		if (i == 3) {
			System.out.println("You have enter wrong password for 3 times");
		}
		System.out.println("Out of do while loop and end of main method");
	}

}
