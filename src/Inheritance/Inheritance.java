package Inheritance;
/**
 * 1. A, B and C are classes 
 * 2. A is a super class. B is a sub class of A. C is a sub class of B.  
 * 3. Create three methods in each class, 2 methods are specific to each class and third 
 * method (override method) should be in all three Classes A, B and C
 * 4. Create a class with main method. Create an object for each class A, B and C in main 
 * method and call every method of each class using its own object/instance. 
 * 5. Call an overridden method with super class reference to B and C class’s objects 
 * 6. Runtime Polymorphism with Data Members/Instance variables, Repeat the above 
 * process only for data members
 */
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();
		a.showMessage();
		a.getLuckyNumber();
		a.show();
		b.start();
		b.stop();
		b.showMessage();
		c.play();
		c.invoke();
		c.showMessage();
		
		// Call an overridden method with super class reference to B and C class’s objects 
		A o;
		o =new B();
		o.showMessage();
		o = new C();
		o.showMessage();
		
		/*
		 * Runtime Polymorphism with Data Members/Instance variables, Repeat the above process only for data members
		 * -- Runtime polymorphism is method overriding which is possible only in methods not possible in variables
		 */
		
	}

}
class A {
	void showMessage()  {
		System.out.println("Message: Hey this is A");
	}
	void getLuckyNumber() {
		System.out.println("Your lucky number is 3");
	}
	void show() {
		System.out.println("Hello");
	}
}

class B extends A {
	
	void stop() {
		System.out.println("Stop signal");
	}
	void start() {
		System.out.println("Start signal");
	}
	// Override function
	@Override void showMessage()  {
		System.out.println("Message: Hey this is B");
	}
}

class C extends B{
	void play() {
		System.out.println("It playing");
	}
	void invoke() {
		System.out.println("Invoked");
	}
	// Override function
	@Override void showMessage()  {
		System.out.println("Message: Hey this is C");
	}
}