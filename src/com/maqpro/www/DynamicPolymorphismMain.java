package com.maqpro.www;


class Animal {
	public void eat() {
		System.out.println("All animals eat to survice.");
	}
}

class Tiger extends Animal {
	public void eat() {
		super.eat();
		System.out.println("Tiger only eats flesh/meat");
	}
}

class Goat extends Animal {
	public void eat() {
		System.out.println("Goat only eats vegitations");
	}
}

class Human extends Animal {
	public void eat() {
		System.out.println("Human eat both flesh and vegitations");
	}
}


public class DynamicPolymorphismMain {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.eat();
		animal = new Tiger();
		animal.eat();
		animal = new Goat();
		animal.eat();
		animal = new Human();
		animal.eat();
	}

}
