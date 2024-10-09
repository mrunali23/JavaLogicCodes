package com.practice.array;

import java.util.HashMap;
import java.util.Map;

//Java program to check if two arrays contain the same elements

public class NewProblem {

	public static void main(String[] args) {
		Integer[] arr1= {10,60,30,40};
		Integer[] arr2= {10,40,30,60};
		
		String[] array3 = {"apple", "banana", "orange"};
        String[] array4 = {"orange", "banana", "apple"};

		
		System.out.println(checktwoarrays(arr1, arr2));
		
	}
	
	
//To make a class generic before return type <T>
	
	public static <T>boolean checktwoarrays(T[] arr1, T[] arr2) {
		
		if(arr1.length !=arr2.length) {
			return false;
		}
		
		Map<T, Integer> elementcountmap = new HashMap<>();
		
		for(T element:arr1) {
			elementcountmap.put(element, elementcountmap.getOrDefault(element, 0)+1);
		}
	
		for(T element:arr2) {
			if(!elementcountmap.containsKey(element)|| elementcountmap.get(element)==0) {
				return false;
			}
			elementcountmap.put(element, elementcountmap.getOrDefault(element, 0)+1);
		}
		
		
		return true;
		
		
		
		
		
		
//		if(arr1.length !=arr2.length) {
//			return false;
//		}
//		else {
//			int size= arr1.length; 
//			for(int i=0;i<size;i++) {
//				if(arr1[i]!=arr2[i]) {
//					return false;
//				}
//			}
//		}
//		return true;
	}
}

/*
 * 
 * The line of code:

java
Copy code
elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
is used to update a HashMap (elementCountMap) that tracks the count of occurrences of each element. Here's an explanation of how it works:

elementCountMap.getOrDefault(element, 0):

This method checks if the map (elementCountMap) contains the given element as a key.
If the element is found, it returns the current value (the count of how many times this element has been encountered).
If the element is not found in the map, it returns the default value (0 in this case). This means that when the element is encountered for the first time, the count starts from 0.
+ 1:

Once the current count (or 0 if it's the first occurrence) is retrieved, +1 increments the count to reflect that this element has been encountered one more time.
elementCountMap.put(element, ...):

This method updates the map by storing the element as a key, and the updated count (getOrDefault(element, 0) + 1) as the corresponding value.
If the element is already present in the map, its value is updated (incremented).
If the element is not already present, the put method adds it to the map with the updated value.
 * 
 * 
 * 
 * */

