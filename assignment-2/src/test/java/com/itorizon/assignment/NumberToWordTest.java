package com.itorizon.assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberToWordTest {

	@Test
	void testGetNumberToWord() {
		assertEquals("two thousand seventy four", NumberToWord.getNumberToWord(2074));
	}
	
	@Test
	void testGetNumberToWordT2() {
		assertEquals("one thousand four", NumberToWord.getNumberToWord(1004));
	}
	
	@Test
	void testGetNumberToWordT3() {
		assertEquals("one thousand nine hundred  one", NumberToWord.getNumberToWord(1901));
	}
}
