package com.maqpro.collections;

public class ThreadWithRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I'm from runnable thread " + i);
		}
	}

}
