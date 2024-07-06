package Interfaces;
/**
 * 5. Create two interfaces with the same method (same signature) in both the interfaces. 
 * Implement these two interfaces in one class. Call the method. 
 */
public class TwoInterfaceSameMethod implements Interface41, Interface42 {
	@Override public void play(int a) {
		System.out.println("Playing " + a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoInterfaceSameMethod a  = new TwoInterfaceSameMethod();
		a.play(3);
	}

}

interface Interface41 {
	void play(int a);
}

interface Interface42 {
	void play(int a);
}