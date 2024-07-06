package Interfaces;
/**
 * 4. Create two interfaces with one method each. Implement these two interfaces in one class.  
 */
public class TwoInterfaceOneMethod implements Interfaces1, Interfaces2 {
	@Override public void play() {
		System.out.println("Playing");
	}
	@Override public void stop() {
		System.out.println("stop");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoInterfaceOneMethod i = new TwoInterfaceOneMethod();
		i.play();
		i.stop();
	}

}

interface Interfaces1 {
	void play();
}

interface Interfaces2 {
	void stop();
}