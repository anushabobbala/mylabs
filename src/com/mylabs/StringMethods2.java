package com.mylabs;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Anusha and avinash";

		boolean bn = str1.endsWith("sha");
		System.out.println(bn);

		bn = str1.endsWith("ash");
		System.out.println(bn);

		boolean bn2 = str1.equals(str1);
		System.out.println(bn2);

		String[] stra = str1.split(" ");

		System.out.println(stra);

		int len = stra.length;
		System.out.println(len);

	}

}
