package com.mylabs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class WordLength {
public static void main(String args[])
{
	String filepath="E:/testfiles/input.txt";
	List<String> list = new ArrayList<>();
	
	try{
	FileReader fileReader=new FileReader(filepath);
	BufferedReader bufferedReader=new BufferedReader(fileReader);
	String line;
	
	
	while ((line = bufferedReader.readLine()) != null) {
		list.add(line);
		System.out.println(line);
	}
		
	}catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println(" ");
	System.out.println("output");
	System.out.println(" ");
	
	try {
		File outputFile = new File("E:/testfiles/output.txt");
		FileWriter filewriter = new FileWriter(outputFile.getAbsoluteFile());
		BufferedWriter bufferwriter = new BufferedWriter(filewriter);
		
	 String[] words = list.split(" ");
	 System.out.println("no of words:" +words.length);
	 
	 bufferwriter.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
	 
	 
	 
	 
	 
	
	
	
	
} 