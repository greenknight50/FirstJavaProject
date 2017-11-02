package com.maqpro.www;

/**
 * 
 * This code is a copyright of Ashraf LLC @2017 Some more copyrights lines here
 * 
 * @author ashraf
 *
 */
public class DataTypesDefaultValues {
	
	private byte byteValue;
	private short shortValue;
	private int intValue;
	private long longValue;
	private float floatValue;
	private double doubleValue;
	private boolean boolValue;
	private char charValue;
	private String strValue;
	
	public static void main(String[] args) {
		DataTypesDefaultValues obj = new DataTypesDefaultValues();
		System.out.println("byteValue: " + obj.byteValue);
		System.out.println("shortValue: " + obj.shortValue);
		System.out.println("intValue: " + obj.intValue);
		System.out.println("longValue: " + obj.longValue);
		System.out.println("floatValue: " + obj.floatValue);
		System.out.println("doubleValue: " + obj.doubleValue);
		System.out.println("charValue: " + obj.charValue); //\u0000 \uffff
		System.out.println("boolValue: " + obj.boolValue);
		System.out.println("strValue: " + obj.strValue);
	}
	
}

