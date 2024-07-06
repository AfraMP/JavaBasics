package AccessModifiers;
/**
 * 1. Create a class with PRIVATE fields, private method and a main method. Print the fields 
 * in main method. Call the private method in main method. 
 * Create a sub class and try to access the private fields and methods from sub class. 
 */
public class AccessModifiers {
	private int a = 2;
	private int b = 56;
	private void showMessage() {
		System.out.println("This is printed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers am = new AccessModifiers();
		// private fields printed
		System.out.println("a : "+ am.a);
		System.out.println("b : "+ am.b);
		// private method called
		am.showMessage();
		// The private members can be used only inside a class so the we cannot access the members in the sub class.
	}

}

