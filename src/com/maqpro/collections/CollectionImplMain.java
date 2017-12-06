package com.maqpro.collections;

class CustomThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("i value from thread " + this.getName() + " is: " + i + ", and is it alive: " + this.isAlive() + ", its status: " + this.getState());
			if (i == 100) {
				this.yield();
			}
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class CollectionImplMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inside main method");
		CustomThread t1 = new CustomThread();
		CustomThread t2 = new CustomThread();
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		/*
		 * t1.sleep(5000); System.out.println("t1 state: " + t1.getState());
		 */
		t2.start();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("About to join main thread to the end of t1 thread");
		t1.join();
		t1.yield();
		System.out.println("Resuming main thread");
		System.out.println("End of main method");
	}

}
