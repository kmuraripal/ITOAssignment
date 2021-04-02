package com.itorizon.assignment.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

/**
 * This Class having Utility methods based on TreeMap of Assignment1.
 * 
 * @author Krishna Murari Pal
 * @version 1.0.0
 */
public class TreeMapUtil {

	/**
	 * create a TreeMap of <studentId(Integer), studentName(String) Add some student
	 * records with random student ids.
	 * 
	 * @return TreeMap with default initial entries.
	 */
	public static TreeMap<Integer, String> createTreeMap() {
		TreeMap<Integer, String> students = new TreeMap<Integer, String>();
		students.put(23, "John");
		students.put(24, "Jay");
		students.put(25, "Carol");
		students.put(26, "Kelvin");
		students.put(27, "Kenny");
		return students;
	}

	/**
	 * This method returns all keys as set from the given a Tree Map.
	 * 
	 * @param students TreeMap in which you want to get keys as set.
	 * @return keys as Set.
	 */
	public static Set<Integer> getAllKeys(TreeMap<Integer, String> students) {
		return students.keySet();
	}

	/**
	 * This method delete all elements from a given Tree Map.
	 * 
	 * @param students Map which you want to delete all element.
	 * @return empty TreeMap.
	 */
	public static TreeMap<Integer, String> deleteAllElements(TreeMap<Integer, String> students) {
		students.clear();
		return students;
	}

	/**
	 * This method sort keys in Tree Map by using comparator.
	 * 
	 * @param students TreeMap which you want to sort mapping based on key.
	 * @return key as set.
	 */
	public static Set<Integer> sortKeys(TreeMap<Integer, String> students) {
		TreeMap<Integer, String> dummyMap = new TreeMap<Integer, String>(new SortKeyComparator());
		dummyMap.putAll(students);
		return dummyMap.keySet();
	}

	/**
	 * This method returns the first (lowest) key from map students.
	 * 
	 * @param students Map in which you want to get first key.
	 * @return return first key of map students.
	 */
	public static int getFirstKey(TreeMap<Integer, String> students) {
		return students.firstKey();
	}

	/**
	 * This method returns the last (highest) key from map students.
	 * 
	 * @param students Map in which you want to get last key.
	 * @return returns last key of map students.
	 */
	public static int getLastKey(TreeMap<Integer, String> students) {
		return students.lastKey();
	}

	/**
	 * This method returns keys in reverse order view of the keys contained in a
	 * given map.
	 * 
	 * @param students Map to get key in reverse order.
	 * @return keys as Set in reversed order.
	 */
	public static Set<Integer> reverseOrderKeyView(TreeMap<Integer, String> students) {
		Set<Integer> keySet = new HashSet<Integer>(students.descendingKeySet());
		return keySet;
	}

}
