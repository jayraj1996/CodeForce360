package com.codefore360.collection_1;

import java.util.ArrayList;

public class ArrayCreation {
	
	public void doArrayCreation() {
		
		int number = 1;
		float floatNumber = (float) 0.3;
		double doubleNumber = 2.6;
		String word = "Person";
		
		Integer num = 2;
		Float floatNum = (float) 2.4;
		Double doubleNum = 3.0;
		

		Object[] temp = new Object[7];
		
		temp[0]=number;
		temp[1]=floatNumber;
		temp[2]=doubleNumber;
		temp[3]=word;
		temp[4]=num;
		temp[5]=floatNum;
		temp[6]=doubleNum;
		
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		
		
		
	}
    
	
	
	
	

}
