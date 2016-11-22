package com.mylabs;

public class SimpleArithmetic {
	private int a, b;

	public SimpleArithmetic() {
		a = 10;
		b = 20;
	}

	public SimpleArithmetic(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(this.a);
		System.out.println(this.b);
	}

	public int add() {
		return a + b;
	}

	public static void main(String[] args) {
		SimpleArithmetic simpleObj = new SimpleArithmetic(21, 6);
		System.out.println(simpleObj.add());
	}
}
