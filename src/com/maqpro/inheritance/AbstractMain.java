package com.maqpro.inheritance;

public class AbstractMain extends AbstractClassExample {

	public static void main(String[] args) {
		AbstractMain object = new AbstractMain();
		System.out.println(object.getFeature());
		System.out.println(object.getName());
	}

	public String getFeature() {
		return "From getFeature method of subclass";
	}


}
