package com.itorizon.assignment.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This Class having Utility methods based on LinkedList of Assignment1.
 * 
 * @author Krishna Murari Pal
 * @version 1.0.0
 */
public class LinkedListUtil {

	/**
	 * This method create a new Linked list containing student names, add some
	 * student (string) and print out the collection.
	 * 
	 * @return studentNames LinkedList with default elements.
	 */
	public static LinkedList<String> createLinkedList() {
		LinkedList<String> studentNames = new LinkedList<String>();

		// add student names to linkedlist
		studentNames.add("Ben");
		studentNames.add("Eileen");
		studentNames.add("Lynne");
		studentNames.add("Carmen");
		studentNames.add("Addie");
		return studentNames;
	}

	/**
	 * This method add element to the end of list
	 * 
	 * @param list  List in which you want to add the.
	 * @param value String value, which you want to add in list
	 * @return list with added specified value.
	 */
	public static LinkedList<String> appendLinkedList(LinkedList<String> list, String value) {

		// adding element to the end of list
		list.addLast(value);
		return list;
	}

	/**
	 * This method iterate the list and print its element.
	 * 
	 * @param list Which you want to iterate and print
	 */
	public static void iterateElements(LinkedList<String> list) {

		// getting iterator
		Iterator<String> iterator = list.iterator();

		// iterating the list
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	/**
	 * This method iterate the list from specified position
	 * 
	 * @param list  Which you want to iterate
	 * @param index From where you want to start iteration of list
	 */
	public static void iterateElementsFromPosition(LinkedList<String> list, int index) {

		// getting iterator from specified index
		Iterator<String> iterator = list.listIterator(index);

		// iterating iterator
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	/**
	 * This method iterate the list in reverse order
	 * 
	 * @param list Which you want to iterate in reverse order
	 */
	public static void iterateReverseElements(LinkedList<String> list) {

		// getting iterator in reverse order
		Iterator<String> iterator = list.descendingIterator();

		// Iterating iterator
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	/**
	 * This method insert element in list at specified position.
	 * 
	 * @param list  In which you want to insert the element.
	 * @param index Position, where you want to insert the element.
	 * @param value Element which you want to insert
	 * @return LinkedList with updated values.
	 */
	public static LinkedList<String> insertElementAtIndex(LinkedList<String> list, int index, String value) {

		// adding the element at specified index
		list.add(index, value);

		return list;
	}

	/**
	 * This method insert the element at first index of list
	 * 
	 * @param list  In which list you want to insert the element
	 * @param value Element you want to insert
	 * @return LinkedList with updated values.
	 */
	public static LinkedList<String> insertElementAtFirst(LinkedList<String> list, String value) {

		// adding the element at front of list
		list.offerFirst(value);
		return list;
	}

	/**
	 * This method insert element at the last of list
	 * 
	 * @param list  In which list you want to insert the element.
	 * @param value Element you want to insert.
	 * @return LinkedList with updated values.
	 */
	public static LinkedList<String> insertElementAtEnd(LinkedList<String> list, String value) {

		// adding element to the end of list
		list.addLast(value);
		return list;
	}

	/**
	 * This method display element value and element position.
	 * 
	 * @param list    In which you want get the position of element.
	 * @param element Which you want to find in list.
	 */
	public static void displayElementAndPosition(LinkedList<String> list, String element) {

		// checking element is available or not
		if (list.indexOf(element) >= 0) {
			System.out.println(element + " is present at index " + (list.indexOf(element)));
		} else {
			System.out.println("Specified element not found !");
		}
	}

	/**
	 * This method remove first and last element from list.
	 * 
	 * @param list You want to remove first and last element.
	 * @return LinkedList after removing first and last index.
	 */
	public static LinkedList<String> removeFirstLastElementFromList(LinkedList<String> list) {

		list.removeFirst(); // removing first element
		list.removeLast(); // removing last element
		return list;
	}

	/**
	 * This method removes all elements from the list
	 * 
	 * @param list you want to empty.
	 * @return Empty LinkedList.
	 */
	public static LinkedList<String> removeAllElements(LinkedList<String> list) {

		list.clear(); // removing the all element from list
		return list;
	}

	/**
	 * This method join two lists.
	 * 
	 * @param list1 which you want to join with list2.
	 * @param list2 which you want to join with list1.
	 * @return LinkedList, Result of joining list1 and list2.
	 */
	public static LinkedList<String> joinTwoLinkedList(LinkedList<String> list1, LinkedList<String> list2) {

		// adding all element of list2 in list1
		list1.addAll(list2);
		return list1;
	}

	/**
	 * This method clone the list.
	 * 
	 * @param list which you want to clone.
	 * @return Cloned LinkedList.
	 */
	public static LinkedList<String> cloneLinkedList(LinkedList<String> list) {

		// cloning the list
		LinkedList<String> clonedList = (LinkedList<String>) list.clone();

		return clonedList;
	}

	/**
	 * This method remove first element from list and return element, which removed.
	 * 
	 * @param list which you want to remove first element.
	 * @return element which is removed.
	 */
	public static String removeFirstElement(LinkedList<String> list) {

		// removing and returning first element
		return list.removeFirst();
	}

	/**
	 * This method retrieve first element from list
	 * 
	 * @param list In which you want to get first element.
	 * @return First element.
	 */
	public static String retriveFirstElement(LinkedList<String> list) {

		// returning first element
		return list.peekFirst();
	}

	/**
	 * This method checks, is element available in the list or not?
	 * 
	 * @param list    In which you want to check the element availability.
	 * @param element To check in the list.
	 * @return boolean type, if available true otherwise false.
	 */
	public static boolean isElementExist(LinkedList<String> list, String element) {

		if (list.indexOf(element) >= 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method convert the list from LinkedList to ArrayList Type
	 * 
	 * @param list which you want to convert to ArrayList type.
	 * @return Converted ArrayList from LinkedList type.
	 */
	public static ArrayList<String> getAsArrayListFromLinkedList(LinkedList<String> list) {

		// returning list as ArrayList
		return new ArrayList<String>(list);
	}
}
