package com.maqpro.control.statements;

public class ControlStatementsMain {
	
	public ControlStatementsMain(String message) {
		System.out.println("From CSM: " + message);
	}

	public static void main(String[] args) {

		String str1 = new String("Hello world");
		final String str2 = "Hello World";
		String str3 = "Hello World";
		String str4 = new String("Hello World");
		str4 = str4 + " from java program";
		
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str2 == str3: " + (str2 == str3));
		System.out.println("str1 == str4: " + (str1 == str4));
		System.out.println();
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str2.equals(str3): " + str2.equals(str3));
		System.out.println("str1.equals(str4): " + str1.equals(str4));  //false
		System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4));  //true
		System.out.println("\nASCII of \'A\': " + (int)'A');
		System.out.println("ASCII of \'a\': " + (int)'a');
		System.out.println("ASCII of \'H\': " + (int)'H');
		System.out.println("ASCII of \'h\': " + (int)'h');
		System.out.println("ASCII of \'W\': " + (int)'W');
		System.out.println("ASCII of \'w\': " + (int)'w');
		System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));
		
		StringBuffer strBuffer = new StringBuffer("Hello World");
		strBuffer.append(" from java program");
		
		StringBuilder strBuilder = new StringBuilder("Hello World");
		strBuilder.append(" from java program builder");
		System.out.println("str1 length: " + str1.length());
		System.out.println("str1 char at 16: " + str1.charAt(16));
		
	}

}
