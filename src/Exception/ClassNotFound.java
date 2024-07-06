package Exception;
/**
 * 10. Write a program to generate ClassNotFoundException 
 */
import java.lang.ClassNotFoundException;
public class ClassNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("src.AccessModifiers.AccessModifiers");
            ClassLoader.getSystemClassLoader().loadClass("src.AccessModifiers.AccessModifiers");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
