package Interfaces;
/**
 * 7. Create an interface and inherit it from the other interface. 
 */
public class InheritInterface implements B{
	@Override public void a() {
		System.out.println("Calling a");
	}
	@Override public void b() {
		System.out.println("Calling b");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritInterface i = new InheritInterface();
		i.a();
		i.b();
	}

}

interface A {
	void a();
}

interface B extends A {
	void b();
}