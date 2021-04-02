package com.itorizon.assignment;

import java.time.LocalDate;

import com.itorizon.assignment.exception.NoOverlappingBandFound;
/**
 * This class defines Date band between two dates
 * @author Krishna Murari Pal
 * @version 1.0.0
 */
public class DateBand {
	LocalDate startDate;
	LocalDate endDate;
	
	/**
	 * No arg constructor
	 * */
	public DateBand() {
	}
	
	/**
	 * initialize object of DateBand
	 * */
	public DateBand(LocalDate startDate, LocalDate endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	/**
	 * @return startDate as LocalDate 
	 */
	public LocalDate getStartDate() {
		return startDate;
	}
	
	/**
	 * @param startDate set value to startDate 
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	/**
	 * @return endDate as LocalDate type
	 * */
	public LocalDate getEndDate() {
		return endDate;
	}
	
	/**
	 * Set value to endDate
	 * @param endDate LocalDate 
	 * */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	/**
	 * This function checks overlapping band between two Object of type DateBand type.
	 * @param db1 DateBand object.
	 * @param db2 DateBand object.
	 */
	public DateBand  findOverlappingBand(DateBand db1, DateBand db2){
		
		// assigning the all LocalDate in localDates array.
		LocalDate[] localDates = {db1.getStartDate(), db2.getStartDate(), db1.getEndDate(), db2.getEndDate()};
		
		LocalDate minDate = db1.getStartDate();
		LocalDate maxDate = db1.getEndDate();
		LocalDate dt1 = null; 
		LocalDate dt2 = null;
		
		// getting minimum earlier value date and newest value date.
		for (int i = 0; i < localDates.length; i++) {
			if(localDates[i].isBefore(minDate)) {
				minDate = localDates[i];
			}
			if (localDates[i].isAfter(maxDate)) {
				maxDate = localDates[i];
			}
		}
		
		// checking overlapping date.
		for (int i = 0; i < localDates.length; i++) {
			if (localDates[i].isAfter(minDate) && localDates[i].isBefore(maxDate) && dt1 == null) {
				dt1 = localDates[i];
			} else if (localDates[i].isAfter(minDate) && localDates[i].isBefore(maxDate)) {
				dt2 = localDates[i];
			}
		}
		
		// if date is not overlapping, throw NoOverlappingBandFund Exception.
		if(dt1 == null || dt2 == null) {
			throw new NoOverlappingBandFound("Try different date");
		}
		
		//returning overlapping date as DateBand object.
		if(dt2.isBefore(dt1)) {
			return new DateBand(dt2, dt1);
		} else {
			return new DateBand(dt1, dt2);
		}
		
	}
}
