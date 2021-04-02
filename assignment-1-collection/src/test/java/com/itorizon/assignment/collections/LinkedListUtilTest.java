package com.itorizon.assignment.collections;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListUtilTest {
	LinkedList<String> studentNames = new LinkedList<String>();
	LinkedList<String> expectedList = new LinkedList<String>();
	
	@BeforeEach
	void initList() {
		studentNames.add("Ben");
		studentNames.add("Eileen");
		studentNames.add("Lynne");
		studentNames.add("Carmen");
		studentNames.add("Addie");
		
		expectedList.add("Ben");
		expectedList.add("Eileen");
		expectedList.add("Lynne");
		expectedList.add("Carmen");
		expectedList.add("Addie");
	}
	
	@Test
	void testCreateLinkedList() {
		assertEquals(expectedList, LinkedListUtil.createLinkedList());
	}

	@Test
	void testAppendLinkedList() {
		expectedList.add("Paddy");
		assertEquals(expectedList, LinkedListUtil.appendLinkedList(studentNames, "Paddy"));
	}

	@Test
	void testInsertElementAtIndex() {
		expectedList.clear();
		expectedList.add("Ben");
		expectedList.add("Eileen");
		expectedList.add("Paddy");
		expectedList.add("Lynne");
		expectedList.add("Carmen");
		expectedList.add("Addie");
		assertEquals(expectedList, LinkedListUtil.insertElementAtIndex(studentNames, 2, "Paddy"));
	}

	@Test
	void testInsertElementAtFirst() {
		expectedList.clear();
		expectedList.add("Paddy");
		expectedList.add("Ben");
		expectedList.add("Eileen");
		expectedList.add("Lynne");
		expectedList.add("Carmen");
		expectedList.add("Addie");
		assertEquals(expectedList, LinkedListUtil.insertElementAtFirst(studentNames, "Paddy"));
	}

	@Test
	void testInsertElementAtEnd() {
		expectedList.clear();
		expectedList.add("Ben");
		expectedList.add("Eileen");
		expectedList.add("Lynne");
		expectedList.add("Carmen");
		expectedList.add("Addie");
		expectedList.add("Paddy");
		assertEquals(expectedList, LinkedListUtil.insertElementAtEnd(studentNames, "Paddy"));
	}

	@Test
	void testRemoveFirstLastElementFromList() {
		expectedList.clear();
		expectedList.add("Eileen");
		expectedList.add("Lynne");
		expectedList.add("Carmen");
		assertEquals(expectedList, LinkedListUtil.removeFirstLastElementFromList(studentNames));
	}

	@Test
	void testRemoveAllElements() {
		expectedList.clear();
		assertEquals(expectedList, LinkedListUtil.removeAllElements(studentNames));
	}

	@Test
	void testJoinTwoLinkedList() {
		LinkedList<String> studentNames2 = new LinkedList<String>();
		studentNames2.add("Paddy");
		studentNames2.add("Rose");
		
		expectedList.add("Paddy");
		expectedList.add("Rose");
		assertEquals(expectedList, LinkedListUtil.joinTwoLinkedList(studentNames, studentNames2));
	}

	@Test
	void testCloneLinkedList() {
		assertEquals(expectedList, LinkedListUtil.cloneLinkedList(studentNames));
	}

	@Test
	void testRemoveFirstElement() {
		assertEquals("Ben", LinkedListUtil.removeFirstElement(studentNames));
	}

	@Test
	void testRetriveFirstElement() {
		assertEquals("Ben", LinkedListUtil.retriveFirstElement(studentNames));
	}

	@Test
	void testIsElementExist() {
		assertTrue(LinkedListUtil.isElementExist(studentNames, "Ben"));
		assertFalse(LinkedListUtil.isElementExist(studentNames, "Colin"));
	}

	@Test
	void testGetAsArrayListFromLinkedList() {
		assertEquals(expectedList, LinkedListUtil.getAsArrayListFromLinkedList(studentNames));
	}

}
