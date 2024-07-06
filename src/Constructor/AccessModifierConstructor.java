package Constructor;
/**
 * 3. Apply private, public, protected and default access modifiers to the constructor
 * 4. Write constructors with return type int and String 
 * 5. Try to call the constructor multiple times with the same object 
 */
public class AccessModifierConstructor {
	public AccessModifierConstructor() {
		this(2);
		System.out.println("This is default constructor");
	}
	private AccessModifierConstructor(int age) {
		this("afra");
		System.out.println(age);
	}
	protected AccessModifierConstructor(String name) {
		this(1.2f);
		System.out.println(name);
		
	}
	AccessModifierConstructor(float amount) {
		System.out.println(amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AccessModifierConstructor();
	}
	// Constructors dont have return type

}
