package com.itorizon.assignment.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeMapUtilTest {
	TreeMap<Integer, String> students = new TreeMap<Integer, String>();
	TreeMap<Integer, String> expected = new TreeMap<Integer, String>();
	
	@BeforeEach
	void initMap() {
		students.put(23, "John");
		students.put(24, "Jay");
		students.put(25, "Carol");
		students.put(26, "Kelvin");
		students.put(27, "Kenny");
		
		expected.put(23, "John");
		expected.put(24, "Jay");
		expected.put(25, "Carol");
		expected.put(26, "Kelvin");
		expected.put(27, "Kenny");
	}
	
	@Test
	void testCreateTreeMap() {
		assertEquals(expected, TreeMapUtil.createTreeMap());
	}

	@Test
	void testGetAllKeys() {
		assertEquals(expected.keySet(), TreeMapUtil.getAllKeys(students));
	}

	@Test
	void testDeleteAllElements() {
		expected.clear();
		assertEquals(expected, TreeMapUtil.deleteAllElements(students));
	}

	@Test
	void testSortKeys() {
		assertEquals(expected.keySet(), TreeMapUtil.sortKeys(students));
	}

	@Test
	void testGetFirstKey() {
		assertEquals(23, TreeMapUtil.getFirstKey(students));
	}

	@Test
	void testGetLastKey() {
		assertEquals(27, TreeMapUtil.getLastKey(students));
	}

	@Test
	void testReverseOrderKeyView() {
		Set<Integer> expectedKeySet = new HashSet<Integer>();
		expectedKeySet.add(27);
		expectedKeySet.add(26);
		expectedKeySet.add(25);
		expectedKeySet.add(24);
		expectedKeySet.add(23);
		assertEquals(expectedKeySet, TreeMapUtil.reverseOrderKeyView(students));
	}

}
