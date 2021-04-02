package com.itorizon.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class DateBandTest {

	@Test
	void testFindOverlappingBand() {
		DateBand db = new DateBand();
		DateBand db1 = new DateBand(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 31));
		DateBand db2 = new DateBand(LocalDate.of(2020, 1, 15), LocalDate.of(2020, 2, 12));
		assertEquals(LocalDate.of(2020, 1, 31), db.findOverlappingBand(db1, db2).getEndDate());
		assertEquals(LocalDate.of(2020, 1, 15), db.findOverlappingBand(db1, db2).getStartDate());
	}

}
