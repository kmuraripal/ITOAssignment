package com.itorizon.assignment.collections;

import java.util.Comparator;

/**
 * This is the comparator class implements Comparator
 * 
 * @author Krishna Murari Pal
 * @version 1.0.0
 */
public class SortKeyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}

}
