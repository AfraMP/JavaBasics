package Interfaces;
/**
 * 1. Create an interface with only one method and implement it in a class. Call the method implemented. 
 */
public class InterfaceOneMethod implements Interface1 {
	// Implementation of Interface1 method
	@Override public void showMessage() {
		System.out.println("Hey");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceOneMethod i = new InterfaceOneMethod();
		// invoking the 
		i.showMessage();

	}

}

interface Interface1 {
	void showMessage();
}