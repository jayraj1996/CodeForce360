package com.codefore360.collection_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ForEachAndStream {
	
	public void doForEachImplementation() {
		
		List<String> tempList = new ArrayList<String>();
		tempList.add("Hello");
		tempList.add("Everyone");
		tempList.add("How are you?");
		tempList.add("Thanks");
		
		for(String temp: tempList) {
			
			System.out.println(temp);
		}
		
	}
	
	public void doStreamImplementation() {
		
		Stream<Integer> stream = Stream.of(2,4,6,8,10,12);
		
		stream.forEach(temp->System.out.println(temp+" "));
	}

}
