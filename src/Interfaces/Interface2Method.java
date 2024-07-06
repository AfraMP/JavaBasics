package Interfaces;
/**
 * 2. Create an interface with two methods, but implement only one in a class. Call the method implemented.
 * 3. Use Interface instances to call the implemented method in the implemented class 
 */
public class Interface2Method implements Interface2 {
	@Override public void play() {
		System.out.println("Playing");
	}
	@Override public void stop() {
		System.out.println("stop");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2Method i = new Interface2Method();
		i.play();
		i.stop();
		Interface2 inn = new Interface2Method();
		inn.play();
	}

}

interface Interface2 {
	void play();
	void stop();
}