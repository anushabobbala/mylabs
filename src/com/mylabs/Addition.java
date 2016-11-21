package com.mylabs;

class Addition {
	int a, b;

	Addition() {
		a = 5;
		b = 6;
	}

	Addition(int x, int y) {
		a = x;
		b = y;
	}

	int add() {
		return a + b;
	}

	public static void main(String[] args) {
		Addition obj1 = new Addition(10, 20);
		int sum1 = obj1.add();
		System.out.println(sum1);
		Addition obj2 = new Addition(20, 30);
		int sum2 = obj2.add();
		System.out.println(sum2);
		Addition obj3 = new Addition();
		int sum3 = obj3.add();
		System.out.println(sum3);
		Addition obj4 = new Addition();
		int sum4 = obj4.add();
		System.out.println(sum4);
	}
}