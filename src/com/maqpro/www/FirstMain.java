package com.maqpro.www;

/**
 * Copyright of ashraf llc @2017
 * 
 * @author ashraf
 *
 */
public class FirstMain {

	protected String userName;
	protected long userId;

	public FirstMain() {
		
	}

	public FirstMain(String userName) {
		this.userName = userName;
		this.userId = 100;
	}

	public FirstMain(long userId) {
		this.userId = userId;
		this.userName = "DefaultUserName";
	}

	public FirstMain(String userName, long userId) {
		this.userName = userName;
		this.userId = userId;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*FirstMain firstMain1 = new FirstMain();
		System.out.println("userName: " + firstMain1.userName + ", userId: " + firstMain1.userId);*/
		FirstMain firstMain2 = new FirstMain("Ashraf", 88);
		System.out.println("userName: " + firstMain2.userName + ", userId: " + firstMain2.userId);
		FirstMain firstMain3 = new FirstMain(5001);
		System.out.println("userName: " + firstMain3.userName + ", userId: " + firstMain3.userId);
		FirstMain firstMain4 = new FirstMain("Arhaan", 7000);
		System.out.println("userName: " + firstMain4.userName + ", userId: " + firstMain4.userId);
	}

	/**
	 * This method will fetch user details based on the userId and email provided
	 * 
	 * @param emailAddress
	 *            emailId of the user whose details are to be fetched
	 * @return returns userName and emailAddress as a string.
	 * @throws NullPointerException
	 *             this method might throw NullPointerException if not checked
	 *             properly
	 */
	public String getUserDetails(String emailAddress) throws NullPointerException {
		return "Ashraf, java.ashraf@gmail.com";
	}

	public String getUserDetails(long userId) {
		return "" + userId + userId;
	}

	public long getUserDetails(String emailAddress, long yearOfBirth) {
		return yearOfBirth;
	}

	public String getUserDetails(long yearOfBirth, String emailAddress) {
		return emailAddress + yearOfBirth;
	}

}
