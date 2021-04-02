package com.itorizon.assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * This class Having the method, can convert number to word.
 * 
 * @author Krishna Murari Pal
 * @version 1.0.0
 */
public class NumberToWord {

	/**
	 * This method convert number to word
	 * 
	 * @param number Takes int type number which you want to convert in word, and
	 *               number should not be more then nine digits.
	 * @return number in word format for example 342 will converted as three hundred
	 *         fourty two.
	 */
	public static String getNumberToWord(int number) {
		String word = "";
		String numberStr = ("" + number).trim();
		
		if(numberStr == "") { return "Please provide valid number"; }
		if (numberStr.length() > 9) {
			return "Only supports less then or equal to nine digit numbers";
		}

		// getting words mapping of numbers.
		HashMap<Integer, String> primaryWords = getFirstTwentyWords();
		HashMap<Integer, String> multipulesOfTen = getMultiplesOfTen();
		HashMap<Integer, String> powersOfTens = getPowersOfTen();
		
		//converting from integer to word
		if (primaryWords.containsKey(number)) {
			return primaryWords.get(number).trim();
		} else {
			word = "";
			while (numberStr.length() > 0) {
				if (numberStr.length() % 2 == 0) {
					if (numberStr.length() == 2) {
						word = word + " " + multipulesOfTen.get(Integer.parseInt(numberStr.charAt(0) + "")) + " "
								+ primaryWords.get(Integer.parseInt(numberStr.charAt(1) + ""));
						return word.trim();
					} else if (numberStr.length() == 3) {
						word = word + " " + primaryWords.get(Integer.parseInt(numberStr.charAt(0) + "")) + " "
								+ powersOfTens.get(3) + " "
								+ multipulesOfTen.get(Integer.parseInt(numberStr.charAt(1) + "")) + " "
								+ primaryWords.get(Integer.parseInt(numberStr.charAt(2) + ""));
						return word.trim();
					}

					word = word + " " + primaryWords.get(Integer.parseInt(numberStr.charAt(0) + "")) + " "
							+ powersOfTens.get(numberStr.length());
					numberStr = numberStr.substring(1, numberStr.length());
					while (numberStr.charAt(0) == '0') {
						numberStr = numberStr.substring(1, numberStr.length());
					}
				} else if (numberStr.length() > 3) {
					int num = Integer.parseInt((numberStr.charAt(0) + "" + numberStr.charAt(1) + ""));
					if (num > 20) {
						word = word + " " + multipulesOfTen.get(Integer.parseInt(numberStr.charAt(0) + "")) + " "
								+ primaryWords.get(Integer.parseInt(numberStr.charAt(1) + "")) + " "
								+ powersOfTens.get(numberStr.length());
					} else {
						word = word + " " + primaryWords.get(num) + " " + powersOfTens.get(numberStr.length());
					}
					numberStr = numberStr.substring(2, numberStr.length());
					while (numberStr.charAt(0) == '0') {
						numberStr = numberStr.substring(1, numberStr.length());
					}
				} else {
					while (numberStr.charAt(0) == '0') {
						numberStr = numberStr.substring(1, numberStr.length());
					}
					if (primaryWords.get(Integer.parseInt(numberStr)) != null) {
						word = word + " " + primaryWords.get(Integer.parseInt(numberStr));
						numberStr = "";
					} else {
						word = word + " "
								+ (numberStr.charAt(0) != '0'
										? primaryWords.get(Integer.parseInt(numberStr.charAt(0) + ""))
										: "")
								+ " " + (numberStr.charAt(0) != '0' ? powersOfTens.get(3) : "") + " "
								+ (numberStr.charAt(1) != '0'
										? multipulesOfTen.get(Integer.parseInt(numberStr.charAt(1) + ""))
										: "")
								+ " "
								+ (numberStr.charAt(2) != '0'
										? primaryWords.get(Integer.parseInt(numberStr.charAt(2) + ""))
										: "");
						numberStr = "";
					}
				}
			}
			return word.trim();
		}
	}

	public static HashMap<Integer, String> getPowersOfTen() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(2, "ten");
		hashMap.put(3, "hundred");
		hashMap.put(4, "thousand");
		hashMap.put(5, "thousand");
		hashMap.put(6, "lakh");
		hashMap.put(7, "lakh");
		hashMap.put(8, "crore");
		hashMap.put(9, "crore");

		return hashMap;
	}

	public static HashMap<Integer, String> getMultiplesOfTen() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(2, "twenty");
		hashMap.put(3, "thirty");
		hashMap.put(4, "fourty");
		hashMap.put(5, "fifty");
		hashMap.put(6, "sixty");
		hashMap.put(7, "seventy");
		hashMap.put(8, "eighty");
		hashMap.put(9, "ninty");

		return hashMap;
	}

	public static HashMap<Integer, String> getFirstTwentyWords() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "zero");
		hashMap.put(1, "one");
		hashMap.put(2, "two");
		hashMap.put(3, "three");
		hashMap.put(4, "four");
		hashMap.put(5, "five");
		hashMap.put(6, "six");
		hashMap.put(7, "seven");
		hashMap.put(8, "eight");
		hashMap.put(9, "nine");
		hashMap.put(10, "ten");
		hashMap.put(11, "eleven");
		hashMap.put(12, "twelve");
		hashMap.put(13, "thirteen");
		hashMap.put(14, "fourteen");
		hashMap.put(15, "fifteen");
		hashMap.put(16, "sixteen");
		hashMap.put(17, "seventeen");
		hashMap.put(18, "eighteen");
		hashMap.put(19, "nineteen");
		hashMap.put(20, "twenty");
		hashMap.put(30, "thirty");
		hashMap.put(40, "fourty");
		hashMap.put(50, "fifty");
		hashMap.put(60, "sixty");
		hashMap.put(70, "seventy");
		hashMap.put(80, "eighty");
		hashMap.put(90, "ninty");
		hashMap.put(100, "one hundred");
		return hashMap;
	}
}
