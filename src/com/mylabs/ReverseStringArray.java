package com.mylabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringArray {
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("anu");
		str.add("avi");
		str.add("padma");
		str.add("venkat");
		
		System.out.println("givenstring = " + str);
		Collections.reverse(str);
		System.out.println("reversed string = " + str);

		
		//TODO:: Read about Generics
	}

}
