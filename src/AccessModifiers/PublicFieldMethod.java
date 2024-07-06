package AccessModifiers;
/**
 * 4. Create a class with PUBLIC fields and methods. 
 * Access the public methods and fields from any class in the same package or different package. 
 */
public class PublicFieldMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Public p = new Public();
		System.out.println(p.a);
		p.showMessage();
	}

}

class Public {
	public int a  = 9;
	public void showMessage() {
		System.out.println("HEY");
	}
}