package Interfaces;
/**
 * 6. Create an interface with a default method and implement it in a class. Do not provide 
 * implementation to the default method and call the method.
 */
public class InterfaceDefaultMethod implements Inter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDefaultMethod i = new InterfaceDefaultMethod();
		// invoking the default method
		i.message();

	}
}

interface Inter {
	// default method
	default void message() {
		System.out.println("Hey");
	}
}