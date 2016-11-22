package com.mylabs;

public class SimpleStaticProg {
	private int a;
	public static int count;

	public SimpleStaticProg() {
		a = 10;
		count = 0;
	}

	public void change() {
		a = a + 1;

		System.out.println(a);
	}

	public static void main(String[] args) {
		SimpleStaticProg simpleObj1 = new SimpleStaticProg();

		simpleObj1.change();

		SimpleStaticProg.count = SimpleStaticProg.count + 1;

		System.out.println(SimpleStaticProg.count);

		SimpleStaticProg simpleObj2 = new SimpleStaticProg();

		simpleObj2.change();

		SimpleStaticProg.count = SimpleStaticProg.count + 1;

		System.out.println(SimpleStaticProg.count);
	}
}
