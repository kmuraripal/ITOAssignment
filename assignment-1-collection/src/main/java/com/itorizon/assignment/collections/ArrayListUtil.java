package com.itorizon.assignment.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class contains utiliy methods ArrayList for Assignment1.
 * 
 * @author Krishna Murari Pal
 * @version 1.0.0
 */
public class ArrayListUtil {
	/**
	 * This method create ArrayList
	 * 
	 * @return studenNames ArrayList
	 */
	public static ArrayList<String> createArrayList() {

		// create a generic ArrayList of type string
		ArrayList<String> studentNames = new ArrayList<String>();

		// add student names to ArrayList studentNames
		studentNames.add("Ben");
		studentNames.add("Eileen");
		studentNames.add("Lynne");
		studentNames.add("Carmen");
		studentNames.add("Addie");

		// print the students list
		for (String name : studentNames) {
			System.out.println(name);
		}
		return studentNames;
	}

	/**
	 * This method iterate over List
	 * 
	 * @param list Takes single ArrayList as parameter of String generic type.
	 */
	public static void iterateArrayList(ArrayList<String> list) {

		// Iterating the ArrayList
		for (String string : list) {
			System.out.println(string);
		}
	}

	/**
	 * This method insert element in list at first index of List
	 * 
	 * @param list    In which we want to insert the element.
	 * @param element Which you want to add at first Index.
	 * @return ArrayList with updated elements.
	 */
	public static ArrayList<String> insertToFirstIndex(ArrayList<String> list, String element) {

		// adding the element at first index
		list.add(0, element);
		return list;
	}

	/**
	 * This method update element by given element at specified position.
	 * 
	 * @param list  In which list you want to update value.
	 * @param index You want to update element.
	 * @param value With value you want to update at specified position.
	 * @return updated ArrayList
	 */
	public static ArrayList<String> updateElementToList(ArrayList<String> list, int index, String value) {

		// updating the value in list
		list.set(index, value);
		return list;
	}

	/**
	 * This method remove third element form list
	 * 
	 * @param list In which you want remove third element.
	 * @return Updated ArrayList.
	 */
	public static ArrayList<String> removeThirdElementFromList(ArrayList<String> list) {

		// Removing third element from list
		list.remove(2);
		return list;
	}

	/**
	 * This method searches element in given list, based on given value in
	 * parameter.
	 * 
	 * @param list  In which list you want to search.
	 * @param value Which value you want to search.
	 * @return boolean type, if element find true, otherwise false.
	 */
	public static boolean searchElementFromList(ArrayList<String> list, String value) {

		// search the element and returning the boolean value
		return list.contains(value);
	}

	/**
	 * This method sort the elements in ascending order.
	 * 
	 * @param list list which you want to sort.
	 * @return list sorted ArrayList.
	 */
	public static ArrayList<String> sortArrayList(ArrayList<String> list) {

		// Sorting the list in ascending order.
		Collections.sort(list);
		return list;
	}

	/**
	 * This Method takes tow list as parameter and copy all element form first
	 * element to second element
	 * 
	 * @param sourceList it is the source list, from which list you want to copy the
	 *                   element.
	 * @param distList   it is the destination list, in which list you want to copy
	 *                   the element.
	 * @return distList return second argument list after copying the element form
	 *         first list.
	 */
	public static ArrayList<String> copyArrayListToAnotherList(ArrayList<String> sourceList,
			ArrayList<String> distList) {

		// Coping the element form sourceList to distList
		for (String string : sourceList) {
			distList.add(string);
		}
		return distList;
	}

	/**
	 * This method reverse the list
	 * 
	 * @param list List which you want to reverse
	 * @return ArrayList in reverse order.
	 */
	public static ArrayList<String> reverseElementOfArrayList(ArrayList<String> list) {

		// Reversing order order of element in list
		Collections.reverse(list);
		return list;
	}

	/**
	 * This method join the two list, which passed in parameter
	 * 
	 * @param list1 List which you want to want to join with list2.
	 * @param list2 List which you want to join with list1.
	 * @return Resulting ArrayList, after joining list1 and list2.
	 */
	public static ArrayList<String> joinArrayList(ArrayList<String> list1, ArrayList<String> list2) {

		// appending the first list with second list elements
		list1.addAll(list2);
		return list1;
	}

	/**
	 * This method clone the list, which passed in parameter
	 * 
	 * @param list list which you want to clone.
	 * @return clonedList, which passed in parameter as argument.
	 */
	public static ArrayList<String> cloneArrayList(ArrayList<String> list) {

		// Cloning the list and assigning to clonedList ArrayList<String>
		ArrayList<String> clonedList = (ArrayList<String>) list.clone();
		return clonedList;
	}

	/**
	 * This method remove all the elements from the list
	 * 
	 * @param list which you want to remove all element
	 * @return Empty ArrayList
	 */
	public static ArrayList<String> emptyList(ArrayList<String> list) {

		// removing all element from list
		list.clear();
		return list;
	}

	/**
	 * This method checks, is list empty or not
	 * 
	 * @param list to check list is empty or not
	 * @return boolean, true if list is empty, false otherwise.
	 */
	public static boolean isEmptyList(ArrayList<String> list) {

		// check list is empty or not, if empty return true otherwise false
		return list.isEmpty();
	}
}
