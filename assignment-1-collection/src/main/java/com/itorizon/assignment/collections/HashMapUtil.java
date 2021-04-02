package com.itorizon.assignment.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * This Class having Utility methods based on HashMap of Assignment1.
 * 
 * @author Krishna Murari Pal
 * @version 1.0.0
 */
public class HashMapUtil {

	/**
	 * This method create a HashMap of key as student id(Integer) and value as
	 * Student name (String). Add some entries and print the hash map.
	 */
	public static void createHashMap() {
		// create hash map
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(1, "John");
		students.put(2, "Ben");
		students.put(3, "Eileen");
		students.put(4, "Kelvin");
		students.put(5, "Addie");
		// print the hash map
		for (Map.Entry<Integer, String> e : students.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

	/**
	 * This method iterate over all the entries in the HashMap.
	 * 
	 * @param students it HashMap, where key is Integer type and value is String
	 *                 type
	 */
	public static void iterateHashMap(HashMap<Integer, String> students) {
		// iterate using for loop
		for (Map.Entry<Integer, String> e : students.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

	/**
	 * This method get the specified value with the specified key in a HashMap.
	 * 
	 * @param students Map in which you want to get value of key, where key is
	 *                 Integer type and value is String type
	 * @param key      to find associated value.
	 * @return value mapped with key.
	 */
	public static String getValue(HashMap<Integer, String> students, int key) {
		String val = students.get(key);
		return val;
	}

	/**
	 * This method count the number of key-value (size) mappings in a map.
	 * 
	 * @param students Map to get size.
	 * @return size of map.
	 */
	public static int getSize(HashMap<Integer, String> students) {
		return students.size();
	}

	/**
	 * This method copy all of the mappings from the specified Map to another map
	 * and return the new Map.
	 * 
	 * @param students source Map, which you want to make copy.
	 * @return new Map from source Map students.
	 */
	public static HashMap<Integer, String> createCopy(HashMap<Integer, String> students) {
		HashMap<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.putAll(students);
		return newMap;

	}

	/**
	 * This method remove all of the mappings from a map
	 * 
	 * @param students map which you want to remove all element.
	 * @return empty HashMap.
	 */
	public static HashMap<Integer, String> removeAll(HashMap<Integer, String> students) {
		students.clear();
		return students;
	}

	/**
	 * This method test if a map contains a mapping for the specified key.
	 * 
	 * @param students Map in which you want to check key.
	 * @param key      To check in Map.
	 * @return true if key is available otherwise false.
	 */
	public static boolean checkKeyMapping(HashMap<Integer, String> students, int key) {
		return students.containsKey(key);
	}

	/**
	 * This method test if a map contains a mapping for the specified value.
	 * 
	 * @param students Map in which want to check value.
	 * @param value    this is the key in which you want to check in the Map
	 *                 students.
	 * @return true if value is available otherwise false.
	 */
	public static boolean checkValueMapping(HashMap<Integer, String> students, String value) {
		return students.containsValue(value);
	}

	/**
	 * This method get the value of a specified key in a map.
	 * 
	 * @param students Map in which you want to get value based on key.
	 * @param key      to find Mapping in map students.
	 * @return string type, value associated with key, if key is not mapped the
	 *         return default value as Key has not Mapped.
	 */
	public static String getValueForKey(HashMap<Integer, String> students, int key) {
		return students.getOrDefault(key, "Key has not Mapped");
	}

	/**
	 * This method returns a set view of the keys contained in this map.
	 * 
	 * @param students Map that you want to get key set.
	 * @return key set of Map students.
	 */
	public static Set<Integer> getSetView(HashMap<Integer, String> students) {
		Set<Integer> keyset = students.keySet();
		return keyset;

	}

	/**
	 * This method return collection view of the values contained in this map.
	 * 
	 * @param students Map to get Collection view of values.
	 * @return collection array.
	 */
	public static Collection<String> getCollectionView(HashMap<Integer, String> students) {
		return students.values();
	}
}
