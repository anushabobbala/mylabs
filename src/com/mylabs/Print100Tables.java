package com.mylabs;

public class Print100Tables {
	
	public static void multiply(int numberOfTables) {

		for (int i = 1; i <= numberOfTables; i++) {
			
			System.out.println("Multiplication Table for : " + i);
			for (int j = 1; j <= 20; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println("");
			
		}
	}

	public static void main(String[] args) {
		multiply(100);
	}

}
