package com.maqpro.inheritance;


abstract class Vehicle {
	
	public void engine() {
		System.out.println("Every vehicle has an engine.");
	}
	
	public abstract void wheels();
	
	public abstract void fuelType();
}


public class Ferrari extends Vehicle {

	public static void main(String[] args) {
		//Vehicle vehicle = new Vehicle();
		Ferrari ferrari = new Ferrari();
		ferrari.engine();
		ferrari.wheels();
		ferrari.fuelType();
		ferrari.AirContioner();
	}
	
	public void AirContioner() {
		System.out.println("Ferrari AC cools pretty fast");
	}

	@Override
	public void engine() {
		System.out.println("Ferrari has its own engine");
	}
	
	@Override
	public void wheels() {
		System.out.println("Ferrari has 4 wheels");
		
	}

	@Override
	public void fuelType() {
		System.out.println("Ferrari runs of gasoline/higher octane petrol");
	}

}
