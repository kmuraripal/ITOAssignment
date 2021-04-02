package com.itorizon.assignment;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;


/**
 * 	create StudentId and StudentDetails object and adding to the map
 * */
public class StudentOrg {
	StudentId sId;
	StudentDetail sDetails;

	public static void main(String[] args) {

		LinkedHashMap<StudentId, StudentDetail> studentMap = new LinkedHashMap<StudentId, StudentDetail>();
		StudentId sId1 = new StudentId("ORG112", 2021, 101);
		StudentId sId2 = new StudentId("ORG113", 2015, 242);
		StudentId sId3 = new StudentId("ORG114", 2020, 495);
		StudentId sId4 = new StudentId("ORG115", 2018, 748);
		StudentId sId5 = new StudentId("ORG113", 2016, 703);
		StudentId sId6 = new StudentId("ORG111", 2019, 100);
		StudentId sId7 = new StudentId("ORG112", 2017, 263);
		StudentId sId8 = new StudentId("ORG111", 2015, 930);
		StudentId sId9 = new StudentId("ORG112", 2019, 928);
		StudentId sId10 = new StudentId("ORG113", 2020, 194);

		studentMap.put(sId1, new StudentDetail(sId1, "Olive", "Yew", "23", "Dev", "Java"));
		studentMap.put(sId2, new StudentDetail(sId2, "Aida", "Bugg", "21", "Dev", "Java"));
		studentMap.put(sId3, new StudentDetail(sId3, "Maureen", "Biologist", "18", "Dev", "Java"));
		studentMap.put(sId4, new StudentDetail(sId4, "Allie ", "Grater", "15", "Dev", "Java"));
		studentMap.put(sId5, new StudentDetail(sId5, "Liz ", "Erd", "25", "Dev", "Java"));
		studentMap.put(sId6, new StudentDetail(sId6, "Minnie ", "Van Ryder", "17", "Dev", "Java"));
		studentMap.put(sId7, new StudentDetail(sId7, "Lynn", "O’Leeum", "21", "Dev", "Java"));
		studentMap.put(sId8, new StudentDetail(sId8, "Jack ", "Aranda", "22", "Dev", "Java"));
		studentMap.put(sId9, new StudentDetail(sId9, "Percy ", "Kewshun", "18", "Dev", "Java"));
		studentMap.put(sId10, new StudentDetail(sId10, "Col ", "Yew", "14", "Dev", "Java"));

		studentMap = sortMap(studentMap);
		for (Entry<StudentId, StudentDetail> entry : studentMap.entrySet()) {
			System.out.println(entry.getKey().getYear() + " " + entry.getKey().getDeptCode() + " "
					+ entry.getKey().getId() + " " + entry.getValue().getDeptName() + " "
					+ entry.getValue().getCourseName() + " " + entry.getValue().getFirstName() + " "
					+ entry.getValue().getLastName() + " " + entry.getValue().getAge());
		}

	}

	/**
	 * This method Sort the map based on Student id on their properties, year, deptCode and id.
	 * @param linkedHashMap key = StudentId, value=StudentDetail
	 * @return sorted LinkedHashMap<StudentId, StudentDetail>
	 * */
	public static LinkedHashMap<StudentId, StudentDetail> sortMap(
			LinkedHashMap<StudentId, StudentDetail> linkedHashMap) {
		
		// sorting based on id
		LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>> idMap = new LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>>();
		for (Entry<StudentId, StudentDetail> entry : linkedHashMap.entrySet()) {
			StudentId studentID = entry.getKey();
			int id = studentID.getId();
			if (!idMap.containsKey(id)) {
				idMap.put(id, new ArrayList<Entry<StudentId, StudentDetail>>());
				idMap.get(id).add(entry);
			} else {
				idMap.get(id).add(entry);
			}
		}
		LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>> sortedIdMap = sortDeptIdKeys(idMap);
		
		// sorting based on deptCode
		LinkedHashMap<String, ArrayList<Entry<StudentId, StudentDetail>>> deptMap = new LinkedHashMap<String, ArrayList<Entry<StudentId, StudentDetail>>>();
		for (Entry<Integer, ArrayList<Entry<StudentId, StudentDetail>>> entry : sortedIdMap.entrySet()) {
			for (int i = 0; i < entry.getValue().size(); i++) {
				String deptCode = entry.getValue().get(i).getKey().deptCode;
				if (!deptMap.containsKey(deptCode)) {
					deptMap.put(deptCode, new ArrayList<Entry<StudentId, StudentDetail>>());
					deptMap.get(deptCode).add(entry.getValue().get(i));
				} else {
					deptMap.get(deptCode).add(entry.getValue().get(i));
				}
			}
		}
		LinkedHashMap<String, ArrayList<Entry<StudentId, StudentDetail>>> sortedDeptCodeMap = sortDeptCodeKeys(deptMap);
		
		// sorting base on year
		LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>> yearMap = new LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>>();
		for (Entry<String, ArrayList<Entry<StudentId, StudentDetail>>> entry : sortedDeptCodeMap.entrySet()) {
			for (int i = 0; i < entry.getValue().size(); i++) {
				int year = entry.getValue().get(i).getKey().getYear();
				if (!yearMap.containsKey(year)) {
					yearMap.put(year, new ArrayList<Entry<StudentId, StudentDetail>>());
					yearMap.get(year).add(entry.getValue().get(i));
				} else {
					yearMap.get(year).add(entry.getValue().get(i));
				}
			}
		}
		LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>> sortedYearMap = sortYearKeys(yearMap);
		LinkedHashMap<StudentId, StudentDetail> resultMap = new LinkedHashMap<StudentId, StudentDetail>();

		for (Entry<Integer, ArrayList<Entry<StudentId, StudentDetail>>> entry : sortedYearMap.entrySet()) {
			for (int j = 0; j < entry.getValue().size(); j++) {
				resultMap.put(entry.getValue().get(j).getKey(), entry.getValue().get(j).getValue());
			}
		}

		return resultMap;
	}

	/**
	 * 
	 */
	public static LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>> sortYearKeys(
			LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>> map) {
		TreeMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>> treeMap = new TreeMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>>(
				map);
		LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>> map2 = new LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>>(
				treeMap);
		return map2;
	}
	/**
	 *  
	 */
	public static LinkedHashMap<String, ArrayList<Entry<StudentId, StudentDetail>>> sortDeptCodeKeys(
			LinkedHashMap<String, ArrayList<Entry<StudentId, StudentDetail>>> map) {
		TreeMap<String, ArrayList<Entry<StudentId, StudentDetail>>> treeMap = new TreeMap<String, ArrayList<Entry<StudentId, StudentDetail>>>(
				map);
		LinkedHashMap<String, ArrayList<Entry<StudentId, StudentDetail>>> map2 = new LinkedHashMap<String, ArrayList<Entry<StudentId, StudentDetail>>>(
				treeMap);
		return map2;
	}
	
	/**
	 * 
	 */
	public static LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>> sortDeptIdKeys(
			LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>> map) {
		TreeMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>> treeMap = new TreeMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>>(
				map);
		LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>> map2 = new LinkedHashMap<Integer, ArrayList<Entry<StudentId, StudentDetail>>>(
				treeMap);
		return map2;
	}

}
