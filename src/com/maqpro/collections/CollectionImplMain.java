package com.maqpro.collections;

class CustomThread extends Thread {

	static Long accountBalance = 1000l;

	@Override
	public void run() {
		
		//95 lines
		synchronized (accountBalance) {
			accountBalance = accountBalance - 100;
			System.out.println("Thread name: " + this.getName() + ", i value: " + accountBalance);
		}
		//2 lines
	}
}

public class CollectionImplMain {

	public static void main(String[] args) throws InterruptedException {
		CustomThread t1 = new CustomThread();
		CustomThread t2 = new CustomThread();
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();
	}
	
	public void printSome() {
		System.err.println("print now.");
		
		
		
		//100 lines
	}

}
