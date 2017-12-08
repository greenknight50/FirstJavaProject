package com.maqpro.collections;

public class CollectionImplMain {
	
	public static void main(String[] args) throws InterruptedException {
		String firstResource = "Important text";
		String secondResource = "Very important text";

		Thread thread1 = new Thread() {
			public void run() {
				synchronized (firstResource) {
					System.out.println("Thread name: " + this.getName() + ", Locked firstResource");
					try {
						this.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (secondResource) {
						System.out.println("Thread name: " + this.getName() + ", Locked secondResource");
					}
				}
			}
		};

		Thread thread2 = new Thread() {
			public void run() {
				synchronized (secondResource) {
					System.out.println("Thread name: " + this.getName() + ", Locked secondResource");
					try {
						this.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (firstResource) {
						System.out.println("Thread name: " + this.getName() + ", Locked firstResource");
					}
				}
			}
		};

		thread1.setName("FirstThread");
		thread2.setName("SecondThread");
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println("About to exit main method");
	}
}
