package Strings;
/**
 * 1. Different ways creating a string 
 * 2. Concatenating two strings using + operator
 * 3. Finding the length of the string  
 * 4. Extract a string using Substring 
 * 5. Searching in strings using indexOf() 
 * 6. Matching a String Against a Regular Expression With matches() 
 * 7. Comparing strings using the methods equals(),  
 * 8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo() 
 * 9. Trimming strings with trim() 
 * 10. Replacing characters in strings with replace() 
 * 11. Splitting strings with split() 
 * 12. Converting Numbers to Strings with valueOf() 
 * 13. Converting integer objects to Strings 
 * 14. Converting to uppercase and lowercase 
 */
public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Different ways creating a string 
		String s="test"; 
		String a = new String("sk");
		char[] n = {'a', 'f'};
		String g = new String(n);
		System.out.println("s: " + s);
		System.out.println("a: " + a);
		System.out.println("g: " + g);
		// Concatenating two strings using + operator 
		String str1 = "Hello ";
		String str2 = "World";
		String str3 = "Hell";
		System.out.println(str1 + str2);
		// Finding the length of the string  
		System.out.println(str1.length());
		// Extract a string using Substring 
		System.out.println(str2.substring(2, 4));
		// Searching in strings using indexOf() 
		System.out.println(str1.indexOf("lo"));
		// Matching a String Against a Regular Expression With matches()
		System.out.println(str1.matches("^H(.*)"));
		// equalsIgnoreCase(), startsWith(), endsWith() and compareTo() 
		System.out.println(str2.equalsIgnoreCase("world"));
		System.out.println(str1.startsWith("He"));
		System.out.println(str2.endsWith("ld"));
		System.out.println(str1.compareTo(str3));
		// Trimming strings with trim() 
		System.out.println(str1.trim());
		// Replacing characters in strings with replace() 
		System.out.println(str1.replace('l', 'r'));
		// Splitting strings with split() 
		String fr = "banana, apple, mango";
		String ds[] = fr.split(",", 0);
		for(String i: ds) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		// Converting Numbers to Strings with valueOf() 
		int numb = 23;
		System.out.println(String.valueOf(numb));
		// Converting integer objects to Strings 
		Integer num = 2;
		System.out.println(String.valueOf(num));
		// Converting to uppercase and lowercase 
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
	}

}
