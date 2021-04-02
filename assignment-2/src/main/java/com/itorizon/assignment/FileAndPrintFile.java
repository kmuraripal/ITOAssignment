package com.itorizon.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeMap;

/**
 * This class defines method to read file and count the occurrence of words.
 * 
 * @author Krishna Murari Pal
 * @version 1.0.0
 */
public class FileAndPrintFile {

	/**
	 * This method reads files and print the word and there occurrence.
	 * 
	 * @param filePath it is the file directory location (path = "C:\\Users\\Krishna
	 *                 Murari Pal\\OneDrive - Itorizon\\Desktop\\test.txt").
	 */
	public static void readFileAndPrintWordCont(String filePath) throws IOException {

		// Reading the file
		File file = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(file));

		String flag = "";
		String line = "";

		// Reading the line from the file and storing as a String
		while ((flag = br.readLine()) != null) {
			if (flag != null) {
				line = line + flag;
			}
		}
		line = line.replace(".", " "); // eliminating the .(dot) from string
		String[] words = line.split(" "); // getting array from string
		TreeMap<String, Integer> wordsChecker = new TreeMap<String, Integer>(); // map to store different words
		for (String string : words) {
			if (string.trim() == "") {
				continue;
			}

			// counting the words
			if (!wordsChecker.containsKey(string)) {
				wordsChecker.put(string, 1);
			} else {
				wordsChecker.put(string, wordsChecker.get(string) + 1);
			}
		}

		// printing the word and count value
		Set<String> keySet = wordsChecker.keySet();
		for (String string : keySet) {
			System.out.println(string + "\t\t\t" + wordsChecker.get(string));
		}
	}
}
