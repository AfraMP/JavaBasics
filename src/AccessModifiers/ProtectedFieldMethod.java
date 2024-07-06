package AccessModifiers;
/**
 * 3. Create a class with PROTECTED fields and methods. Access these fields and methods 
 * from any other class in the same package. 
 */
class Protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedFieldMethod p = new ProtectedFieldMethod();
		// Access these fields and method from class in the same package.
		System.out.println(p.a);
		p.message();
	}

}

public class ProtectedFieldMethod {
	protected int a = 9;
	protected void message() {
		System.out.println("Good morning");
	}
}