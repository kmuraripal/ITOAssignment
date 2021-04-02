package com.itorizon.assignment.collections;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashMapUtilTest {
	private HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
	
	@BeforeEach
	void initializeMap() {
		studentMap.put(3, "Ben");
		studentMap.put(2, "Eileen");
		studentMap.put(5, "Lynne");
	}

	@Test
	void testGetValue() {
		assertEquals("Eileen", HashMapUtil.getValue(studentMap, 2));
	}

	@Test
	void testGetSize() {
		assertEquals(3, HashMapUtil.getSize(studentMap));
	}

	@Test
	void testCreateCopy() {
		HashMap<Integer, String> expectedMap = new HashMap<Integer, String>();
		expectedMap.put(3, "Ben");
		expectedMap.put(2, "Eileen");
		expectedMap.put(5, "Lynne");
		assertEquals(expectedMap, HashMapUtil.createCopy(studentMap));
	}

	@Test
	void testRemoveAll() {
		HashMap<Integer, String> expectedMap = new HashMap<Integer, String>();
		assertEquals(expectedMap, HashMapUtil.removeAll(studentMap));
	}

	@Test
	void testCheckKeyMapping() {
		assertTrue(HashMapUtil.checkKeyMapping(studentMap, 2));
		assertFalse(HashMapUtil.checkKeyMapping(studentMap, 20));
	}

	@Test
	void testCheckValueMapping() {
		assertTrue(HashMapUtil.checkValueMapping(studentMap, "Lynne"));
		assertFalse(HashMapUtil.checkValueMapping(studentMap, "Carmen"));
	}

	@Test
	void testGetValueForKey() {
		assertEquals("Lynne", HashMapUtil.getValueForKey(studentMap, 5));
	}

	@Test
	void testGetSetView() {
		Set<Integer> expected = new HashSet<Integer>();
		expected.add(3);
		expected.add(2);
		expected.add(5);
		assertEquals(expected, HashMapUtil.getSetView(studentMap));
	}

}
