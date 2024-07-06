package Overloading;
/**
 * 1. Write two methods with the same name but different number of parameters of same type 
 * and call the methods from main method
 * 2. Write two methods with the same name but different number of parameters of different 
 * data type and call the methods from main method 
 * 3. Write two methods with the same name and same number of parameters of same type 
 * and call from main method
 * 4. Write two methods with the same name and same number of parameters of different 
 * type and call from main method
 * 5. Write two methods with the same name, number of parameters and data type but 
 * different return Type 
 */
public class MethodOverloading {
	// methods with the same name but different number of parameters of same type
	void greet(String name) {
		System.out.println("Good morning " + name);
	}
	void greet(String name, String surname) {
		System.out.println("Good morning " + name + " " + surname);
	}
	// methods with the same name but different number of parameters of different type
	void message(String name) {
		System.out.println("Good morning " + name);
	}
	void message(int age , String surname) {
		System.out.println("Good morning " + "age: " + age + " " + surname);
	}
	// methods with the same name and same number of parameters of different type
	void show(String a) {
		System.out.println(a);
	} 
	void show(int b) {
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading n = new MethodOverloading();
		// different number of parameters of same type
		n.greet("af");
		n.greet("af", "m");
		// different number of parameters of different type
		n.message("df");
		n.message(23, "san");
		n.show(3);
		n.show("hj");
	}

	/*
	 * -- we cant create more than one method with same order, number of parameter and same data types
	 * -- Method with same signature and different return type cannot be overloaded
	 */
}
