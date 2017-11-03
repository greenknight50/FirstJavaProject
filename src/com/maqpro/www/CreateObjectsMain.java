package com.maqpro.www;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateObjectsMain {

	private String className = "CreateObjectsMain";
	
	public CreateObjectsMain()
	{
		
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		try {
			Constructor<CreateObjectsMain> constructor = CreateObjectsMain.class.getDeclaredConstructor();
			CreateObjectsMain object = constructor.newInstance();
			System.out.println("Object created for: " + object.className);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
	}

}
