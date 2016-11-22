package com.mylabs;

public class SetThreadNameExample {

	public static void main(String[] args) {

		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);

		currentThread.setName("Set Thread Name Example");

		System.out.println("Thread Name : " + currentThread.getName());
	}
}
