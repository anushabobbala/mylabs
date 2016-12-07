package com.mylabs;

public class PrintTables {
	public static void multiply(int count) {
		for (int i = 1; i <= 20; i++) {

			System.out.println(count + "*" + i + "=" + (i * count));
		}
	}

	public static void main(String[] args) {

		multiply(2);
	}
}
