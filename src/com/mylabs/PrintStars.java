package com.mylabs;

public class PrintStars {

	public void print(int count)

	{
		System.out.println("before starting for loop");

		for (int i = 0; i < count; i++) {

			System.out.println("*****");
		}
	}

	public static void printusingstatic(int count)

	{
		for (int i = 0; i < count; i++) {

			System.out.println("*****");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintStars objectref = new PrintStars();
		objectref.print(-2);

		printusingstatic(0);

	}
}