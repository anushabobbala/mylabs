package com.mylabs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordLength {
	public static void main(String args[]) {
		String filepath = "E:/testfiles/input.txt";
		int wordno;

		try {
			FileReader fileReader = new FileReader(filepath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;

			while ((line = bufferedReader.readLine()) != null) {

				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(" ");
		System.out.println("output");
		System.out.println(" ");

		String[] word = line.split(" ");
		wordno = word.length;
		System.out.println("no of words:" + wordno);

	}
}
