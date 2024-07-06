package Exception;
/**
 * 17. Write a program to generate StringIndexOutOfBoundsException
 */
public class StringIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "jfd";
		try {
			a.charAt(5);
			/*
			 * Exception thrown when the used index exceeds the length of the string
			 */
		} catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
