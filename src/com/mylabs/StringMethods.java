package com.mylabs;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello";
		String str2 = new String("Anusha");
		String str3 = str1.concat(str2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		int len = str3.length();
		System.out.println("lenght of '" + str3 + "'=" + len);

		char ch = str3.charAt(5);
		System.out.println("chara at 6th index in '" + str3 + "'=" + ch);

	}

}
