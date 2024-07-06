package Exception;
/**
 * 6. Write a program to create your own exception
 */
class InvalidInput extends Exception {
	InvalidInput(String s) {
		super(s);
	}
}
public class OwnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		try {
			
			if(a < 40) {
				throw new InvalidInput("Invalid input please check");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
