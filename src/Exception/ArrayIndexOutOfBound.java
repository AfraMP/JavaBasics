package Exception;
import java.lang.ArrayIndexOutOfBoundsException;
/**
 * 9. Write a program to generate ArrayIndexOutOfBoundException
 */
public class ArrayIndexOutOfBound {
	public static void main(String[] args) {
	try {
		int a[] = new int[3];
		a[3] = 0;
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
	}
}
