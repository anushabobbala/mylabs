package com.mylabs;
import java.io.*;
import java.util.*;

public class FindingRepeatedWordCount{
	public static void main(String[] args){
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		try{
		String filepath="E:/testfiles/repetationofwordsinput.txt";
		FileReader fileReader=new FileReader(filepath);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String line;
		
		while ((line = bufferedReader.readLine()) !=null) {
	String[] arraywords= line.split(" ");
	
	for(int i=0;i<arraywords.length;i++){
		
	
		
	
		
	}
		}
		bufferedReader.close();
		   }catch (IOException e){
			e.printStackTrace();
		
		   }
	
	}
}

