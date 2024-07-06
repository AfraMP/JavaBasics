package Colection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to 
 * ArrayList and perform the below operations 
 * Add an element to the ArrayList 
 * Iterate through the ArrayList by using Iterator object 
 * Add an element at a specific index 
 * Remove an element from the ArrayList, Remove at an index 
 * Get an element at a particular index 
 * Check the given element is present in the ArrayList 
 * Remove all elements of the ArrayList
 */
public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		for(int i = 1; i < 11; i++) {
			arr.add(String.valueOf(i));
		}
		// Iterate through the ArrayList by using Iterator object 
		Iterator<String> i = arr.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
		System.out.println();
		// Add an element at a specific index 
		arr.add(3, "apple");
		// Remove an element from the ArrayList, Remove at an index 
		arr.remove(5);
		// Update the element at a specific index 
		arr.set(3, "banana");
		// Check the element is present at a particular index
		System.out.println(arr.indexOf("banana"));
		
		// Get an element at a particular index 
		System.out.println(arr.get(3));
		
		// Find out the size of the ArrayList 
		System.out.println(arr.size());
		
		// Check the given element is present in the ArrayList 
		System.out.println(arr.contains("banana"));
		
		// Remove all elements of the ArrayList
		arr.clear();

	}

}
