package Constructor;
/**
 * 1. Write a class with a default constructor, one argument constructor and two argument 
 * constructors. Instantiate the class to call all the constructors of that class from a main class
 * 2. Call the constructors(both default and argument constructors) of super class from a child 
 * class 
 */
public class Constructor {
	String name;
	int age;
	// default constructor
	Constructor() {
		System.out.println("This is constructor");
	}
	// one argument constructor
	Constructor(String name) {
		this.name = name;
		System.out.println("My name is " + this.name );
	}
	// 2 argument constructor
	Constructor(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("My name is " + this.name + " . My age is " + this.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructor();
		new Constructor("afra");
		new Constructor("afra", 2);
		// Constructor of super class 
		new ChildClass();
		new Constructor("sanafer");
		new Constructor("sanafer", 27);
	}

}

class ChildClass extends Constructor {
	ChildClass() {
		super();
	}
	ChildClass(String name) {
		super(name);
	}
	ChildClass(String name, int age) {
		super(name, age);
	}
}