package Abstract;
/**
 * 1. Create an abstract class with abstract and non-abstract methods. 
 * 2. Create a sub class for an abstract class. Create an object in the child class for the  
 * abstract class and access the non-abstract methods 
 * 3. Create an instance for the child class in child class and call abstract methods 
 * 4. Create an instance for the child class in child class and call non-abstract methods
 * 
 */

abstract class User {
	// Abstract method can only be declared. and can be defined from the derived class
	abstract void message();
	// Non abstract method
	void age() {
		System.out.println("Age is 34");
	}
}

// Creating sub class for abstract class 
class Abstract extends User {
	
	void message() {
		// Accessing the non abstract method from base class
		System.out.println("Message method in abstract class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create an abstract class with abstract and non-abstract methods. 
		// -- We cannot create an instance of abstract class. Abstract classes can only be extended or derived
		User a = new Abstract();
		a.age();
		a.message();
		// Create an instance for the child class in child class and call abstract & non abstract methods 
		Abstract u = new Abstract();
		u.message();
		u.age();
		
//		Teacher t = new Teacher();
		

	}
	
}