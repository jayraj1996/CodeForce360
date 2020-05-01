package com.codefore360.collection_1;

import java.util.ArrayList;
import java.util.List;

public class MainCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayCreation arrayCreation = new ArrayCreation();
		CollectionImplementation collectionImplementation = new CollectionImplementation();
		GradingUsingComparable comparable = new GradingUsingComparable();
		MarksUsingComparator comparator = new MarksUsingComparator();
		ForEachAndStream forEachAndStream = new ForEachAndStream();
		forEachAndStream.doForEachImplementation();
		forEachAndStream.doStreamImplementation();
		comparator.doComparatorImplementation();
		comparable.doComparableImplementation();
		System.out.println(comparable.hashCode());
		System.out.println(comparable.equals(comparator));
		
		arrayCreation.doArrayCreation();
		collectionImplementation.doListImplementation();
		collectionImplementation.doSetImplementation();
		collectionImplementation.doMapImplementation();
		
		
		
	}

}
