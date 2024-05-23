package com.java21.example;

import java.util.concurrent.Executors;

/**
 * @author Kashif Ur Rehman
 * 
 * Virtual Threads (permanent feature not a provisional feature) :- Light weight threads help us to write high throughput concurrent applications.
 * 
 * High throughput concurrent application means less time and more tasks to do
 * 
 */
public class VirtualThreads {

	public static void main(String[] args) {
		
		Runnable runnable = () -> System.out.println("Inside Runnable.");
		
		//1
		Thread.startVirtualThread(runnable);
		
		//2
		Thread virtualThread = Thread.ofVirtual().start(runnable);
		
		//3
		var executor = Executors.newVirtualThreadPerTaskExecutor();
		
		executor.submit(runnable);
		
	}

}
