package com.codefore360.collection_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarksUsingComparator implements Comparator<GradingUsingComparable>{

	public int compare(GradingUsingComparable compare1, GradingUsingComparable compare2) {
		
		return compare1.marks-compare2.marks;

	}
	
	public void doComparatorImplementation() {
		

		List<GradingUsingComparable> tempList = new ArrayList<GradingUsingComparable>();
		
		tempList.add(new GradingUsingComparable(90,"B+"));
		tempList.add(new GradingUsingComparable(85,"A-"));
		tempList.add(new GradingUsingComparable(96,"A"));
		tempList.add(new GradingUsingComparable(98,"A+"));
		
		Collections.sort(tempList, new MarksUsingComparator());
		
		System.out.println("Comaparator Implementation");
		
		for(GradingUsingComparable temp: tempList) {
			
			System.out.println(temp.getMarks()+" "+temp.getGrade());
			
		}
		
	}

	
}
