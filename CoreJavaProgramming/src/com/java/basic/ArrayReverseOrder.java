package com.java.basic;

public class ArrayReverseOrder {

	public static void main(String[] args) {
		int intArray[] = {12, 64, 23, 35, 2, 67, 9, 11};
		
		//for(int i = 0; i < intArray.length; i++);
		
		for(int index = intArray.length-1; index >=0 ; index--)
		{
			System.out.println(intArray[index]);
		}
	}

}
