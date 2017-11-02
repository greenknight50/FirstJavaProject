package com.maqpro.www;

/**
 * Copyright of ashraf llc @2017
 * 
 * @author ashraf
 *
 */
public class FirstMain {
	
	protected String userName;
	String emailId;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * below statement will print hello world onto the console. this line will not
		 * be treated as part of above comment
		 */
		System.out.println("\"Hello World!\"");
		FirstMain firstMain = new FirstMain();
		String emailAddress = "java.ashraf@gmail.com";
		for (int i =0; i< 10; i++) {
			System.out.print(i + " ");
		}
		
		String str = emailAddress;
	}
	//String str1 = emailAddress;
	
	/**
	 * This method will fetch user details based on the userId and email provided
	 * @param userId userId of the user whose details are to be fetched
	 * @param emailAddress emailId of the user whose details are to be fetched
	 * @return returns userName and emailAddress as a string.
	 * @throws NullPointerException this method might throw NullPointerException if not checked properly
	 */
	public String getUserDetails(long userId, String emailAddress) throws NullPointerException {
		return "Ashraf, java.ashraf@gmail.com";
	}
	
}
