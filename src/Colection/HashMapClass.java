package Colection;
import java.util.HashMap;
/**
 * 2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
 * Insert a Key value mapping into the map 
 * Fetch the value of a Key
 * Create a clone/copy of HashMap 
 * Check if the given Key is in the Map 
 * Check if the value is in the Map
 * Check if the map is empty 
 * Print the size of the Map to the console
 * Print all the Keys of the map to the console 
 * Remove a specific Key-value pair
 * Copy all the elements of the Map to another Map 
 */
import java.util.Map;
public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "ajay");
		hash.put(2, "ramesh");
		hash.put(3, "nihal");
		hash.put(4, "ram");
		hash.put(5, "sharam");
		hash.put(6, "venu");
		hash.put(7, "varun");
		hash.put(8, "geetha");
		hash.put(9, "swathi");
		hash.put(10, "aliya");
		// Insert a Key value mapping into the map 
		System.out.println(hash);
		// Fetch the value of a Key
		System.out.println(hash.get(2));
		//Create a clone/copy of HashMap 
		Object hash2 = hash.clone();
		System.out.println(hash2);
		// Check if the given Key is in the Map 
		System.out.println(hash.containsKey(6));
		// Check if the value is in the Map 
		System.out.println(hash.containsValue("swathi"));
		// Check if the map is empty
		System.out.println(hash.isEmpty());
		// Print the size of the Map to the console
		System.out.println(hash.size());
		// Print all the Keys of the map to the console 
		System.out.println(hash.keySet());
		// Remove a specific Key-value pair
		hash.remove(2);
		System.out.println(hash);
		// Copy all the elements of the Map to another Map 
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.putAll(hash);
		System.out.println(h);
	}

}
