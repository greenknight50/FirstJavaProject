package com.maqpro.www;

import java.util.ArrayList;
import java.util.List;

public class DataTypes {
	
	byte byteValue = 10;
	short shortValue = 8;
	int intValue = 10;
	long longValue = 10;
	float floatValue = 10.5f;
	double doubleValue = 10.5;
	char charValue = 'a';
	boolean boolValue = false;

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		DataTypes obj = new DataTypes();
		
		
		System.out.println("Byte min value: " + Byte.MIN_VALUE + ", max value: " + Byte.MAX_VALUE);
		System.out.println("Short min value: " + Short.MIN_VALUE + ", max value: " + Short.MAX_VALUE);
		System.out.println("Integer min value: " + Integer.MIN_VALUE + ", max value: " + Integer.MAX_VALUE);
		System.out.println("Long min value: " + Long.MIN_VALUE + ", max value: " + Long.MAX_VALUE);
		System.out.println("Float min value: " + Float.MIN_VALUE + ", max value: " + Float.MAX_VALUE);
		System.out.println("Double min value: " + Double.MIN_VALUE + ", max value: " + Double.MAX_VALUE);
		
	}

}
