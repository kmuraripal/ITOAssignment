package com.itorizon.assignment.collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class ArrayListUtilTest {

	// create a generic ArrayList of type string
	ArrayList<String> studentNames = new ArrayList<String>();
	ArrayList<String> studentNames2 = new ArrayList<String>();
	ArrayListUtil arrayListUtilMock = mock(ArrayListUtil.class);
	
	@Autowired
	ArrayListUtil arrayListUtil;

	@BeforeEach
	void initializeArrayList() {
		// add student names to ArrayList studentNames
		studentNames.add("Ben");
		studentNames.add("Eileen");
		studentNames.add("Lynne");
		studentNames.add("Carmen");
		studentNames.add("Addie");
		
		studentNames2.add("Rick");
		studentNames2.add("Peter");
	}

	@Test
	void testCreateArrayList() {
		assertEquals(studentNames, ArrayListUtil.createArrayList());
	}

	@Test
	void testInsertToFirstIndex() {
		ArrayList<String> expectedStudentNames = new ArrayList<String>();
		expectedStudentNames.add("Gail");
		expectedStudentNames.add("Ben");
		expectedStudentNames.add("Eileen");
		expectedStudentNames.add("Lynne");
		expectedStudentNames.add("Carmen");
		expectedStudentNames.add("Addie");
		assertEquals(expectedStudentNames, ArrayListUtil.insertToFirstIndex(studentNames, "Gail"));
	}

	@Test
	void testUpdateElementToList() {
		ArrayList<String> expectedStudentNames = new ArrayList<String>();
		expectedStudentNames.add("Ben");
		expectedStudentNames.add("Eileen");
		expectedStudentNames.add("Gail");
		expectedStudentNames.add("Carmen");
		expectedStudentNames.add("Addie");
		assertEquals(expectedStudentNames, ArrayListUtil.updateElementToList(studentNames, 2, "Gail"));
	}

	@Test
	void testRemoveThirdElementFromList() {
		ArrayList<String> expectedStudentNames = new ArrayList<String>();
		expectedStudentNames.add("Ben");
		expectedStudentNames.add("Eileen");
		expectedStudentNames.add("Carmen");
		expectedStudentNames.add("Addie");
		assertEquals(expectedStudentNames, ArrayListUtil.removeThirdElementFromList(studentNames));
	}

	@Test
	void testSearchElementFromList() {
		assertTrue(ArrayListUtil.searchElementFromList(studentNames, "Carmen"));
		assertFalse(ArrayListUtil.searchElementFromList(studentNames, "Gail"));
	}

	@Test
	void testSortArrayList() {
		ArrayList<String> expectedStudentNames = new ArrayList<String>();
		expectedStudentNames.add("Addie");
		expectedStudentNames.add("Ben");
		expectedStudentNames.add("Carmen");
		expectedStudentNames.add("Eileen");
		expectedStudentNames.add("Lynne");
		assertEquals(expectedStudentNames, ArrayListUtil.sortArrayList(studentNames));
		
	}

	@Test
	void testCopyArrayListToAnotherList() {
		ArrayList<String> copyList = new ArrayList<String>();
		ArrayList<String> expectedStudentNames = new ArrayList<String>();
		expectedStudentNames.add("Ben");
		expectedStudentNames.add("Eileen");
		expectedStudentNames.add("Lynne");
		expectedStudentNames.add("Carmen");
		expectedStudentNames.add("Addie");
		assertEquals(expectedStudentNames, ArrayListUtil.copyArrayListToAnotherList(studentNames, copyList));
	}

	@Test
	void testReverseElementOfArrayList() {
		ArrayList<String> expectedStudentNames = new ArrayList<String>();
		expectedStudentNames.add("Addie");
		expectedStudentNames.add("Carmen");
		expectedStudentNames.add("Lynne");
		expectedStudentNames.add("Eileen");
		expectedStudentNames.add("Ben");
		assertEquals(expectedStudentNames, ArrayListUtil.reverseElementOfArrayList(studentNames));
	}

	@Test
	void testJoinArrayList() {
		ArrayList<String> expectedStudentNames = new ArrayList<String>();
		expectedStudentNames.add("Ben");
		expectedStudentNames.add("Eileen");
		expectedStudentNames.add("Lynne");
		expectedStudentNames.add("Carmen");
		expectedStudentNames.add("Addie");
		expectedStudentNames.add("Rick");
		expectedStudentNames.add("Peter");
		assertEquals(expectedStudentNames, ArrayListUtil.joinArrayList(studentNames, studentNames2));
	}

	@Test
	void testCloneArrayList() {
		ArrayList<String> expectedStudentNames = new ArrayList<String>();
		expectedStudentNames.add("Ben");
		expectedStudentNames.add("Eileen");
		expectedStudentNames.add("Lynne");
		expectedStudentNames.add("Carmen");
		expectedStudentNames.add("Addie");
		assertEquals(expectedStudentNames, ArrayListUtil.cloneArrayList(studentNames));
	}

	@Test
	void testEmptyList() {
		ArrayList<String> expectedStudentNames = new ArrayList<String>();
		assertEquals(expectedStudentNames, ArrayListUtil.emptyList(studentNames));
	}

	@Test
	void testIsEmptyList() {
		ArrayList<String> emptyList = new ArrayList<String>();
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ben");
		assertTrue(ArrayListUtil.isEmptyList(emptyList));
		assertFalse(ArrayListUtil.isEmptyList(list));
	}

}
