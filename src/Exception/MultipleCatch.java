package Exception;
import java.lang.ArithmeticException;
import java.lang.NumberFormatException;
/**
 * 4. Write a program with multiple catch blocks 
 * 7. Write a program with finally block
 */
public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try  {
			int a = 2 / 0;
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic");
		} catch(NumberFormatException e) {
			System.out.println("Numeric");
		} catch(Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally");
		}
	}

}
