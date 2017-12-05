package com.maqpro.collections;

class CustomThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i value from thread " + this.getName() + " is: "  + i);
		}
	}
}

public class CollectionImplMain {

	public static void main(String[] args) {
		System.out.println("Inside main method");
		CustomThread t1 = new CustomThread();
		CustomThread t2 = new CustomThread();
		System.out.println("Starting thread now");
		t1.setName("FirstThread");
		t2.setName("SecondThread");
		t1.start();
		t2.start();
		System.out.println("Create thread of runnable interface");
		ThreadWithRunnable obj = new ThreadWithRunnable();
		Thread t3 = new Thread(obj);
		t3.start();
		System.out.println("End of main method");
	}

}
