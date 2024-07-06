package Exception;
/**
 *  3.Write a method which throws exception, Call that method in main class without try block
 */
public class ThrowExceptionMethod {
	public static void message()  throws RuntimeException {
		throw new RuntimeException("System issue");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		message();
	}

}
