package com.itorizon.assignment.collections;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashSetUtilTest {
	HashSet<String> hashSet = new HashSet<String>();
	
	@BeforeEach
	void initialiseSet() {
		hashSet.add("Ben");
		hashSet.add("Eileen");
		hashSet.add("Lynne");
		hashSet.add("Carmen");
		hashSet.add("Addie");
	}
	
	@Test
	void testCreateHashSet() {
		assertEquals(hashSet, HashSetUtil.createHashSet());
	}

	@Test
	void testInsertAtEnd() {
		HashSet<String> expected = new HashSet<String>();
		expected.add("Ben");
		expected.add("Eileen");
		expected.add("Lynne");
		expected.add("Carmen");
		expected.add("Addie");
		expected.add("peter");
		assertEquals(hashSet, HashSetUtil.insertAtEnd(hashSet, "peter"));
	}

	@Test
	void testGetElementCount() {
		assertEquals(5, HashSetUtil.getElementCount(hashSet));
	}

	@Test
	void testEmptyHashSet() {
		HashSet<String> expected = new HashSet<String>();
		assertEquals(expected, HashSetUtil.emptyHashSet(hashSet));
	}

	@Test
	void testGetAsArray() {
		Object[] expected = {"Ben", "Eileen", "Lynne", "Carmen", "Addie"};
		assertTrue(HashSetUtil.getAsArray(hashSet).length==expected.length);
	}

	@Test
	void testGetAsListFromHashSet() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Ben");
		expected.add("Eileen");
		expected.add("Lynne");
		expected.add("Carmen");
		expected.add("Addie");
		assertEquals(expected.size(), HashSetUtil.getAsListFromHashSet(hashSet).size());
	}

	@Test
	void testCompareHashSet() {
		HashSet<String> hashSet2 = new HashSet<String>();
		hashSet2.add("Ben");
		hashSet2.add("Eileen");
		hashSet2.add("Lynne");
		hashSet2.add("Carmen");
		hashSet2.add("Addie");
		assertTrue(HashSetUtil.compareHashSet(hashSet, hashSet2));
	}

	@Test
	void testRetainElementsFormSets() {
		HashSet<String> hashSet2 = new HashSet<String>();
		hashSet2.add("Ben");
		hashSet2.add("Eileen");
		hashSet2.add("Lynne");
		hashSet2.add("Carmen");
		hashSet2.add("Addie");
		hashSet2.add("Paddy");
		
		HashSet<String> expected = new HashSet<String>();
		expected.add("Ben");
		expected.add("Eileen");
		expected.add("Lynne");
		expected.add("Carmen");
		expected.add("Addie"); 
		assertEquals(expected, HashSetUtil.retainElementsFormSets(hashSet, hashSet2));
		
	}

	@Test
	void testRemoveAllElements() {
		HashSet<String> expected = new HashSet<String>();
		assertEquals(expected, HashSetUtil.removeAllElements(hashSet));
	}

}
