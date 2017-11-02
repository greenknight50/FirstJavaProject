package com.maqpro.www;

public class SecondMainClass {

	private int userId;
	private String userName;
	private String emailAddress;
	private static int deptId = 1001;
	private final int var1 = 100;
	private int var2 = 50;
	private static final String deptName = "R & D Department";

	public SecondMainClass() {
		this.userId = 101;
		this.userName = "Ashraf";
		this.emailAddress = "java.ashraf@gmail.com";
	}
	
	static {
		System.out.println("printing from static block");
		SecondMainClass obj = new SecondMainClass();
		System.out.println("Adding var1 and var2: "+ (obj.var1 + obj.var2));
	}
	
	static {
		System.out.println("From second static block");
	}
	
	static {
		System.out.println("From 3rd static block");
	}
	
	public static void main(String[] args) {
		FirstMain firstMain = new FirstMain();
		firstMain.userName = "Ashraf";
		System.out.println("Username: " +firstMain.userName);
	}
}
