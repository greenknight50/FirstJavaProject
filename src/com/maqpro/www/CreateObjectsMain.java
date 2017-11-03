package com.maqpro.www;

public class CreateObjectsMain implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	private String className = "CreateObjectsMain";

	public static void main(String[] args) throws CloneNotSupportedException {
		
			CreateObjectsMain object1 = new CreateObjectsMain();
			object1.className = "Object1Name";
			CreateObjectsMain object2 = (CreateObjectsMain)object1.clone();
			System.out.println("Classname from object2 instance var: " +object2.className);
	
	}

}
