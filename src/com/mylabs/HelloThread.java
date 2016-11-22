package com.mylabs;

public class HelloThread extends Thread {
	public void run() {
		System.out.println("HELLO WORLD THREAD");
	}

	public static void main(String[] args) {
		HelloThread threadObj = new HelloThread();
		threadObj.start();
	}
}