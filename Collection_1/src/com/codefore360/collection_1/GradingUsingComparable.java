package com.codefore360.collection_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradingUsingComparable implements Comparable<GradingUsingComparable> {
	
	public int marks;
	public String grade;
	
	public GradingUsingComparable() {
		
	}
	
	
	public GradingUsingComparable(int marks, String grade) {
		
		this.marks = marks;
		this.grade = grade;
	}
	
	public int compareTo(GradingUsingComparable student) {
		 return this.marks - student.marks;
	}
	
	public int getMarks() {
		return marks;
	}
	public String getGrade() {
		return grade;
	}
	
	public void doComparableImplementation() {
		
		List<GradingUsingComparable> tempList = new ArrayList<GradingUsingComparable>();
		
		tempList.add(new GradingUsingComparable(90,"B+"));
		tempList.add(new GradingUsingComparable(85,"A-"));
		tempList.add(new GradingUsingComparable(96,"A"));
		tempList.add(new GradingUsingComparable(98,"A+"));
		
		Collections.sort(tempList);
	
		System.out.println("Comparable Implementation");
		for(GradingUsingComparable temp: tempList) {
			System.out.println(temp.getMarks()+" "+temp.getGrade());
		}
		
		
	}
}
