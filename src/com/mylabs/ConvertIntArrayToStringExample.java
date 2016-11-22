package com.mylabs;
import java.util.Arrays;

public class ConvertIntArrayToStringExample {

	public static void main(String args[]) {

		int[] intNumbers = new int[] { 1, 2, 3, 4, 5 };

		StringBuffer sbfNumbers = new StringBuffer();

		String strSeparator = " ";

		if (intNumbers.length > 0) {

			sbfNumbers.append(intNumbers[0]);

			for (int i = 1; i < intNumbers.length; i++) {
				sbfNumbers.append(strSeparator).append(intNumbers[i]);
			}

		}

		System.out.println("int array converted to String using for loop");

		System.out.println(sbfNumbers.toString());

		String strNumbers = Arrays.toString(intNumbers);

		System.out.println("String generated from Arrays.toString method: " + strNumbers);

		strNumbers = strNumbers.replaceAll(", ", strSeparator).replace("[", "").replace("]", "");

		System.out.println("Final String: " + strNumbers);
	}
}