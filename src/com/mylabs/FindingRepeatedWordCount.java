package com.mylabs;

import java.io.*;
import java.util.*;

public class FindingRepeatedWordCount {

	public static void main(String[] args) {
		FindingRepeatedWordCount findingRepeatedWordCount = new FindingRepeatedWordCount();
		findingRepeatedWordCount.getWordCounts();
	}

	public void getWordCounts() {

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		try {
			String filepath = "E:/testfiles/repetationofwordsinput.txt";
			FileReader fileReader = new FileReader(filepath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				String[] arraywords = line.split(" ");

				for (int i = 0; i < arraywords.length; i++) {
					// System.out.println(arraywords[i]);
					String key = arraywords[i];
					if (map.get(key) != null) {
						int value = map.get(key) + 1;
						map.put(key, value);
					} else {
						map.put(arraywords[i], 1);
					}

				}
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();

		}
		printMap(map);
	}

	public void printMap(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey().toString();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}

	}
}
