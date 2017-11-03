package com.maqpro.www;

public class CreateObjectsMain {

	private String className = "CreateObjectsMain";

	public static void main(String[] args) {
		try {
			Class className = Class.forName("com.maqpro.www.CreateObjectsMain");
			CreateObjectsMain obj = (CreateObjectsMain) className.newInstance();
			System.out.println("Object created for class" + obj.className);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
			ex.printStackTrace();
		}
	}

}
