package com.mylabs;

import java.lang.*;
import java.util.*;

public class ReverseStringArray {
	public static void main(String[] args) {
		List str = new ArrayList();
		str.add("anu");
		str.add("avi");
		str.add("padma");
		str.add("venkat");
		System.out.println("givenstring = " + str);
		Collections.reverse(str);
		System.out.println("reversed string = " + str);

	}

}
