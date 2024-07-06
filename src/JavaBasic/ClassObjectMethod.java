package JavaBasic; // This is package

/**
 *  1. How to create a class, object, method and its signature
 *  
 *  A class acts as a blue print to create an object.
 *  Object is an instance of type class.
 *  Method is a set of code written to perform a task when the method is invoked.
 *  
 */

// class is created using keyword 'class'
public class ClassObjectMethod {

	/*
	 * The method below returns String and takes one parameter String
	 */
	public String greet(String name) {
		return ("Good morning! " + name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating Object of type ClassObjectMethod
		ClassObjectMethod obj = new ClassObjectMethod();
		// Invoking the method
		System.out.print(obj.greet("Neha"));
	}

}

