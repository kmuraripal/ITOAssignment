package com.itorizon.assignment.collections;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * This Class having Utility methods based on TreeSet of Assignment1.
 * 
 * @author Krishna Murari Pal
 * @version 1.0.0
 */
public class TreeSetUtil {

	/**
	 * This method create TreeSet and print the element of TreeSet.
	 */
	public static TreeSet<Integer> createTreeSet() {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(43);
		treeSet.add(76);
		treeSet.add(8);
		treeSet.add(126);
		treeSet.add(986);
		
		// iterating over TreeSet
		treeSet.forEach((number) -> {
			System.out.println(number);
		});
		
		return treeSet;
	}

	/**
	 * This method is iterating over the TreeSet
	 * 
	 * @param treeSet set which you want to iterate
	 */
	public static void iterateTreeSet(TreeSet<Integer> treeSet) {
		Iterator<Integer> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}

	/**
	 * This method add all element of treeSet1 to treeSet2.
	 * 
	 * @param treeSet1 set which you want to add all elements in treeSet2.
	 * @param treeSet2 set which you want to append by elements of treeSet1.
	 * @return Updated TreeSet which is treeSet2.
	 */
	public static TreeSet<Integer> addElementsToTreeSet(TreeSet<Integer> treeSet1, TreeSet<Integer> treeSet2) {
		treeSet2.addAll(treeSet1);
		return treeSet2;
	}

	/**
	 * This method print the TreeSet in reverse Order.
	 * 
	 * @param treeSet Set which you want to print in reverse order.
	 */
	public static void reverseOrderView(TreeSet<Integer> treeSet) {
		Iterator<Integer> iterator = treeSet.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	/**
	 * This method return first element of TreeSet.
	 * 
	 * @param treeSet Set in which you want to find first element.
	 * @return Integer value, which is first element in set.
	 */
	public static Integer getFirstElement(TreeSet<Integer> treeSet) {
		return treeSet.first();
	}

	/**
	 * This method return last element of TreeSet.
	 * 
	 * @param treeSet Set in which you want to find last element.
	 * @return Integer value, which is last element in set.
	 */
	public static Integer getLastElement(TreeSet<Integer> treeSet) {
		return treeSet.last();
	}

	/**
	 * This method return size of TreeSet.
	 * 
	 * @param treeSet to get size of set.
	 * @return integer type, which is size of treeSet.
	 */
	public static int getTreeSetSize(TreeSet<Integer> treeSet) {
		return treeSet.size();
	}

	/**
	 * This method return subset of treeSet, having element less then number.
	 * 
	 * @param treeSet to find subset, having less then number.
	 * @param number  specify number, should be less then number.
	 * @return TreeSet, having element less then number.
	 */
	public static TreeSet<Integer> getNumberLessThen(TreeSet<Integer> treeSet, int number) {
		return (TreeSet<Integer>) treeSet.subSet(treeSet.first(), number);
	}

	/**
	 * This method return least element which is greater then or equal to number.
	 * 
	 * @param treeSet in which you want to find element, which is greater then or
	 *                equal to number.
	 * @param number to specify highest number.
	 * @return Integer which is greater then or equal to number.
	 */
	public static Integer getGreterThenEqualTo(TreeSet<Integer> treeSet, int number) {
		return treeSet.ceiling(number);
	}

	/**
	 * This method retrieve and remove first element from TreeSet.
	 * 
	 * @param treeSet in which you want to remove first element from set.
	 * @return Updated TreeSet.
	 */
	public static TreeSet<Integer> retrieveAndRemoveFirstElement(TreeSet<Integer> treeSet) {
		Integer number = treeSet.pollFirst();
		System.out.println(number + " has been removed from Set.");
		return treeSet;
	}

	/**
	 * This method retrieve and remove last element from TreeSet.
	 * 
	 * @param treeSet in which you want to remove last element from set.
	 * @return Updated TreeSet.
	 */
	public static TreeSet<Integer> retrieveAndRemoveLastElement(TreeSet<Integer> treeSet) {
		Integer number = treeSet.pollLast();
		System.out.println(number + " has been removed from Set.");
		return treeSet;
	}

	/**
	 * This method remove element from TreeSet.
	 * 
	 * @param treeSet set in which you want to remove element.
	 * @param number  element which you want to remove from set.
	 * @return true if element removed else false.
	 */
	public static boolean removeElementFromSet(TreeSet<Integer> treeSet, Integer number) {
		return treeSet.remove(number);
	}

}
