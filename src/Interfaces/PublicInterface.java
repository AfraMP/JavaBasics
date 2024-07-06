package Interfaces;
/**
 * 8. Create a PUBLIC interface with fields and methods, fields should have values assigned. 
 * Implement this interface to some class and print the values of the interface fields  and 
 * call the interface methods 
 */
class PublicInterface1 implements PublicInterface {
	@Override public void message() {
		System.out.println("Calling message");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicInterface1 p = new PublicInterface1();
//		System.out.println(a);
		p.message();
	}

}

public interface PublicInterface {
	int a = 0;
	public void message();
}