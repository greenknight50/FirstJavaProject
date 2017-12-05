package com.maqpro.collections;

class CustomThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i value from thread " + this.getName() + " is: "  + i + ", and its status is: " + this.isAlive());
		}
	}
}

public class CollectionImplMain {

	public static void main(String[] args) {
		CustomThread t1 = new CustomThread();
		t1.setName("First");
		t1.start();
		t1.start();
	}

}
