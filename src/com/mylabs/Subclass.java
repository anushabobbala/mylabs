package com.mylabs;
class Subclass extends Parentclass {
	/*
	 * I am declaring the same variable num in child class too.
	 */

	
	void printNumber() {
		int num = 110;
		System.out.println(super.num);
	}

	public static void main(String args[]) {
		Subclass obj = new Subclass();
		obj.printNumber();
	}
}