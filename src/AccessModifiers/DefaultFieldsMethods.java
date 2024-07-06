package AccessModifiers;
/**
 * 2. Create a class with DEFAULT fields and methods. Access these fields and methods 
 * from any other class in the same package
 */
public class DefaultFieldsMethods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default d = new Default();
		// Accessing default fields and methods
		System.out.println(d.a + d.b);
		d.message();
	}

}

class Default {
	int a = 5;
	int b = 4;
	void message() {
		System.out.println("Hello");
	}
}