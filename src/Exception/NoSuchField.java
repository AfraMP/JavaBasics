package Exception;
import java.lang.ClassNotFoundException;
import java.lang.reflect.Method;
/**
 * 13. Write a program to generate NoSuchFieldException
 */
public class NoSuchField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c = Class.forName("Exception.Example");
			c.getDeclaredField("d");
			/*
			 *  Class doesnt have a field d so it throws 
			 */
		} catch( NoSuchFieldException | ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}

class Example {
	int c = 5;
	void a() {
		System.out.println("dsj");
	}
}