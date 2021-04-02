package com.itorizon.assignment.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * This Class contains utility method of HashSet of Assignment1.
 * 
 * @author Krishna Murari Pal
 * @version 1.0.0
 */
public class HashSetUtil {

	/**
	 * This method create and return HashSet with default value.
	 * 
	 * @return HashSet with default element.
	 */
	public static HashSet<String> createHashSet() {
		HashSet<String> studentNames = new HashSet<String>();

		// add student names to HashSet
		studentNames.add("Ben");
		studentNames.add("Eileen");
		studentNames.add("Lynne");
		studentNames.add("Carmen");
		studentNames.add("Addie");
		return studentNames;
	}

	/**
	 * This method append append the specified element to the HashSet
	 * 
	 * @param studentNames Set in which you want to add new element.
	 * @param studentName  String which you want to add in studentNames HashSet.
	 * @return Update HashSet.
	 */
	public static HashSet<String> insertAtEnd(HashSet<String> studentNames, String studentName) {

		// adding the element ot the Hashset
		studentNames.add(studentName);
		return studentNames;
	}

	/**
	 * This method iterate over the HashSet and print the element in HashSet.
	 * 
	 * @param hashSet which you want to iterate.
	 */
	public static void iterateHashSet(HashSet<String> hashSet) {

		// iterating over the HashSet
		for (String string : hashSet) {
			System.out.println(string);
		}
	}

	/**
	 * This method return number of element available in HashSet.
	 * 
	 * @param hashSet set which you want to count the element.
	 * @return element count of element in HashSet.
	 */
	public static int getElementCount(HashSet<String> hashSet) {
		return hashSet.size();
	}

	/**
	 * This method remove all element available in HashSet
	 * 
	 * @param hashSet set which you want to remove all element.
	 * @return Empty HashSet
	 */
	public static HashSet<String> emptyHashSet(HashSet<String> hashSet) {
		hashSet.clear();
		return hashSet;
	}

	/**
	 * This method return array of HashSet passed as argument.
	 * 
	 * @param hashset Set which you want to get as Array.
	 * @return Object Array with element of hashSet.
	 */
	public static Object[] getAsArray(HashSet<String> hashset) {
		return hashset.toArray();
	}

	/**
	 * This method return ArrayList by taking argument as HashSet
	 * 
	 * @param hashSet Set which you to get as List
	 * @return List, with having element of hashSet.
	 */
	public static List<String> getAsListFromHashSet(HashSet<String> hashSet) {
		return new ArrayList<String>(hashSet);
	}

	/**
	 * This method compare two HashSet.
	 * 
	 * @param hashSet1 which you want compare with hashSet2.
	 * @param hashSet2 which you want compare with hashSet1.
	 * @return true if both set having same element otherwise false.
	 */
	public static boolean compareHashSet(HashSet<String> hashSet1, HashSet<String> hashSet2) {
		return hashSet1.equals(hashSet2);
	}

	/**
	 * This method return common element HashSet which are available in both
	 * hashSet1 and hashSet2.
	 * 
	 * @param hashSet1 which you want compare with hashSet2.
	 * @param hashSet2 which you want compare with hashSet1.
	 * @return HashSet, having common element in both HashSet hashSet1 and hashSet2.
	 */
	public static HashSet<String> retainElementsFormSets(HashSet<String> hashSet1, HashSet<String> hashSet2) {
		HashSet<String> commanSet = new HashSet<String>();

		// checking the element in hashSet2
		for (String string : hashSet1) {
			if (hashSet2.contains(string)) {
				commanSet.add(string);
			}
		}
		return commanSet;
	}

	/**
	 * This method remove all elements form HashSet, passed as argument.
	 * 
	 * @param hashSet which you want to make empty.
	 * @return empty HashSet.
	 */
	public static HashSet<String> removeAllElements(HashSet<String> hashSet) {

		// removing all element
		hashSet.clear();
		return hashSet;
	}

}
