package Colection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				HashSet<String> hash = new HashSet<String>();
				for(int i = 1; i < 11; i++) {
					hash.add(String.valueOf(i));
				}
				hash.add("1");
				// Insert a Key value mapping into the map 
				System.out.println(hash);
				//Create a clone/copy of HashMap 
				Object hash2 = hash.clone();
				System.out.println(hash2);
				// Check if the given element is in the Set 
				System.out.println(hash.contains("6"));
				// Check if the set is empty
				System.out.println(hash.isEmpty());
				// Print the size of the set to the console
				System.out.println(hash.size());
				// Remove a value at specific index
				hash.remove("2");
				Iterator<String> it = hash.iterator();
				while(it.hasNext()) {
				System.out.print(it.next());
				}
				
	}

}
