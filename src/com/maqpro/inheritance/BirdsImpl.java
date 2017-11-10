package com.maqpro.inheritance;

public class BirdsImpl implements Birds, FlyingCreatures {

	@Override
	public void fly() {
		System.out.println("This bird can fly");
	}

	public void eat() {
		System.out.println("Bird eat to survive");
	}

	@Override
	public void voiceTone() {
		System.out.println("Different birds have different tone.");
	}

	@Override
	public void bodyColor() {
		System.out.println("Birds come in different colors");
	}

	public static void main(String[] args) {
		System.out.println("Main method starts");
		System.out.println(Birds.birdName);
		BirdsImpl sparrow = new BirdsImpl();
		sparrow.bodyColor();
		sparrow.eat();
		sparrow.fly();
		sparrow.voiceTone();
		System.out.println("Main method ends");
	}
}
