package com.itorizon.assignment;

public class StudentId {
	 String deptCode;
	 int year;
	 int id;
	
	public StudentId(String deptCode, int year, int id) {
		this.deptCode = deptCode;
		this.year = year;
		this.id = id;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
