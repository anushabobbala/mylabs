package com.mylabs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordLength {
	public static void main(String args[]) {
		String filepath = "E:/testfiles/input.txt";
		int wordno = 0;
		int length;

		try {
			FileReader fileReader = new FileReader(filepath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				
                length = line.length();
                System.out.println("characters of string:"+length);
                
				System.out.println(line);
				System.out.println("number of words");
				
				String[] word = line.split(" ");
				wordno = word.length;
				System.out.println(wordno);
				
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		


		

	}
}
