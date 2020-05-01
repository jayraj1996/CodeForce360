package com.codefore360.collection_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;




public class CollectionImplementation {
	
	public void doListImplementation() {
		
		List tempList = new ArrayList();
		
		tempList.add(1);
		tempList.add("String");
		tempList.add(2.0);
		
		Iterator iterator = tempList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
	public void doSetImplementation() {
		
		Set tempSet = new HashSet();
		
		tempSet.add(2);
		tempSet.add("Name");
		tempSet.add(8.00);
		tempSet.add(null);
		
		
		Iterator iterator = tempSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
	public void doMapImplementation() {
		
		Map tempMap = new HashMap();
		
		tempMap.put(1, "hello");
		tempMap.put("hello",1);
		tempMap.put(null,null);
		tempMap.put(null,4);
		tempMap.put(null,5);
		
		Iterator iterator = tempMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
