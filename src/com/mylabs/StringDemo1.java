package com.mylabs;

public class StringDemo1 {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("anusha");
		String str3 = str1.concat(str2);
		System.out.println(str3);
		int len = str3.length();
		System.out.println(len);
		char ch = str3.charAt(3);
		System.out.println(ch);

	}
}
