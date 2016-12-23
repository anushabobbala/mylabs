package com.mylabs;

public class PrintGivenTables {
	public static void multiply(int numberOfTables) {
		int i, j;
		for (i = 1; i <= numberOfTables; i++) {
			for (j = 1; j <= 20; j++) {
				System.out.println(i + "*" + j + "=" + i * j);

			}

		}
	}

	public static void main(String[] args) {
		multiply(50);
	}

}
