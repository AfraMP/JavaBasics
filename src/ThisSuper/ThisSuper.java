package ThisSuper;
/**
 * 1. Print the fields/instance members of the current class using this and without using object 
 * 2. Print the fields/instance members of the parent class using super
 * 3. Call constructor of the current class using this() 
 * 4. Call argument constructor of current class using this() 
 * 5. Call constructor of the parent class using super()
 * 6. Use this() and super() in methods not in constructors 
 */
public class ThisSuper {
	int a = 0;
	String b = "";
	 void message() {
		System.out.println(this.a);
	}
	 ThisSuper() {
		 this(1, "af");
	 }
	 ThisSuper(int a, String b) {
		 this.a = a;
		 this.b = b;
		 System.out.println(this.b);
		 System.out.println(this.a);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisSuper t = new ThisSuper();
		Child c = new Child();
		c.method1();

	}

}

class Child extends ThisSuper {
	int ss = 9;
	Child() {
		// Calling parent constructor in child
		super();
		// Print the fields/instance members of the parent class using super
		System.out.println(super.b);
	}
	// Use this() and super() in methods not in constructors
	void method1() {
		System.out.println(this.ss );
		System.out.println(super.b);
		System.out.println(this.a);
	}
}