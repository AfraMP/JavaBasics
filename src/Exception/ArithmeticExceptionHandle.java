package Exception;
import java.lang.ArithmeticException;
public class ArithmeticExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a  = 5 / 0;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
