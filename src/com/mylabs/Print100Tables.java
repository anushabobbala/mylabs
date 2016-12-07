package com.mylabs;

public class Print100Tables {
	public static void multiply() {
		int i, j;
		for (i = 1; i <= 100; i++) {
			for (j = 1; j <= 20; j++) {
				System.out.println(i + "*" + j + "=" + i * j);

			}

		}
	}

	public static void main(String[] args) {
		multiply();
	}

}
