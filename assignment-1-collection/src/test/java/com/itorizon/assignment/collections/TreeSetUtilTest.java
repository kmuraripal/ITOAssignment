package com.itorizon.assignment.collections;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeSetUtilTest {
	TreeSet<Integer> treeSet = new TreeSet<Integer>();
	TreeSet<Integer> expectedSet = new TreeSet<Integer>();
	
	@BeforeEach
	void initSet() {
		treeSet.add(43);
		treeSet.add(5);
		treeSet.add(8);
		treeSet.add(2);
		treeSet.add(986);
		
		expectedSet.add(43);
		expectedSet.add(5);
		expectedSet.add(8);
		expectedSet.add(2);
		expectedSet.add(986);
	}

	@Test
	void testAddElementsToTreeSet() {
		TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
		assertEquals(expectedSet, TreeSetUtil.addElementsToTreeSet(treeSet, treeSet2));
	}

	@Test
	void testGetFirstElement() {
		assertEquals(2, TreeSetUtil.getFirstElement(treeSet));
	}

	@Test
	void testGetLastElement() {
		assertEquals(986, TreeSetUtil.getLastElement(treeSet));
	}

	@Test
	void testGetTreeSetSize() {
		assertEquals(5, TreeSetUtil.getTreeSetSize(treeSet));
	}

	@Test
	void testGetNumberLessThen() {
		TreeSet<Integer> expectedTreeSet = new TreeSet<Integer>();
		expectedTreeSet.add(2);
		expectedTreeSet.add(5);
		assertEquals(expectedTreeSet, TreeSetUtil.getNumberLessThen(treeSet, 7));
	}

	@Test
	void testGetGreterThenEqualTo() {
		assertEquals(8, TreeSetUtil.getGreterThenEqualTo(treeSet, 7));
	}

	@Test
	void testRetrieveAndRemoveFirstElement() {
		expectedSet.clear();
		expectedSet.add(43);
		expectedSet.add(5);
		expectedSet.add(8);
		expectedSet.add(986);
		assertEquals(expectedSet, TreeSetUtil.retrieveAndRemoveFirstElement(treeSet));
	}

	@Test
	void testRetrieveAndRemoveLastElement() {
		expectedSet.clear();
		expectedSet.add(43);
		expectedSet.add(5);
		expectedSet.add(8);
		expectedSet.add(2);
		assertEquals(expectedSet, TreeSetUtil.retrieveAndRemoveLastElement(treeSet));
	}

	@Test
	void testRemoveElementFromSet() {
		assertTrue(TreeSetUtil.removeElementFromSet(treeSet, 43));
		assertFalse(TreeSetUtil.removeElementFromSet(treeSet, 430));
	}

}
