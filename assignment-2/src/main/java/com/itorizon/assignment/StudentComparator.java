package com.itorizon.assignment;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StudentComparator implements Comparator<StudentId>{

	@Override
	public int compare(StudentId o1, StudentId o2) {
		return (o1.year + "").compareTo((o2.year + ""));
	}
}
